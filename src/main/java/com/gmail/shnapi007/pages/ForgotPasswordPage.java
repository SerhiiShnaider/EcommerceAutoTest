package com.gmail.shnapi007.pages;

import com.gmail.shnapi007.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage extends BasePage {

  @FindBy(how = How.ID, using = "user_login")
  private WebElement userLogin;

  @FindBy(how = How.ID, using = "wp-submit")
  private WebElement newPassButton;

  @FindBy(how = How.LINK_TEXT, using = "Log in")
  private WebElement loginPage;

  @FindBy(how = How.LINK_TEXT, using = "Register")
  private WebElement registerPage;

  @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Back to ONLINE STORE")
  private WebElement backToStore;

  public ForgotPasswordPage() {
    PageFactory.initElements(driver, this);
  }

  public void typeLogin(String login) {
    userLogin.sendKeys(login);
  }

  public void newPassword() {
    newPassButton.click();
  }

  public void goToLoginPage() {
    loginPage.click();
  }

  public void goToRegisterPage() {
    registerPage.click();
  }

  public void backToStore() {
    backToStore.click();
  }

  public WebElement getUserLogin() {
    return userLogin;
  }

  public WebElement getNewPassButton() {
    return newPassButton;
  }

  public WebElement getLoginPage() {
    return loginPage;
  }

  public WebElement getRegisterPage() {
    return registerPage;
  }

  public WebElement getBackToStore() {
    return backToStore;
  }
}
