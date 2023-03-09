package Books;

import helpers.Level;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static helpers.ColorPrinter.printColorMessage;

public class CheckOutPage extends pageBaseBooks {
    private final static String TITLE = "CheckOutPage";

    public CheckOutPage(WebDriver driver) {
        super(driver, TITLE);
    }
    private WebElement userEmail = driver.findElement(By.xpath("//*[@aria-label='Email address (for order confirmation)']"));
    private WebElement userName = driver.findElement(By.xpath("//*[@name='delivery-fullName']"));
    private WebElement deliveryCountry = driver.findElement(By.id("deliveryCountryDropdown"));
    By deliveryCountrySelect = By.xpath("//*[@name ='option-AT']");
    By enterAddressManually = By.xpath("//button[contains(text(), 'Enter address manually')]");
   private WebElement buyNowButton = driver.findElement(By.id("buyNowButton"));
    public CheckOutPage enterDeliveryInfo(String login, String name, int card) {
        userEmail.sendKeys(login);
        userName.sendKeys(name);
        deliveryCountry.click();
        driver.findElement(deliveryCountrySelect).click();
        driver.findElement(enterAddressManually).click();
        driver.findElement(enterAddressManually).click();
        buyNowButton.click();
        buyNowButton.click();
        log.info("Checkout complete");
        printColorMessage("Checkout complete", log, Level.INFO);
        return new CheckOutPage(driver);
    }
}
