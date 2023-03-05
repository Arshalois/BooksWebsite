package Books;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasketPopUp extends pageBaseBooks{
    private final static String TITLE = "BasketPopUp";
    public BasketPopUp(WebDriver driver) {
        super(driver,TITLE );
    }
    private WebElement addToBasket = driver.findElement(By.xpath("//*[@data-price = '85.63']"));


    public BasketPopUp addToBasket(){
        addToBasket.click();
        return new BasketPopUp(driver);
}}
