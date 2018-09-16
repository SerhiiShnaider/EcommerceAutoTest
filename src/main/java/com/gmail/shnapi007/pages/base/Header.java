package com.gmail.shnapi007.pages.base;

import com.google.common.base.MoreObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Header extends BasePage {
  Actions actionBuilder = new Actions(driver);

  // MENU

  @FindBy(how = How.LINK_TEXT, using = "Home")
  private WebElement home;

  @FindBy(how = How.LINK_TEXT, using = "Product Category")
  private WebElement productCategory;

  @FindBy(how = How.LINK_TEXT, using = "All Product")
  private WebElement allProduct;

  @FindBy(how = How.LINK_TEXT, using = "Checkout")
  private WebElement checkout;

  @FindBy(how = How.LINK_TEXT, using = "My Account")
  private WebElement myAccount;

  @FindBy(how = How.NAME, using = "s")
  private WebElement searchProducts;

  // SUB-MENU

  @FindBy(how = How.LINK_TEXT, using = "Accessories")
  private WebElement accessories;

  @FindBy(how = How.LINK_TEXT, using = "iMacs")
  private WebElement iMacs;

  @FindBy(how = How.LINK_TEXT, using = "iPads")
  private WebElement iPads;

  @FindBy(how = How.LINK_TEXT, using = "iPhones")
  private WebElement iPhones;

  @FindBy(how = How.LINK_TEXT, using = "iPods")
  private WebElement iPods;

  @FindBy(how = How.LINK_TEXT, using = "MacBooks")
  private WebElement macBooks;

  public Header() {
    PageFactory.initElements(driver, this);
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

  public WebElement getSearchProducts() {
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
