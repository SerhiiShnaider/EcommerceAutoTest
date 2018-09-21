package com.gmail.shnapi007.core.driverfactories;

import com.gmail.shnapi007.core.driverfactories.impl.ChromeDriverData;
import com.gmail.shnapi007.core.driverfactories.impl.FirefoxDriverData;
import com.gmail.shnapi007.core.driverfactories.impl.InternetExplorerDriverData;

public class DriverFactory {

  public static DriverData gerDriverData(String driverName) {
    DriverData driverData = null;
    if (driverName.equalsIgnoreCase("chrome")) {
      driverData = new ChromeDriverData();
    }else if (driverName.equalsIgnoreCase("ie")){
      driverData = new InternetExplorerDriverData();
    }else if (driverName.equalsIgnoreCase("firefox")){
      driverData = new FirefoxDriverData();
    }
    return driverData;
  }

}
