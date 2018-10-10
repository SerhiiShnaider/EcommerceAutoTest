package com.gmail.shnapi007.core.capabilityprovider;

import com.gmail.shnapi007.core.capabilityprovider.impl.PrivateCapability;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilityProvider {

  enum CapabilitiesEnum {
    PRIVATE {
      @Override
      DesiredCapabilities getAction() {
        return new PrivateCapability().getCapabilities();
      }

      @Override
      FirefoxOptions getFirefoxAction() {
        return new PrivateCapability().getFirefoxCapabilities();
      }
    };

    abstract DesiredCapabilities getAction();

    abstract FirefoxOptions getFirefoxAction();
  }

  public DesiredCapabilities getCapability(String capabilityName) {
    if (capabilityName.isEmpty()) {
      return null;
    }
    return CapabilitiesEnum.valueOf(capabilityName.toUpperCase()).getAction();
  }

  public FirefoxOptions getFirefoxCapability(String capabilityName) {
    if (capabilityName.isEmpty()) {
      return null;
    }
    return CapabilitiesEnum.valueOf(capabilityName.toUpperCase()).getFirefoxAction();
  }
}
