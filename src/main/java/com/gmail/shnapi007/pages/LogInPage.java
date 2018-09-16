package com.gmail.shnapi007.pages;

import com.gmail.shnapi007.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends BasePage {

  @FindBy(how = How.ID, using = "user_login")
  private WebElement userLogin;

  @FindBy(how = How.ID, using = "user_pass")
  private WebElement userPassword;

  @FindBy(how = How.ID, using = "rememberme")
  private WebElement rememberMe;

  @FindBy(how = How.ID, using = "wp-submit")
  private WebElement loginButton;

  @FindBy(how = How.LINK_TEXT, using = "Register")
  private WebElement registerPage;

  @FindBy(how = How.LINK_TEXT, using = "Lost your password?")
  private WebElement forgotPassword;

  @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Back to ONLINE STORE")
  private WebElement backToStore;

  public LogInPage() {
    PageFactory.initElements(driver, this);
  }

  public void typeLogin(String login) {
    userLogin.sendKeys(login);
  }

  public void typePassword(String password) {
    userPassword.sendKeys(password);
  }

  public void rememberme() {
    rememberMe.click();
  }

  public void logIn() {
    loginButton.click();
  }

  public void backToStore() {
    backToStore.click();
  }

  public void goToRegisterPage() {
    registerPage.click();
  }

  public void goToForgotPasswordPage() {
    forgotPassword.click();
  }

  public WebElement getUserLogin() {
    return userLogin;
  }

  public WebElement getUserPassword() {
    return userPassword;
  }

  public WebElement getLoginButton() {
    return loginButton;
  }

  public WebElement getForgotPassword() {
    return forgotPassword;
  }

  public WebElement getBackToStore() {
    return backToStore;
  }

  public WebElement getRememberMe() {
    return rememberMe;
  }

  public WebElement getRegisterPage() {
    return registerPage;
  }
}
