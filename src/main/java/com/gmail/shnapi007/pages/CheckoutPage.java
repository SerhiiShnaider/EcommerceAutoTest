package com.gmail.shnapi007.pages;

import com.gmail.shnapi007.core.pagefactory.CustomFieldDecorator;
import com.gmail.shnapi007.core.webelements.CheckoutProduct;
import com.gmail.shnapi007.pages.base.BasePage;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends BasePage {

  @FindBy(how = How.XPATH, using = "//*[@class='entry-title']")
  private WebElement pageTitle;

  @FindBy(how = How.XPATH, using = "//*[@class=\"yourtotal\"]/span")
  private WebElement subTotal;

  @FindAll(@FindBy(how = How.XPATH, using =
      "//*[@class=\"checkout_cart\" and child::node()]"))
  private List<CheckoutProduct> products;

  public CheckoutPage() {
    PageFactory.initElements(new CustomFieldDecorator(driver), this);
  }

  public String getPageTitle() {
    return pageTitle.getText();
  }

  public String getSubTotal() {
    return subTotal.getText();
  }

  public List<CheckoutProduct> getProducts() {
    return products;
  }
}
