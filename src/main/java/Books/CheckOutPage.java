package Books;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage extends pageBaseBooks {
    private final static String TITLE = "CheckOutPage";

    public CheckOutPage(WebDriver driver) {
        super(driver, TITLE);
    }

    private WebElement userEmail = driver.findElement(By.xpath("//*[@aria-label='Email address (for order confirmation)']"));
    private WebElement userName = driver.findElement(By.xpath("//*[@name='delivery-fullName']"));
    private WebElement deliveryCountry = driver.findElement(By.id("deliveryCountryDropdown"));
    By deliveryCountrySelect = By.xpath("//*[@name ='option-AT']");
    By enterAddressManually = By.name("manualEntryButton");
   // By enterAddressLine1 = By.name("delivery-addressLine1");
   private WebElement buyNowButton = driver.findElement(By.id("buyNowButton"));


    public CheckOutPage enterDeliveryInfo(String login, String name) {
        userEmail.sendKeys(login);
        userName.sendKeys(name);
        deliveryCountry.click();
        driver.findElement(deliveryCountrySelect).click();
        driver.findElement(enterAddressManually).click();
        driver.findElement(enterAddressManually).click();
       // driver.findElement(enterAddressLine1).sendKeys("Address 1");
        buyNowButton.click();
        return new CheckOutPage(driver);
    }

   /*By enterEmail = By.xpath("//*[@name='email']");//*[@placeholder='Email']
  //  private WebElement enterEmail = driver.findElement(By.xpath("//*[@name='email']"));
   //By enterPassword = By.xpath("//*[@name='password']");
   // private WebElement enterPassword = driver.findElement(By.xpath("//*[@name='password']"));
    //private WebElement clickToSubmit = driver.findElement(By.id("signInSubmit"));

    public CheckOutPage loginTheUser(String login, String password){
       // enterEmail.sendKeys(login);
        //enterPassword.sendKeys(password);
        driver.findElement(enterEmail).sendKeys(login);
        driver.findElement(enterPassword).sendKeys(password);

     // clickToSubmit.click();
        return new CheckOutPage(driver);
}

    */
}
