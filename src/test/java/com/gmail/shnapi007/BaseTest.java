package com.gmail.shnapi007;

import com.gmail.shnapi007.common.Asserter;
import com.gmail.shnapi007.core.DriverManager;
import org.openqa.selenium.WebDriver;

public abstract class BaseTest {

  protected WebDriver driver = DriverManager.getDriver();
  protected Asserter asserter = new Asserter();
}
