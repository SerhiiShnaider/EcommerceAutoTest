package com.gmail.shnapi007.pages.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Footer extends BasePage {

  @FindBy(how = How.LINK_TEXT, using = "SP Home")
  private WebElement home;

  @FindBy(how = How.LINK_TEXT, using = "Sample Page")
  private WebElement samplePage;

  @FindBy(how = How.LINK_TEXT, using = "Your Account")
  private WebElement yourAccount;

}
