package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage loginSteps(){
        hoverElement(By.xpath("//a[@class='dropdown-toggle']"));
        driver.findElement(By.xpath("//a[@class='action-btn btn-block bg-blue']")).click();
        sendKeys(By.id("LoginEmail"),"erdemindolumaili@gmail.com");
        sendKeys(By.id("Password"),"erdem123");
        clickElement(By.id("loginLink"));
        return this;
    }
}
