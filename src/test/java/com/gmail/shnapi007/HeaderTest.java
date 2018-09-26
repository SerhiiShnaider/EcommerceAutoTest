package com.gmail.shnapi007;

import com.gmail.shnapi007.bo.HeaderBO;
import com.gmail.shnapi007.bo.MyAccountPageBO;
import com.gmail.shnapi007.bo.ProductPageBO;
import com.gmail.shnapi007.core.DriverManager;
import com.gmail.shnapi007.core.webelements.Product;
import io.qameta.allure.Description;
import java.util.List;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HeaderTest extends BaseTest {

  private HeaderBO headerBo;
  private ProductPageBO productPageBO;
  private MyAccountPageBO myAccountPageBO;

  @BeforeMethod
  public void setUp() {
    driver = DriverManager.getDriver();
    headerBo = new HeaderBO();
    productPageBO = new ProductPageBO();
    myAccountPageBO = new MyAccountPageBO();
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

  @Test
  @Description(value = "Go to product category page test")
  public void goToProductCategoryTest() {
    driver.get("http://store.demoqa.com/");
    headerBo.clickProductCategory();
    String headerTitle = productPageBO.pageHeaderValue();
    asserter
        .assertEquals(headerTitle, "Product Category", "Wrong page title", "Page title is correct");
  }

  @Test
  @Description(value = "Go to accessories page test")
  public void goToAccessoriesTest() {
    driver.get("http://store.demoqa.com/");
    headerBo.clickAccessories();
    String headerTitle = productPageBO.pageHeaderValue();
    asserter
        .assertEquals(headerTitle, "Accessories", "Wrong page title", "Page title is correct");
  }


  @Test
  @Description(value = "Go to iMacs page test")
  public void goToIMacsTest() {
    driver.get("http://store.demoqa.com/");
    headerBo.clickIMacs();
    String headerTitle = productPageBO.pageHeaderValue();
    asserter
        .assertEquals(headerTitle, "iMacs", "Wrong page title", "Page title is correct");
  }

  @Test
  @Description(value = "Go to iPads page test")
  public void goToIPadsTest() {
    driver.get("http://store.demoqa.com/");
    headerBo.clickIPads();
    String headerTitle = productPageBO.pageHeaderValue();
    asserter
        .assertEquals(headerTitle, "iPads", "Wrong page title", "Page title is correct");
  }

  @Test
  @Description(value = "Go to iPhones page test")
  public void goToIPhonesTest() {
    driver.get("http://store.demoqa.com/");
    headerBo.clickIPhones();
    String headerTitle = productPageBO.pageHeaderValue();
    asserter
        .assertEquals(headerTitle, "iPhones", "Wrong page title", "Page title is correct");
  }

  @Test
  @Description(value = "Go to iPods page test")
  public void goToIPodsTest() {
    driver.get("http://store.demoqa.com/");
    headerBo.clickIPods();
    String headerTitle = productPageBO.pageHeaderValue();
    asserter
        .assertEquals(headerTitle, "iPods", "Wrong page title", "Page title is correct");
  }

  @Test
  @Description(value = "Go to iPods page test")
  public void goToMacBooksTest() {
    driver.get("http://store.demoqa.com/");
    headerBo.clickMacBooks();
    String headerTitle = productPageBO.pageHeaderValue();
    asserter
        .assertEquals(headerTitle, "MacBooks", "Wrong page title", "Page title is correct");
  }

  @Test
  @Description(value = "Go to iPods page test")
  public void goToHomeTest() {
    driver.get("http://store.demoqa.com/products-page/product-category/");
    headerBo.clickHome();
    String url = driver.getCurrentUrl();
    asserter
        .assertEquals(url, "http://store.demoqa.com/", "Wrong page url", "Page url is correct");
  }

  @Test
  @Description(value = "Search test")
  public void searchTest() {
    driver.get("http://store.demoqa.com/");
    String phrase = "iphone";
    headerBo.searchProducts(phrase);

    List<Product> products = productPageBO.getProducts();

    for (Product product : products) {
      System.out.println(product.getProductName());
    }

    boolean isProductFinded = products
        .stream()
        .anyMatch(p -> p.getProductName().toLowerCase().contains(phrase));

    asserter.assertPass(isProductFinded, "Product with such phrase not founded",
        "Product with such not founded");
  }

}
