package com.gmail.shnapi007.pages;

import com.gmail.shnapi007.core.pagefactory.CustomFieldDecorator;
import com.gmail.shnapi007.core.webelements.Button;
import com.gmail.shnapi007.core.webelements.CheckBox;
import com.gmail.shnapi007.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends BasePage {

  @FindBy(how = How.ID, using = "log")
  private WebElement login;

  @FindBy(how = How.ID, using = "pwd")
  private WebElement password;

  @FindBy(how = How.ID, using = "rememberme")
  private CheckBox rememberMe;

  @FindBy(how = How.ID, using = "login")
  private Button loginButton;

  @FindBy(how = How.ID, using = "account_logout")
  private WebElement logout;

  @FindBy(how = How.ID, using = "wp-admin-bar-my-account")
  private WebElement userMenu;

  @FindBy(how = How.CLASS_NAME, using = "display-name")
  private WebElement userName;

  public MyAccountPage() {
    PageFactory.initElements(new CustomFieldDecorator(driver), this);
  }

  public void typeLogin(String login) {
    this.login.sendKeys(login);
  }

  public void typePassword(String password) {
    this.password.sendKeys(password);
  }

  public void rememberMe() {
    rememberMe.setChecked(true);
  }

  public void login() {
    loginButton.click();
  }

  public void logout() {
    logout.click();
  }

  public void moveToUserMenu() {
    actionBuilder.moveToElement(userMenu).perform();
  }

  public String getUserNameText() {
    return userName.getText();
  }


  public WebElement getLogin() {
    return login;
  }

  public WebElement getPassword() {
    return password;
  }

  public CheckBox getRememberMe() {
    return rememberMe;
  }

  public Button getLoginButton() {
    return loginButton;
  }

  public WebElement getLogout() {
    return logout;
  }

  public WebElement getUserMenu() {
    return userMenu;
  }

  public WebElement getUserName() {
    return userName;
  }
}
