package com.gmail.shnapi007;

import com.gmail.shnapi007.bo.CheckOutBO;
import com.gmail.shnapi007.bo.HeaderBO;
import com.gmail.shnapi007.bo.ProductPageBO;
import com.gmail.shnapi007.core.DriverManager;
import com.gmail.shnapi007.core.webelements.CheckoutProduct;
import com.gmail.shnapi007.core.webelements.Product;
import io.qameta.allure.Description;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BuyProductTest extends BaseTest {

  private HeaderBO headerBo;
  private ProductPageBO productPageBO;
  private CheckOutBO checkOutBO;

  @BeforeMethod
  public void setUp() {
    driver = DriverManager.getDriver();
    headerBo = new HeaderBO();
    productPageBO = new ProductPageBO();
    checkOutBO = new CheckOutBO();
  }

  @Test
  @Description(value = "Switch to checkout test")
  public void switchToCheckoutTest() {
    driver.get("http://store.demoqa.com/");
    headerBo.clickCheckout();
    asserter.assertEquals(checkOutBO.getPageTitle(), "Checkout", "Page headers are not equals",
        "Page headers are equals");
  }

  @Test
  @Description(value = "Sub-Total price test")
  public void subTotalPriceTest() {
    driver.get("http://store.demoqa.com/products-page/product-category/?view_type=default");
    productPageBO.switchToGrid();
    List<Product> products = productPageBO.getProducts();
    products.forEach(Product::addToCart);
    headerBo.clickCheckout();

    double totalPrice = checkOutBO.getCheckoutProducts()
        .stream()
        .mapToDouble(p -> p.getPrice())
        .sum();

    asserter.assertEquals(totalPrice, checkOutBO.getSubTotal(), "Sub-Total price is incorrect",
        "Sub-Total price is correct");
  }

  @Test
  @Description(value = "Add grid products test")
  public void addGridProductsTest() {
    driver.get("http://store.demoqa.com/products-page/product-category/?view_type=default");
    productPageBO.switchToGrid();
    List<Product> products = productPageBO.getProducts();
    List<String> addedProductsName = new ArrayList<>();

    for (Product product : products) {
      product.addToCart();
      addedProductsName.add(product.getProductName());
    }
    headerBo.clickCheckout();

    List<String> checkoutProductsName = checkOutBO.getCheckoutProducts()
        .stream()
        .map(p -> p.getProductName())
        .collect(Collectors.toList());

    asserter.assertEquals(addedProductsName.size(), checkoutProductsName.size(),
        "Products size count not equals", "Products size count equals");

    for (String name : addedProductsName) {
      boolean isProductPresent = checkoutProductsName
          .stream()
          .anyMatch(p -> p.equalsIgnoreCase(name));

      asserter.assertPass(isProductPresent, String.format("Product %s is absent", name),
          "All products are presents");
    }
  }

  @Test
  @Description(value = "Add list products test")
  public void addListProductsTest() {
    driver.get("http://store.demoqa.com/products-page/product-category/?view_type=default");
    List<Product> products = productPageBO.getProducts();
    List<String> addedProductsName = new ArrayList<>();

    for (Product product : products) {
      product.addToCart();
      addedProductsName.add(product.getProductName());
    }
    headerBo.clickCheckout();

    List<String> checkoutProductsName = checkOutBO.getCheckoutProducts()
        .stream()
        .map(p -> p.getProductName())
        .collect(Collectors.toList());

    asserter.assertEquals(addedProductsName.size(), checkoutProductsName.size(),
        "Products size count not equals", "Products size count equals");

    for (String name : addedProductsName) {
      boolean isProductPresent = checkoutProductsName
          .stream()
          .anyMatch(p -> p.equalsIgnoreCase(name));

      asserter.assertPass(isProductPresent, String.format("Product %s is absent", name),
          "All products are presents");
    }
  }


}
