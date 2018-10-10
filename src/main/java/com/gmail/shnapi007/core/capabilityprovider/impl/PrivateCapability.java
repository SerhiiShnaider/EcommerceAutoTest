package com.gmail.shnapi007.core.capabilityprovider.impl;

import com.gmail.shnapi007.core.capabilityprovider.Capability;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PrivateCapability extends Capability {

  private FirefoxOptions firefoxOptions;

  @Override
  public DesiredCapabilities getCapabilities() {
    configureCapabilities();
    return capabilities;
  }

  @Override
  public FirefoxOptions getFirefoxCapabilities() {
    configureCapabilities();
    return firefoxOptions;
  }

  private void configureCapabilities() {
    if (driverName.equalsIgnoreCase("chrome")) {
      capabilities = DesiredCapabilities.chrome();
      ChromeOptions options = new ChromeOptions();
      options.addArguments("incognito");
      capabilities.setCapability(ChromeOptions.CAPABILITY, options);
    } else if (driverName.equalsIgnoreCase("ie")) {
      capabilities = DesiredCapabilities.internetExplorer();
      capabilities
          .setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
              true);
      capabilities.setCapability(InternetExplorerDriver.FORCE_CREATE_PROCESS, true);
      capabilities.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
    } else if (driverName.equalsIgnoreCase("firefox")) {
      firefoxOptions = new FirefoxOptions();
      firefoxOptions.addArguments("-private");
    }
  }
}
