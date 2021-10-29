package test;

import base.BaseTest;
import org.junit.Before;
import org.junit.Test;
import page.LoginPage;

public class MainTest extends BaseTest {
    LoginPage loginPage;

    @Before
    public void setBefore(){
        loginPage = new LoginPage(driver);
    }

    @Test
    public void doLoginTest() throws InterruptedException {
        loginPage.loginSteps().getSearchPage().searchSteps().getProductChoosePage().productChooseSteps().getCartPage().cartSteps();
    }
}
