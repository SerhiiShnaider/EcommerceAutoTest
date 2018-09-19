package com.gmail.shnapi007.common;

import org.apache.log4j.Logger;
import org.testng.Assert;

public class Asserter {

  private final Logger logger = Logger.getLogger(Asserter.class);

  public void assertPass(boolean condition, String failMessage, String passMessage) {

    if (condition) {
      logger.info(passMessage);
    }

    Assert.assertTrue(condition, failMessage);
  }

  public void assertFalse(boolean condition, String failMessage, String passMessage) {

    if (!condition) {
      logger.info(passMessage);
    }

    Assert.assertFalse(condition, failMessage);
  }

  public void assertEquals(Object actualObject, Object expectedObject, String failMessage,
      String passMessage) {

    if (actualObject == expectedObject) {
      if (passMessage != null) {
        logger.info(passMessage);
      }
      return;
    }

    if (actualObject != null && actualObject.equals(expectedObject)) {
      if (passMessage != null) {
        logger.info(passMessage);
      }
    } else {
      Assert.assertEquals(actualObject, expectedObject, failMessage);
    }
  }

  public void assertNotEquals(Object actualObject, Object expectedObject, String failMessage,
      String passMessage) {

    if (actualObject != expectedObject) {
      if (passMessage != null) {
        logger.info(passMessage);
      }
      return;
    }

    if (actualObject != null && !actualObject.equals(expectedObject)) {
      if (passMessage != null) {
        logger.info(passMessage);
      }
    } else {
      Assert.assertNotEquals(actualObject, expectedObject, failMessage);
    }
  }

  public void assertNull(Object actualObject, String failMessage, String passMessage) {
    if (actualObject == null) {
      if (passMessage != null) {
        logger.info(passMessage);
      }
      return;
    }

    Assert.assertNull(actualObject, failMessage);
  }

  public void assertNotNull(Object actualObject, String failMessage, String passMessage) {
    if (actualObject != null) {
      if (passMessage != null) {
        logger.info(passMessage);
      }
      return;
    }

    Assert.assertNotNull(actualObject, failMessage);
  }

}


