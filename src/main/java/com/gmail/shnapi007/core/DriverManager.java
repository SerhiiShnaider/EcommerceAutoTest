package com.gmail.shnapi007.core;

import com.gmail.shnapi007.common.Config;
import com.gmail.shnapi007.core.factory.DriverData;
import com.gmail.shnapi007.core.factory.DriverFactory;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class DriverManager {

  protected final static Logger logger = Logger.getLogger(DriverManager.class);

  private static DriverData driverData = DriverFactory.gerDriverData(Config.getProperty("driver"));

  static {
    System.setProperty(driverData.driverName(), driverData.driverRef());
  }

  private static ThreadLocal<WebDriver> instance = ThreadLocal.withInitial(() -> {
    WebDriver driver = driverData.driver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    return driver;
  });

  private DriverManager() {
  }

  public static WebDriver getDriver() {
    logger.info("Return driver");
    return instance.get();
  }

  public static void close() {
    logger.info("Close driver");
    instance.get().close();
    instance.get().quit();
  }
}

