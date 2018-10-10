package com.gmail.shnapi007.core.driverfactories.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxDriverData extends AbstractDriverData {

  private FirefoxOptions firefoxOptions;

  public FirefoxDriverData() {

  }

  public FirefoxDriverData(FirefoxOptions firefoxOptions) {
    this.firefoxOptions = firefoxOptions;
  }

  @Override
  public String driverName() {
    logger.info("Get driver name");
    return "webdriver.gecko.driver";
  }

  @Override
  public String driverRef() {
    logger.info("Get driver location");
    return "src/main/resources/drivers/geckodriver.exe";
  }

  @Override
  public WebDriver driver() {
    logger.info("Create firefox driver instance");

    if (firefoxOptions != null) {
      return new FirefoxDriver(firefoxOptions);
    }
    return new FirefoxDriver();
  }
}
