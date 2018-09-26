package com.gmail.shnapi007;

import com.gmail.shnapi007.bo.HeaderBO;
import com.gmail.shnapi007.bo.LogInPageBO;
import com.gmail.shnapi007.bo.MetaPageBO;
import com.gmail.shnapi007.bo.MyAccountPageBO;
import com.gmail.shnapi007.bo.ProductPageBO;
import com.gmail.shnapi007.common.Config;
import com.gmail.shnapi007.core.DriverManager;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

  private HeaderBO headerBo;
  private MyAccountPageBO myAccountPageBO;
  private MetaPageBO metaPageBO;
  private LogInPageBO logInPageBO;

  @BeforeMethod
  public void setUp() {
    driver = DriverManager.getDriver();
    headerBo = new HeaderBO();
    myAccountPageBO = new MyAccountPageBO();
    metaPageBO = new MetaPageBO();
    logInPageBO = new LogInPageBO();
  }

  @Test
  @Description(value = "Login test")
  public void loginTest() {
    driver.get("http://store.demoqa.com/");
    headerBo.clickMyAccount();
    myAccountPageBO.typeLogin(Config.getProperty("login"));
    myAccountPageBO.typePassword(Config.getProperty("password"));
    myAccountPageBO.rememberMe();
    myAccountPageBO.login();
    asserter.assertEquals(myAccountPageBO.getUserName(), Config.getProperty("login"),
        "Wrong user name", "User name is correct");

  }

  @Test
  @Description(value = "Meta login test")
  public void metaLoginTest() {
    driver.get("http://store.demoqa.com/products-page/product-category/");
    metaPageBO.login();
    logInPageBO.typeLogin(Config.getProperty("login"));
    logInPageBO.typePassword(Config.getProperty("password"));
    logInPageBO.clickOnRememberMe();
    logInPageBO.logInButtonClick();
    asserter.assertEquals(myAccountPageBO.getUserName(), Config.getProperty("login"),
        "Wrong user name", "User name is correct");

  }

  @Test
  @Description(value = "Back to store test")
  public void backToStoreTest() {
    driver.get("http://store.demoqa.com/wp-login.php");
    logInPageBO.backToStore();

    asserter.assertEquals(driver.getCurrentUrl(), "http://store.demoqa.com/",
        "Wrong home page url", "Correct home page url");

  }

}
