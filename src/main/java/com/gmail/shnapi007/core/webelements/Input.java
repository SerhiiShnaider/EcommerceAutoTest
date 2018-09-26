package com.gmail.shnapi007.core.webelements;

import org.openqa.selenium.WebElement;

public class Input extends Element {

  public Input(WebElement webElement) {
    super(webElement);
  }

  public void sendKeys(String query) {
    actions.moveToElement(webElement);
    actions.click();
    actions.sendKeys(query);
    actions.perform();
  }

  public void submit() {
    webElement.submit();
  }
}
