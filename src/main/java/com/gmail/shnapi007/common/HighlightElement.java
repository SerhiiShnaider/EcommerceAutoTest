package com.gmail.shnapi007.common;

import com.gmail.shnapi007.core.DriverManager;
import com.gmail.shnapi007.core.webelements.Element;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HighlightElement {

  public static void highlightElement(WebElement element) {
    for (int i = 0; i < 2; i++) {
      JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
      js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,
          "border: 3px solid red;");
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
    }
  }

  public static void highlightElement(Element element) {
    for (int i = 0; i < 2; i++) {
      JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
      js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element.getWebElement(),
          "border: 3px solid red;");
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
          element.getWebElement(), "");
    }
  }

}
