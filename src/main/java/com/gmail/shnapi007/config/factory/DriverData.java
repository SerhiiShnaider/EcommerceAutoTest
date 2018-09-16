package com.gmail.shnapi007.config.factory;

import org.openqa.selenium.WebDriver;

public interface DriverData {

  String driverName();

  String driverRef();

  WebDriver driver();

}
