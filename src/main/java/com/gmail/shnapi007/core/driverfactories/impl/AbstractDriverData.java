package com.gmail.shnapi007.core.driverfactories.impl;

import com.gmail.shnapi007.core.driverfactories.DriverData;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

public abstract class AbstractDriverData implements DriverData {

  protected DesiredCapabilities driverCapability = null;

  public AbstractDriverData() {
  }

  public AbstractDriverData(DesiredCapabilities driverCapability) {
    this.driverCapability = driverCapability;
  }

  protected final Logger logger = Logger.getLogger(AbstractDriverData.class);

}
