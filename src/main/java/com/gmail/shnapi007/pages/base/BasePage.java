package com.gmail.shnapi007.pages.base;

import com.gmail.shnapi007.config.DriverManager;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
  protected WebDriver driver = DriverManager.getDriver();
}
