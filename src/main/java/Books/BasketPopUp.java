package Books;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class BasketPopUp extends pageBaseBooks {
    private final static String TITLE = "BasketPopUp";
    public BasketPopUp(WebDriver driver) {
        super(driver, TITLE);
    }
    private WebElement addToBasket = driver.findElement(By.xpath("//*[@href='/basket/addisbn/isbn13/9780131872486']"));
    public BasketPopUp addToBasket() {
        addToBasket.click();
        return new BasketPopUp(driver);
    }
}
