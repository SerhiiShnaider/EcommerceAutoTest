package com.gmail.shnapi007.pages;

import com.gmail.shnapi007.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage {

  @FindBy(how = How.ID, using = "user_login")
  private WebElement userLogin;

  @FindBy(how = How.ID, using = "user_email")
  private WebElement userEmail;

  @FindBy(how = How.ID, using = "wp-submit")
  private WebElement registerButton;

  @FindBy(how = How.LINK_TEXT, using = "Log in")
  private WebElement logIn;

  @FindBy(how = How.LINK_TEXT, using = "Lost your password?")
  private WebElement forgotPassword;

  @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Back to ONLINE STORE")
  private WebElement backToStore;

  public RegisterPage() {
    PageFactory.initElements(driver, this);
  }

  public void typeLogin(String login) {
    userLogin.sendKeys(login);
  }

  public void typeEmail(String email) {
    userEmail.sendKeys(email);
  }

  public void register() {
    registerButton.click();
  }

  public void backToStore() {
    backToStore.click();
  }

  public void goToForgotPasswordPage() {
    forgotPassword.click();
  }

  public void goToLogInPage() {
    logIn.click();
  }

  public WebElement getUserLogin() {
    return userLogin;
  }

  public WebElement getUserEmail() {
    return userEmail;
  }

  public WebElement getRegisterButton() {
    return registerButton;
  }

  public WebElement getForgotPassword() {
    return forgotPassword;
  }

  public WebElement getBackToStore() {
    return backToStore;
  }

  public WebElement getLogIn() {
    return logIn;
  }
}
