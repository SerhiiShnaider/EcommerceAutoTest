package com.gmail.shnapi007.bo;

import com.gmail.shnapi007.pages.ForgotPasswordPage;

public class ForgotPasswordBO extends BaseBO {

  private ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

  public void typeLogin(String login) {
    highlight(forgotPasswordPage.getUserLogin());
    forgotPasswordPage.typeLogin(login);
  }

  public void submit() {
    highlight(forgotPasswordPage.getNewPassButton());
    forgotPasswordPage.newPassword();
  }

  public void backToStore() {
    highlight(forgotPasswordPage.getBackToStore());
    forgotPasswordPage.backToStore();
  }

  public void goToLoginPage() {
    highlight(forgotPasswordPage.getLoginPage());
    forgotPasswordPage.goToLoginPage();
  }

  public void goToRegisterPage() {
    highlight(forgotPasswordPage.getRegisterPage());
    forgotPasswordPage.goToRegisterPage();
  }

}
