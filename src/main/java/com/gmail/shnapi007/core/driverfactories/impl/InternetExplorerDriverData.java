package com.gmail.shnapi007.core.driverfactories.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InternetExplorerDriverData extends AbstractDriverData {

  @Override
  public String driverName() {
    logger.info("Get driver name");
    return "webdriver.ie.driver";
  }

  @Override
  public String driverRef() {
    logger.info("Get driver location");
    return "src/main/resources/drivers/IEDriverServer.exe";
  }

  @Override
  public WebDriver driver() {
    logger.info("Create internet explorer driver instance");
    DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
    capabilities
        .setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
            true);
    return new InternetExplorerDriver(capabilities);
  }
}
