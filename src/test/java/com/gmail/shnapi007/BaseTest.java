package com.gmail.shnapi007;

import com.gmail.shnapi007.common.Asserter;
import com.gmail.shnapi007.core.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public abstract class BaseTest {

  protected WebDriver driver;
  protected Asserter asserter = new Asserter();

  @AfterMethod
  public void afterMethod() {
    DriverManager.close();
  }
}
