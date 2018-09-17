package com.gmail.shnapi007.bo;

import com.gmail.shnapi007.common.HighlightElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;

public abstract class BaseBO {

  protected final Logger logger = LogManager.getLogger(BaseBO.class);


  protected void highlight(WebElement element) {
    HighlightElement.highlightElement(element);
  }
}
