package com.gmail.shnapi007.config.factory;

import com.gmail.shnapi007.config.factory.impl.ChromeDriverData;
import com.gmail.shnapi007.config.factory.impl.InternetExplorerDriverData;

public class DriverFactory {

  public static DriverData gerDriverData(String driverName) {
    DriverData driverData = null;
    if (driverName.equalsIgnoreCase("chrome")) {
      driverData = new ChromeDriverData();
    }else if (driverName.equalsIgnoreCase("ie")){
      driverData = new InternetExplorerDriverData();
    }
    return driverData;
  }

}
