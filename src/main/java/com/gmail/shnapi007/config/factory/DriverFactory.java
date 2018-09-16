package com.gmail.shnapi007.config.factory;

import com.gmail.shnapi007.config.factory.impl.ChromeDriverData;

public class DriverFactory {

  public static DriverData gerDriverData(String s) {
    DriverData driverData = null;
    if (s.equalsIgnoreCase("chrome")) {
      driverData = new ChromeDriverData();
    }
    return driverData;
  }

}
