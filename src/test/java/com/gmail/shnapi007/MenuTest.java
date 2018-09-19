package com.gmail.shnapi007;

import com.gmail.shnapi007.bo.HeaderBO;
import com.gmail.shnapi007.bo.ProductPageBO;
import com.gmail.shnapi007.core.DriverManager;
import io.qameta.allure.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenuTest extends BaseTest {

  private HeaderBO headerBo;
  private ProductPageBO productPageBO;

  @BeforeMethod
  public void setUp() {
    headerBo = new HeaderBO();
    productPageBO = new ProductPageBO();
  }

  @Test
  @Description(value = "Go to all products page test")
  public void goToAllProductsTest() {
    driver.get("http://store.demoqa.com/");
    headerBo.clickAllProduct();
    String headerTitle = productPageBO.pageHeaderValue();
    asserter
        .assertEquals(headerTitle, "Product Category", "Wrong page title", "Page title is correct");

  }

  @AfterMethod
  public void after() {
    DriverManager.close();
  }

}
