package base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import page.CartPage;
import page.ProductChoosePage;
import page.SearchPage;

import java.util.List;

public class BasePage {
    public WebDriver driver;
    JavascriptExecutor executor;

    public BasePage(WebDriver driver) {
        this.driver=driver;
    }

    public WebElement findElement(By by){
        return driver.findElement(by);
    }

    public List<WebElement> findElements(By by){
        return driver.findElements(by);
    }

    public void clickElement(By by){
        WebElement element = driver.findElement(by);
        element.click();
    }

    public void sendKeys(By by, String value){
        WebElement element = driver.findElement(by);
        element.click();
        element.clear();
        element.sendKeys(value);
    }

    public JavascriptExecutor getExecuter(){
        executor = ((JavascriptExecutor) driver);
        return executor;
    }

    public Actions getActions(){
        return new Actions(driver);
    }

    public void hoverElement(By by){
        getActions().moveToElement(driver.findElement(by)).perform();
    }

    public SearchPage getSearchPage(){
        return new SearchPage(driver);
    }

    public ProductChoosePage getProductChoosePage(){
        return new ProductChoosePage(driver);
    }

    public CartPage getCartPage(){
        return new CartPage(driver);
    }
}
