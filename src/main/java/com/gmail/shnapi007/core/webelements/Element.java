package com.gmail.shnapi007.core.webelements;

import com.gmail.shnapi007.core.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public abstract class Element {

  protected WebElement webElement;

  protected Actions actions = new Actions(DriverManager.getDriver());

  public Element(WebElement webElement) {
    this.webElement = webElement;
  }


  public void click() {
    webElement.click();
  }

  public WebElement getWebElement() {
    return webElement;
  }
}
