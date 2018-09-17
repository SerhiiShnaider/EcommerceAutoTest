package com.gmail.shnapi007.core;

import com.gmail.shnapi007.common.Config;
import com.gmail.shnapi007.core.factory.DriverData;
import com.gmail.shnapi007.core.factory.DriverFactory;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;


public class DriverManager {

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
    return instance.get();
  }

  public static void close() {
    instance.get().close();
    instance.get().quit();
  }
}

