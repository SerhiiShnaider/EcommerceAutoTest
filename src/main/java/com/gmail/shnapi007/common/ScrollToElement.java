package com.gmail.shnapi007.common;

import com.gmail.shnapi007.core.DriverManager;
import com.gmail.shnapi007.core.webelements.Element;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ScrollToElement {

  public static void scroll(WebElement element) {
    JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
    js.executeScript("arguments[0].scrollIntoView(true);", element);
  }

  public static void scroll(Element element) {
    JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
    js.executeScript("arguments[0].scrollIntoView(true);", element.getWebElement());
  }

}
