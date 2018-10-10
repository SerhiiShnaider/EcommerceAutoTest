package com.gmail.shnapi007.core.capabilityprovider;

import com.gmail.shnapi007.common.Config;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public abstract class Capability {

  protected DesiredCapabilities capabilities;
  protected String driverName = Config.getProperty("driver");

  public DesiredCapabilities getCapabilities() {
    return capabilities;
  }

  public abstract FirefoxOptions getFirefoxCapabilities();
}
