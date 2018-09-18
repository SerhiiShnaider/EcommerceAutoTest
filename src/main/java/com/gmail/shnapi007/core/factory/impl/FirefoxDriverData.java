package com.gmail.shnapi007.core.factory.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverData extends AbstractDriverData {

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
    return new FirefoxDriver();
  }
}
