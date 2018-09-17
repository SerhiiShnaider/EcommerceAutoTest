package com.gmail.shnapi007.core.factory.impl;

import com.gmail.shnapi007.core.factory.DriverData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InternetExplorerDriverData implements DriverData {

  @Override
  public String driverName() {
    return "webdriver.ie.driver";
  }

  @Override
  public String driverRef() {
    return "src/main/resources/drivers/IEDriverServer.exe";
  }

  @Override
  public WebDriver driver() {
    DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
    capabilities
        .setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
            true);
    return new InternetExplorerDriver(capabilities);
  }
}
