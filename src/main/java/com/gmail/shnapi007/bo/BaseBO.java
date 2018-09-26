package com.gmail.shnapi007.bo;

import com.gmail.shnapi007.common.HighlightElement;
import com.gmail.shnapi007.common.ScrollToElement;
import com.gmail.shnapi007.core.webelements.Element;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

public abstract class BaseBO {

  protected final Logger logger = Logger.getLogger(BaseBO.class);

  protected void highlight(WebElement element) {
    HighlightElement.highlightElement(element);
  }

  protected void highlight(Element element) {
    HighlightElement.highlightElement(element);
  }

  protected void scroll(WebElement element) {
    ScrollToElement.scroll(element);
  }

  protected void scroll(Element element) {
    ScrollToElement.scroll(element);
  }
}
