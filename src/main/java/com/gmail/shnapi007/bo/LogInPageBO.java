package com.gmail.shnapi007.bo;

import com.gmail.shnapi007.pages.LogInPage;

public class LogInPageBO extends BaseBO {

  private LogInPage logInPage = new LogInPage();

  public void typeLogin(String login) {
    highlight(logInPage.getUserLogin());
    logInPage.typeLogin(login);
  }

  public void typePassword(String password) {
    highlight(logInPage.getUserLogin());
    logInPage.typeLogin(password);
  }

  public void clickOnRememberMe() {
    highlight(logInPage.getRememberMe());
    logInPage.rememberme();
  }

  public void logIn() {
    highlight(logInPage.getLoginButton());
    logInPage.logIn();
  }

  public void backToStore() {
    highlight(logInPage.getBackToStore());
    logInPage.backToStore();
  }

  public void goToForgotPasswordPage() {
    highlight(logInPage.getForgotPassword());
    logInPage.goToForgotPasswordPage();
  }

  public void goToRegisterPage() {
    highlight(logInPage.getRegisterPage());
    logInPage.goToRegisterPage();
  }

}
