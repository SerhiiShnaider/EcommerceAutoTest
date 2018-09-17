package com.gmail.shnapi007.core.factory;

import com.gmail.shnapi007.core.factory.impl.ChromeDriverData;
import com.gmail.shnapi007.core.factory.impl.FirefoxDriverData;
import com.gmail.shnapi007.core.factory.impl.InternetExplorerDriverData;

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
