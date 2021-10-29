package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public SearchPage searchSteps() throws InterruptedException {
        sendKeys(By.xpath("//input[@type='text']"),"Pantolan");
        clickElement(By.xpath("//button[@type='button']"));
        Thread.sleep(1000);
        getExecuter().executeScript("window.scrollTo(0,document.body.scrollHeight)");
        clickElement(By.className("lazy-load-button"));
        return this;
    }
}
