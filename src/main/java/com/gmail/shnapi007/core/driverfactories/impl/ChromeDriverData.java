package com.gmail.shnapi007.core.driverfactories.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeDriverData extends AbstractDriverData {

  public ChromeDriverData() {
  }

  public ChromeDriverData(DesiredCapabilities driverCapability) {
    super(driverCapability);
  }

  @Override
  public String driverName() {
    logger.info("Get driver name");
    return "webdriver.chrome.driver";
  }

  @Override
  public String driverRef() {
    logger.info("Get driver location");
    return "src/main/resources/drivers/chromedriver.exe";
  }

  @Override
  public WebDriver driver() {
    logger.info("Create chrome driver instance");
    if (driverCapability != null) {
      return new ChromeDriver(driverCapability);
    }
    return new ChromeDriver();
  }
}
