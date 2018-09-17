package com.gmail.shnapi007.bo;

import com.gmail.shnapi007.common.HighlightElement;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

public abstract class BaseBO {

  protected final Logger logger = Logger.getLogger(BaseBO.class);

  protected void highlight(WebElement element) {
    HighlightElement.highlightElement(element);
  }
}
