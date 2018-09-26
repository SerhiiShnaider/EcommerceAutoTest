package com.gmail.shnapi007.pages;

import com.gmail.shnapi007.core.webelements.Button;
import com.gmail.shnapi007.core.webelements.CheckBox;
import com.gmail.shnapi007.core.pagefactory.CustomFieldDecorator;
import com.gmail.shnapi007.core.webelements.Input;
import com.gmail.shnapi007.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends BasePage {

  @FindBy(how = How.ID, using = "user_login")
  private Input userLogin;

  @FindBy(how = How.ID, using = "user_pass")
  private Input userPassword;

  @FindBy(how = How.ID, using = "rememberme")
  private CheckBox rememberMe;

  @FindBy(how = How.ID, using = "wp-submit")
  private Button loginButton;

  @FindBy(how = How.XPATH, using = "//*[@id=\"nav\"]/a[2]")
  private WebElement registerPage;

  @FindBy(how = How.XPATH, using = "//*[@id=\"nav\"]/a[2]")
  private WebElement forgotPassword;

  @FindBy(how = How.XPATH, using = "//*[@id=\"backtoblog\"]/a")
  private WebElement backToStore;

  public LogInPage() {
    PageFactory.initElements(new CustomFieldDecorator(driver), this);
  }

  public void typeLogin(String login) {
    userLogin.sendKeys(login);
  }

  public void typePassword(String password) {
    userPassword.sendKeys(password);
  }

  public void rememberme() {
    rememberMe.setChecked(true);
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

  public Input getUserLogin() {
    return userLogin;
  }

  public Input getUserPassword() {
    return userPassword;
  }

  public Button getLoginButton() {
    return loginButton;
  }

  public WebElement getForgotPassword() {
    return forgotPassword;
  }

  public WebElement getBackToStore() {
    return backToStore;
  }

  public CheckBox getRememberMe() {
    return rememberMe;
  }

  public WebElement getRegisterPage() {
    return registerPage;
  }
}
