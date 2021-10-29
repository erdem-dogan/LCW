package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public CartPage cartSteps() throws InterruptedException {
        String productPrice = findElement(By.cssSelector("div.col-xs-12.price-area>div>div>span.price")).getText();
        hoverElement(By.xpath("//a[@class='header-cart']"));
        clickElement(By.xpath("//a[@class='button dd-button dd-cart']"));
        String basketPrice = findElement(By.xpath("//span[@class='rd-cart-item-price mb-15']")).getText();
        clickElement(By.xpath("//a[@class='oq-up plus']"));
        Thread.sleep(1000);
        clickElement(By.xpath("//a[@class='cart-square-link']"));
        Thread.sleep(1000);
        clickElement(By.xpath("//a[@class='inverted-modal-button sc-delete ins-init-condition-tracking']"));
        if(productPrice.equals(basketPrice)){
            System.out.println("Fiyatlar eşit: Liste="+productPrice +" , Sepet="+basketPrice);
        }
        return this;
    }
}
