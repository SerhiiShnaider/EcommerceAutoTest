package com.gmail.shnapi007;

import com.gmail.shnapi007.bo.HeaderBO;
import com.gmail.shnapi007.bo.LogInPageBO;
import com.gmail.shnapi007.bo.ProductPageBO;
import com.gmail.shnapi007.config.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MenuTest {

  @Test
  public void test() {
    HeaderBO headerBO = new HeaderBO();
    ProductPageBO productPageBO = new ProductPageBO();
    LogInPageBO logInPageBO = new LogInPageBO();
    DriverManager.getDriver().get("http://store.demoqa.com/");

    headerBO.clickAccessories();
  }

  @AfterMethod
  public void after() {
    DriverManager.close();
  }

}
