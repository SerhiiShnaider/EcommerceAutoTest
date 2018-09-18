package com.gmail.shnapi007.bo;

import com.gmail.shnapi007.pages.LogInPage;

public class LogInPageBO extends BaseBO {

  private LogInPage logInPage = new LogInPage();

  public void typeLogin(String login) {
    logger.info("Typing login");
    highlight(logInPage.getUserLogin());
    logInPage.typeLogin(login);
  }

  public void typePassword(String password) {
    logger.info("Typing password");
    highlight(logInPage.getUserLogin());
    logInPage.typeLogin(password);
  }

  public void clickOnRememberMe() {
    logger.info("Clicking on remember me");
    highlight(logInPage.getRememberMe());
    logInPage.rememberme();
  }

  public void logIn() {
    logger.info("Logining");
    highlight(logInPage.getLoginButton());
    logInPage.logIn();
  }

  public void backToStore() {
    logger.info("Clicking back to online store");
    highlight(logInPage.getBackToStore());
    logInPage.backToStore();
  }

  public void goToForgotPasswordPage() {
    logger.info("Clicking lost your password");
    highlight(logInPage.getForgotPassword());
    logInPage.goToForgotPasswordPage();
  }

  public void goToRegisterPage() {
    logger.info("Clicking register");
    highlight(logInPage.getRegisterPage());
    logInPage.goToRegisterPage();
  }

}
