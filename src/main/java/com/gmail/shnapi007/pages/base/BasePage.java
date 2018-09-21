package com.gmail.shnapi007.pages.base;

import com.gmail.shnapi007.core.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public abstract class BasePage {

  protected WebDriver driver = DriverManager.getDriver();
  protected Actions actionBuilder = new Actions(driver);
}
