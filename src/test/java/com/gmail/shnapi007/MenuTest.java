package com.gmail.shnapi007;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MenuTest {

  @Test
  public void test() {
    Logger logger = Logger.getLogger(MenuTest.class);

    logger.info("info");
    logger.warn("info");
    logger.error("error");
  }

  @AfterMethod
  public void after() {
    //  DriverManager.close();
  }

}
