package com.gmail.shnapi007.bo;

import com.gmail.shnapi007.core.webelements.CheckoutProduct;
import com.gmail.shnapi007.pages.CheckoutPage;
import java.util.List;

public class CheckOutBO extends BaseBO {

  private CheckoutPage checkoutPage = new CheckoutPage();

  public String getPageTitle() {
    logger.info("Get page title");
    highlight(checkoutPage.getPageTitle());
    return checkoutPage.getPageTitleText();
  }

  public double getSubTotal() {
    logger.info("Get sub-total");
    highlight(checkoutPage.getSubTotal());
    return Double.parseDouble(checkoutPage.getSubTotalText().replaceAll("\\$", ""));
  }

  public List<CheckoutProduct> getCheckoutProducts() {
    logger.info("Get checkout products");
    return checkoutPage.getProducts();
  }


}
