package com.gmail.shnapi007.pages.base;

import com.gmail.shnapi007.core.pagefactory.CustomFieldDecorator;
import com.gmail.shnapi007.core.webelements.Input;
import com.google.common.base.MoreObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Header extends BasePage {

  // MENU

  @FindBy(how = How.ID, using = "menu-item-15")
  private WebElement home;

  @FindBy(how = How.ID, using = "menu-item-33")
  private WebElement productCategory;

  @FindBy(how = How.ID, using = "menu-item-72")
  private WebElement allProduct;

  @FindBy(how = How.ID, using = "header_cart")
  private WebElement checkout;

  @FindBy(how = How.XPATH, using = "//*[@id='account']/a")
  private WebElement myAccount;

  @FindBy(how = How.CLASS_NAME, using = "searchform")
  private Input searchProducts;

  // SUB-MENU

  @FindBy(how = How.ID, using = "menu-item-34")
  private WebElement accessories;

  @FindBy(how = How.ID, using = "menu-item-35")
  private WebElement iMacs;

  @FindBy(how = How.ID, using = "menu-item-36")
  private WebElement iPads;

  @FindBy(how = How.ID, using = "menu-item-37")
  private WebElement iPhones;

  @FindBy(how = How.ID, using = "menu-item-38")
  private WebElement iPods;

  @FindBy(how = How.ID, using = "menu-item-39")
  private WebElement macBooks;

  public Header() {
    PageFactory.initElements(new CustomFieldDecorator(driver), this);
  }

  public void home() {
    home.click();
  }

  public void productCategory() {
    productCategory.click();
  }

  public void moveToProductCategory() {
    actionBuilder.moveToElement(productCategory).perform();
  }

  public void allProduct() {
    allProduct.click();
  }

  public void myAccount() {
    myAccount.click();
  }

  public void checkout() {
    checkout.click();
  }

  public void searchProducts(String product) {
    searchProducts.sendKeys(product);
    searchProducts.submit();
  }

  public void accessories() {
    accessories.click();
  }

  public void iMacs() {
    iMacs.click();
  }

  public void iPads() {
    iPads.click();
  }

  public void iPhones() {
    iPhones.click();
  }

  public void iPods() {
    iPods.click();
  }

  public void macBooks() {
    macBooks.click();
  }

  public WebElement getHome() {
    return home;
  }

  public WebElement getProductCategory() {
    return productCategory;
  }

  public WebElement getAllProduct() {
    return allProduct;
  }

  public Input getSearchProducts() {
    return searchProducts;
  }

  public WebElement getCheckout() {
    return checkout;
  }

  public WebElement getMyAccount() {
    return myAccount;
  }

  public WebElement getAccessories() {
    return accessories;
  }

  public Actions getActionBuilder() {
    return actionBuilder;
  }

  public WebElement getIMacs() {
    return iMacs;
  }

  public WebElement getIPads() {
    return iPads;
  }

  public WebElement getIPhones() {
    return iPhones;
  }

  public WebElement getIPods() {
    return iPods;
  }

  public WebElement getMacBooks() {
    return macBooks;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("actionBuilder", actionBuilder)
        .add("home", home)
        .add("productCategory", productCategory)
        .add("allProduct", allProduct)
        .add("checkout", checkout)
        .add("myAccount", myAccount)
        .add("searchProducts", searchProducts)
        .add("accessories", accessories)
        .add("iMacs", iMacs)
        .add("iPads", iPads)
        .add("iPhones", iPhones)
        .add("iPods", iPods)
        .add("macBooks", macBooks)
        .toString();
  }
}
