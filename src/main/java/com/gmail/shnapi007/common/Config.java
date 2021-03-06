package com.gmail.shnapi007.common;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import org.apache.log4j.Logger;

public class Config {

  protected final static Logger logger = Logger.getLogger(Config.class);

  public static Properties config;

  public static int getIntProperty(String key) {
    return Integer.parseInt(getProperty(key));
  }

  public static String getProperty(String key) {
    String propertyValue = "";
    try {
      String fileName = "project.properties";
      if (config == null) {
        config = loadProperties(fileName);
      }
      if (config.containsKey(key)) {
        propertyValue = config.getProperty(key);
      }
    } catch (Exception e) {
      logger.error("Project property reading error");
    }
    return propertyValue;
  }

  public static Properties loadProperties(String path) throws Exception {
    Properties result = new Properties();
    InputStream in = Config.class.getClassLoader().getResourceAsStream(path);
    if (in == null) {
      in = new FileInputStream(path);
    }
    result.load(in);
    return result;
  }
}
