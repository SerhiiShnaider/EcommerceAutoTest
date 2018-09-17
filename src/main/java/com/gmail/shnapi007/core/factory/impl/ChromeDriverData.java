package com.gmail.shnapi007.core.factory.impl;

import com.gmail.shnapi007.core.factory.DriverData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverData implements DriverData {

  @Override
  public String driverName() {
    return "webdriver.chrome.driver";
  }

  @Override
  public String driverRef() {
    return "src/main/resources/drivers/chromedriver.exe";
  }

  @Override
  public WebDriver driver() {
    return new ChromeDriver();
  }
}
