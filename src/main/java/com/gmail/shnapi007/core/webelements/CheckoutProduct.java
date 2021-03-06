package com.gmail.shnapi007.core.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckoutProduct extends Element {

  public CheckoutProduct(WebElement webElement) {
    super(webElement);
  }

  public String getProductName() {
    return webElement.findElement(By.className("wpsc_product_name")).getText();
  }

  public double getPrice() {
    return Double.parseDouble(
        webElement.findElement(By.className("pricedisplay")).getText().replaceAll("\\$", ""));
  }

  public double getTotalPrice() {
    return Double.parseDouble(webElement.findElement(By.xpath(
        "//*[@class=\"checkout_cart\"]//tr[contains(@class,'product_row_')]/td/span[@class=\"pricedisplay\"]/span[@class=\"pricedisplay\"]"))
        .getText().replaceAll("\\$", ""));
  }

  public void remove() {
    webElement.findElement(By.xpath("//*[@class=\"adjustform remove\"]")).getText();
  }
}
