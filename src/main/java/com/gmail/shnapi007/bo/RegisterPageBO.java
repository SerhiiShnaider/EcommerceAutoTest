package com.gmail.shnapi007.bo;

import com.gmail.shnapi007.pages.RegisterPage;

public class RegisterPageBO extends BaseBO {

  private RegisterPage registerPage = new RegisterPage();

  public void typeLogin(String login) {
    logger.info("Typing login");
    highlight(registerPage.getUserLogin());
    registerPage.typeLogin(login);
  }

  public void typeEmail(String login) {
    logger.info("Typing email");
    highlight(registerPage.getUserEmail());
    registerPage.typeEmail(login);
  }

  public void register() {
    logger.info("Click register");
    highlight(registerPage.getRegisterButton());
    registerPage.register();
  }

  public void backToStore() {
    logger.info("Click back to store");
    highlight(registerPage.getBackToStore());
    registerPage.backToStore();
  }

  public void goToForgotPasswordPage() {
    logger.info("Click forgot password");
    highlight(registerPage.getForgotPassword());
    registerPage.goToForgotPasswordPage();
  }

  public void goToLogInPage() {
    logger.info("Click log in");
    highlight(registerPage.getLogIn());
    registerPage.goToLogInPage();
  }

}
