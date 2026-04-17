package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    // search box for demo web shop
    By searchBox = By.id("small-searchterms");
    By searchButton = By.cssSelector("input[value='Search']");

    public void searchProduct(String product){

        driver.findElement(searchBox).sendKeys(product);
        driver.findElement(searchButton).click();
    }
}