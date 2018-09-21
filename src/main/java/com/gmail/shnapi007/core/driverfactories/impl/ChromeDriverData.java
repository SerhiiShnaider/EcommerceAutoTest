package com.gmail.shnapi007.core.driverfactories.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverData extends AbstractDriverData {

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
    return new ChromeDriver();
  }
}
