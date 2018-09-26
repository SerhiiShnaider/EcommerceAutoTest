package com.gmail.shnapi007.bo;

import com.gmail.shnapi007.core.webelements.Product;
import com.gmail.shnapi007.pages.ProductPage;
import java.util.List;

public class ProductPageBO extends BaseBO {

  private ProductPage productPage = new ProductPage();

  public String pageHeaderValue() {
    logger.info("Get page header value");
    highlight(productPage.getPageHeader());
    return productPage.getPageHeaderValue();
  }

  public void switchToGrid() {
    logger.info("Switch to grid");
    highlight(productPage.getGrid());
    productPage.switchToGrid();
  }

  public void switchToList() {
    logger.info("Switch to list");
    highlight(productPage.getList());
    productPage.switchToList();
  }

  public void register() {
    logger.info("Click on register");
    highlight(productPage.getRegister());
    productPage.register();
  }

  public void logIn() {
    logger.info("Click on log in");
    highlight(productPage.getLogIn());
    productPage.logIn();
  }

  public List<Product> getProducts() {
    return productPage.getProducts();
  }

}
