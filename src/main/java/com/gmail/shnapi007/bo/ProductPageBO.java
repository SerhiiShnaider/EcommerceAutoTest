package com.gmail.shnapi007.bo;

import com.gmail.shnapi007.pages.ProductPage;

public class ProductPageBO extends BaseBO {

  private ProductPage productPage = new ProductPage();

  public String pageHeaderValue() {
    highlight(productPage.getPageHeader());
    return productPage.getPageHeaderValue();
  }

  public void switchToGrid() {
    highlight(productPage.getGrid());
    productPage.switchToGrid();
  }

  public void switchToList() {
    highlight(productPage.getList());
    productPage.switchToList();
  }

  public void register() {
    highlight(productPage.getRegister());
    productPage.register();
  }

  public void logIn() {
    highlight(productPage.getLogIn());
    productPage.logIn();
  }

}
