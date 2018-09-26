package com.gmail.shnapi007.pages;

import com.gmail.shnapi007.core.pagefactory.CustomFieldDecorator;
import com.gmail.shnapi007.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public
class MetaPage extends BasePage {

  @FindBy(how = How.XPATH, using = "//*[@id=\"meta\"]/ul/li[1]/a")
  private WebElement register;

  @FindBy(how = How.XPATH, using = "//*[@id=\"meta\"]/ul/li[2]/a")
  private WebElement logIn;

  public MetaPage() {
    PageFactory.initElements(new CustomFieldDecorator(driver), this);
  }

  public void register() {
    register.click();
  }

  public void logIn() {
    logIn.click();
  }

  public WebElement getRegister() {
    return register;
  }

  public WebElement getLogIn() {
    return logIn;
  }
}
