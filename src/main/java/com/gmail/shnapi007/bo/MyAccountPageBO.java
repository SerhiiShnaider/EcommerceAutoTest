package com.gmail.shnapi007.bo;

import com.gmail.shnapi007.pages.MyAccountPage;

public class MyAccountPageBO extends BaseBO {

  private MyAccountPage myAccountPage = new MyAccountPage();

  public void typeLogin(String login) {
    logger.info("Typing login");
    highlight(myAccountPage.getLogin());
    myAccountPage.typeLogin(login);
  }

  public void typePassword(String password) {
    logger.info("Typing password");
    highlight(myAccountPage.getPassword());
    myAccountPage.typePassword(password);
  }

  public void rememberMe() {
    logger.info("Typing password");
    highlight(myAccountPage.getRememberMe());
    myAccountPage.rememberMe();
  }

  public void login() {
    logger.info("Login");
    highlight(myAccountPage.getLoginButton());
    myAccountPage.login();
  }

  public void logout() {
    logger.info("Logout");
    highlight(myAccountPage.getLogout());
    myAccountPage.logout();
  }

  public String getUserName() {
    logger.info("Logout");
    highlight(myAccountPage.getUserMenu());
    myAccountPage.moveToUserMenu();
    highlight(myAccountPage.getUserName());
    return myAccountPage.getUserNameText();
  }

}
