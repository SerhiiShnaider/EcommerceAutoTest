package com.gmail.shnapi007.bo;

import com.gmail.shnapi007.pages.MetaPage;

public class MetaPageBO extends BaseBO {

  private MetaPage metaPage = new MetaPage();

  public void login() {
    logger.info("Click login");
    highlight(metaPage.getLogIn());
    metaPage.logIn();
  }

}
