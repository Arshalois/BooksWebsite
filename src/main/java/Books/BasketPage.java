package Books;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasketPage extends pageBaseBooks{
    private final static String TITLE = "BasketPage";
    public BasketPage(WebDriver driver) {
        super(driver,TITLE );
    }

    By basketCheckout = By.xpath("//*[@data-default-localized-pattern = 'Basket / Checkout']");
    By clickToCheckout = By.xpath("//*[@class='checkout-btn btn optimizely-variation-1 original-bucket']");
    public BasketPage myBasket(){
        //basketCheckout.click();
        driver.findElement(basketCheckout).click();
        driver.findElement(clickToCheckout).click();

        return new BasketPage(driver);
}}
