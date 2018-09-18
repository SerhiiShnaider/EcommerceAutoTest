package com.gmail.shnapi007.bo;

import com.gmail.shnapi007.pages.ForgotPasswordPage;

public class ForgotPasswordBO extends BaseBO {

  private ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

  public void typeLogin(String login) {
    logger.info("Typing login");
    highlight(forgotPasswordPage.getUserLogin());
    forgotPasswordPage.typeLogin(login);
  }

  public void submit() {
    logger.info("Clicking get new password");
    highlight(forgotPasswordPage.getNewPassButton());
    forgotPasswordPage.newPassword();
  }

  public void backToStore() {
    logger.info("Clicking back to store");
    highlight(forgotPasswordPage.getBackToStore());
    forgotPasswordPage.backToStore();
  }

  public void goToLoginPage() {
    logger.info("Clicking log in");
    highlight(forgotPasswordPage.getLoginPage());
    forgotPasswordPage.goToLoginPage();
  }

  public void goToRegisterPage() {
    logger.info("Clicking register");
    highlight(forgotPasswordPage.getRegisterPage());
    forgotPasswordPage.goToRegisterPage();
  }

}
