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

  public List<Product> getProducts() {
    return productPage.getProducts();
  }

}
