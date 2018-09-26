package com.gmail.shnapi007;

import com.gmail.shnapi007.bo.HeaderBO;
import com.gmail.shnapi007.bo.ProductPageBO;
import com.gmail.shnapi007.core.DriverManager;
import com.gmail.shnapi007.core.webelements.Product;
import com.gmail.shnapi007.pages.CheckoutPage;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BuyProductTest extends BaseTest {

  private HeaderBO headerBo;
  private ProductPageBO productPageBO;

  @BeforeMethod
  public void setUp() {
    driver = DriverManager.getDriver();
    headerBo = new HeaderBO();
    productPageBO = new ProductPageBO();
  }

  @Test
  public void test() {
    driver.get("http://store.demoqa.com/products-page/product-category/?view_type=default");
    productPageBO.switchToGrid();
    List<Product> products = productPageBO.getProducts();
    List<String> addedProductsName = new ArrayList<>();

    for (Product product : products) {
      product.addToCart();
      addedProductsName.add(product.getProductName());
    }

    headerBo.clickCheckout();

    CheckoutPage checkoutPage = new CheckoutPage();

    List<String> checkoutProductsName = checkoutPage.getProducts()
        .stream()
        .map(p -> p.getProductName())
        .collect(Collectors.toList());

    asserter.assertEquals(addedProductsName.size(), checkoutProductsName.size(),
        "Products size count not equals", "Products size count equals");

    for (String name : addedProductsName) {
      boolean isProductPresent = checkoutProductsName.stream()
          .anyMatch(p -> p.equalsIgnoreCase(name));

      asserter.assertPass(isProductPresent, String.format("Product %s is absent", name),
          "All products are presents");
    }

    /*asserter.assertPass(addedProducts
            .stream()
            .allMatch(n -> checkoutProductsName
                .stream()
                .anyMatch(p -> p.equalsIgnoreCase(n))),
        "Checkout products are not the same which was added",
        "Checkout products are the same which was added");*/

  }


}
