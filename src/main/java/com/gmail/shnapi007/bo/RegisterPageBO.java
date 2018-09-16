package com.gmail.shnapi007.bo;

import com.gmail.shnapi007.pages.RegisterPage;

public class RegisterPageBO extends BaseBO {

  private RegisterPage registerPage = new RegisterPage();

  public void typeLogin(String login) {
    highlight(registerPage.getUserLogin());
    registerPage.typeLogin(login);
  }

  public void typeEmail(String login) {
    highlight(registerPage.getUserEmail());
    registerPage.typeEmail(login);
  }

  public void register() {
    highlight(registerPage.getRegisterButton());
    registerPage.register();
  }

  public void backToStore() {
    highlight(registerPage.getBackToStore());
    registerPage.backToStore();
  }

  public void goToForgotPasswordPage() {
    highlight(registerPage.getForgotPassword());
    registerPage.goToForgotPasswordPage();
  }

  public void goToLogInPage() {
    highlight(registerPage.getLogIn());
    registerPage.goToLogInPage();
  }

}
