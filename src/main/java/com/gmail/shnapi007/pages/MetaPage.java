package com.gmail.shnapi007.pages;

import com.gmail.shnapi007.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public abstract class MetaPage extends BasePage {

  @FindBy(how = How.LINK_TEXT, using = "Register")
  private WebElement register;

  @FindBy(how = How.LINK_TEXT, using = "Log in")
  private WebElement logIn;

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
