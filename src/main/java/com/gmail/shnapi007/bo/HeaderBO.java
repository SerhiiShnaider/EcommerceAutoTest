package com.gmail.shnapi007.bo;

import com.gmail.shnapi007.pages.base.Header;

public class HeaderBO extends BaseBO {

 private Header header = new Header();

  public void clickHome() {
    highlight(header.getHome());
    header.home();
  }

  public void clickProductCategory() {
    highlight(header.getProductCategory());
    header.productCategory();
  }

  public void clickAllProduct() {
    highlight(header.getAllProduct());
    header.allProduct();
  }

  public void clickMyAccount() {
    highlight(header.getMyAccount());
    header.myAccount();
  }

  public void clickCheckout() {
    highlight(header.getMyAccount());
    header.checkout();
  }

  public void searchProducts(String product) {
    highlight(header.getSearchProducts());
    header.searchProducts(product);
  }

  public void clickAccessories() {
    highlight(header.getProductCategory());
    header.moveToProductCategory();
    highlight(header.getAccessories());
    header.accessories();
  }

  public void clickIMacs() {
    highlight(header.getProductCategory());
    header.moveToProductCategory();
    highlight(header.getIMacs());
    header.iMacs();
  }

  public void clickIPads() {
    highlight(header.getProductCategory());
    header.moveToProductCategory();
    highlight(header.getIPads());
    header.iPads();
  }

  public void clickIPhones() {
    highlight(header.getProductCategory());
    header.moveToProductCategory();
    highlight(header.getIPhones());
    header.iPhones();
  }

  public void clickIPods() {
    highlight(header.getProductCategory());
    header.moveToProductCategory();
    highlight(header.getIPods());
    header.iPods();
  }

  public void clickMacBooks() {
    highlight(header.getProductCategory());
    header.moveToProductCategory();
    highlight(header.getMacBooks());
    header.macBooks();
  }

}
