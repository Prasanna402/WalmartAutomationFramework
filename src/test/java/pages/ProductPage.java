package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    // selecting a product that does not require form fields
    By firstProduct = By.linkText("Build your own cheap computer");

    // specific add to cart button for that product
    By addToCart = By.id("add-to-cart-button-72");

    // success message after adding product
    By successMessage = By.cssSelector(".content");

    public void selectProduct(){
        driver.findElement(firstProduct).click();
    }

    public void addProductToCart(){
        driver.findElement(addToCart).click();
    }

    public String getSuccessMessage(){
        return driver.findElement(successMessage).getText();
    }
}