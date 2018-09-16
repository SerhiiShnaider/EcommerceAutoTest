package com.gmail.shnapi007.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends MetaPage {

  @FindBy(how = How.CLASS_NAME, using = "page-header")
  private WebElement pageHeader;

  @FindBy(how = How.CLASS_NAME, using = "grid")
  private WebElement grid;

  @FindBy(how = How.CLASS_NAME, using = "default")
  private WebElement list;

  public String getPageHeaderValue() {
    return pageHeader.getText();
  }

  public ProductPage() {
    PageFactory.initElements(driver, this);
  }

  public void switchToGrid() {
    grid.click();
  }

  public void switchToList() {
    list.click();
  }

  public WebElement getPageHeader() {
    return pageHeader;
  }

  public WebElement getGrid() {
    return grid;
  }

  public WebElement getList() {
    return list;
  }


}
