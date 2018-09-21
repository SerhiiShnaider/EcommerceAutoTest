package com.gmail.shnapi007.pages;

import com.gmail.shnapi007.core.pagefactory.CustomFieldDecorator;
import com.gmail.shnapi007.core.webelements.Product;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends MetaPage {

  @FindBy(how = How.CLASS_NAME, using = "page-header")
  private WebElement pageHeader;

  @FindBy(how = How.CLASS_NAME, using = "grid")
  private WebElement grid;

  @FindBy(how = How.CLASS_NAME, using = "default")
  private WebElement list;

  @FindBys(@FindBy(how = How.XPATH, using =
      "//*[@class='entry-content']//div[contains(@class,'product_view_') and child::node()]"))
  private List<Product> products;

  public ProductPage() {
    PageFactory.initElements(new CustomFieldDecorator(driver), this);
  }

  public String getPageHeaderValue() {
    return pageHeader.getText();
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

  public List<Product> getProducts() {
    return products;
  }
}
