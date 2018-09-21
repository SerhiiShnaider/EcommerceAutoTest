package com.gmail.shnapi007.core.webelements;

import org.openqa.selenium.WebElement;

public class CheckBox extends Element {

  public CheckBox(WebElement webElement) {
    super(webElement);
  }

  public void setChecked(boolean value) {
    if (value != isChecked()) {
      click();
    }
  }

  public boolean isChecked() {
    return webElement.isSelected();
  }
}
