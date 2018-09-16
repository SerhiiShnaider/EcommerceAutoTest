package com.gmail.shnapi007.bo;

import com.gmail.shnapi007.common.HighlightElement;
import org.openqa.selenium.WebElement;

public abstract class BaseBO {



  protected void highlight(WebElement element){
    HighlightElement.highlightElement(element);
  }
}
