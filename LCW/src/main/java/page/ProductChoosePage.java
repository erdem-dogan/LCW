package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Random;

public class ProductChoosePage extends BasePage {
    int random = 0;
    public ProductChoosePage(WebDriver driver) {
        super(driver);
    }

    public ProductChoosePage productChooseSteps(){
        findElements(By.xpath("//div[@class='picture-box']")).get(random = new Random().nextInt(findElements(By.xpath("//div[@class='picture-box']")).size())).click();
        findElements(By.xpath("//div[@class='col-md-12 info-panel-content main-info-area']//a[@data-tracking-label='BedenSecenekleri']")).get(random = new Random().
                nextInt(findElements(By.xpath("//div[@class='col-md-12 info-panel-content main-info-area']//a[@data-tracking-label='BedenSecenekleri']")).size())).click();
        clickElement(By.id("pd_add_to_cart"));
        return this;
    }
}
