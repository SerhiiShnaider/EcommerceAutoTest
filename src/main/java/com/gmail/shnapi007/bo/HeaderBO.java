package com.gmail.shnapi007.bo;

import com.gmail.shnapi007.pages.base.Header;

public class HeaderBO extends BaseBO {

 private Header header = new Header();

  public void clickHome() {
    logger.info("Clicking home");
    highlight(header.getHome());
    header.home();
  }

  public void clickProductCategory() {
    logger.info("Clicking product category");
    highlight(header.getProductCategory());
    header.productCategory();
  }

  public void clickAllProduct() {
    logger.info("Clicking all product");
    highlight(header.getAllProduct());
    header.allProduct();
  }

  public void clickMyAccount() {
    logger.info("Clicking my account");
    highlight(header.getMyAccount());
    header.myAccount();
  }

  public void clickCheckout() {
    logger.info("Clicking checkout");
    highlight(header.getCheckout());
    header.checkout();
  }

  public void searchProducts(String product) {
    logger.info("Searching products");
    highlight(header.getSearchProducts());
    header.searchProducts(product);
  }

  public void clickAccessories() {
    highlight(header.getProductCategory());
    header.moveToProductCategory();
    logger.info("Clicking accessories");
    highlight(header.getAccessories());
    header.accessories();
  }

  public void clickIMacs() {
    highlight(header.getProductCategory());
    header.moveToProductCategory();
    logger.info("Clicking IMacs");
    highlight(header.getIMacs());
    header.iMacs();
  }

  public void clickIPads() {
    highlight(header.getProductCategory());
    header.moveToProductCategory();
    logger.info("Clicking IPads");
    highlight(header.getIPads());
    header.iPads();
  }

  public void clickIPhones() {
    highlight(header.getProductCategory());
    header.moveToProductCategory();
    logger.info("Clicking IPhones");
    highlight(header.getIPhones());
    header.iPhones();
  }

  public void clickIPods() {
    highlight(header.getProductCategory());
    header.moveToProductCategory();
    logger.info("Clicking IPods");
    highlight(header.getIPods());
    header.iPods();
  }

  public void clickMacBooks() {
    highlight(header.getProductCategory());
    header.moveToProductCategory();
    logger.info("Clicking MacBooks");
    highlight(header.getMacBooks());
    header.macBooks();
  }

}
