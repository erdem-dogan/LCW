package test;

public abstract class BaseTest extends BaseDriver {
    public abstract void doLogin() throws InterruptedException;
    public abstract void doSearch() throws InterruptedException;
    public abstract void doChoose() throws InterruptedException;
    public abstract void goToBasket() throws InterruptedException;
}
