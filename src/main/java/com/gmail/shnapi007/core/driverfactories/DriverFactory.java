package com.gmail.shnapi007.core.driverfactories;

import com.gmail.shnapi007.common.Config;
import com.gmail.shnapi007.core.capabilityprovider.CapabilityProvider;
import com.gmail.shnapi007.core.driverfactories.impl.ChromeDriverData;
import com.gmail.shnapi007.core.driverfactories.impl.FirefoxDriverData;
import com.gmail.shnapi007.core.driverfactories.impl.InternetExplorerDriverData;

public class DriverFactory {

  private static CapabilityProvider capabilityProvider = new CapabilityProvider();

  public static DriverData gerDriverData(String driverName) {
    DriverData driverData = null;
    if (driverName.equalsIgnoreCase("chrome")) {
      driverData = new ChromeDriverData(
          capabilityProvider.getCapability(Config.getProperty("capabilities")));
    } else if (driverName.equalsIgnoreCase("ie")) {
      driverData = new InternetExplorerDriverData(
          capabilityProvider.getCapability(Config.getProperty("capabilities")));
    } else if (driverName.equalsIgnoreCase("firefox")) {
      driverData = new FirefoxDriverData(
          capabilityProvider.getFirefoxCapability(Config.getProperty("capabilities")));
    }
    return driverData;
  }

}
