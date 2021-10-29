package base;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.util.concurrent.TimeUnit.SECONDS;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BaseTest {
    public WebDriver driver;
    public String url="https://www.lcwaikiki.com/tr-TR/TR";

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.navigate().to(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, SECONDS);
        driver.manage().timeouts().pageLoadTimeout(200, SECONDS);
    }

    @After
    public void after(){
        driver.quit();
    }
}
