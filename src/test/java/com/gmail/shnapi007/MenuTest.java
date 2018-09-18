package com.gmail.shnapi007;

import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MenuTest {

  @Test
  @Description(value = "test Test")
  @Story(value = "AYEN-1488")
  public void acceptTest() {
    Assert.assertTrue(4 + 4 == 8, "accept");
  }

  @Test
  @Description(value = "test Test")
  @Story(value = "AYEN-1488")
  public void falseTest() {
    Assert.assertTrue(4 + 4 == 7, "false");
  }

  @AfterMethod
  public void after() {
    //  DriverManager.close();
  }

}
