package com.gmail.shnapi007.config.factory.impl;

import com.gmail.shnapi007.config.factory.DriverData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverData implements DriverData {

  @Override
  public String driverName() {
    return "webdriver.gecko.driver";
  }

  @Override
  public String driverRef() {
    return "src/main/resources/drivers/geckodriver.exe";
  }

  @Override
  public WebDriver driver() {
    return new FirefoxDriver();
  }
}
