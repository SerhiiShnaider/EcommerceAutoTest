package com.gmail.shnapi007.core.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Product extends Element {

  public Product(WebElement webElement) {
    super(webElement);
  }

  public String getProductName() {
    return webElement.findElement(By.className("prodtitle")).getText();
  }

  public String getPrice() {
    return webElement.findElement(By.className("currentprice")).getText();
  }

  public String getDescription() {
    return webElement.findElement(By.className("wpsc_description")).getText();
  }

  public void addToCart() {
    webElement.findElement(By.className("wpsc_buy_button")).click();
  }

}
