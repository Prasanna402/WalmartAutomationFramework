package stepdefinitions;

import base.BaseTest;
import pages.HomePage;
import pages.ProductPage;
import io.cucumber.java.en.*;

public class SearchSteps extends BaseTest {

    HomePage home;
    ProductPage product;

    @Given("user is on Demo Web Shop homepage")
    public void openHomePage() {

        setup();
        home = new HomePage(driver);
    }

    @When("user searches for {string}")
    public void searchProduct(String productName) {

        home.searchProduct(productName);
    }

    @Then("results page should be displayed")
    public void verifyResults() {

        System.out.println("Search executed successfully");
    }

    @When("user selects a product")
    public void selectProduct() {

        product = new ProductPage(driver);
        product.selectProduct();
    }

    @And("user clicks add to cart")
    public void addToCart() {

        product.addProductToCart();
    }

    @Then("product should be added to cart")
    public void verifyCart() throws InterruptedException {

        String message = product.getSuccessMessage();

        System.out.println("Message from website: " + message);

        Thread.sleep(5000);   // keep browser open for 5 seconds

        tearDown();           // close browser
    }
}