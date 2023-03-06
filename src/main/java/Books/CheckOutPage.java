package Books;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage extends pageBaseBooks{
    private final static String TITLE = "CheckOutPage";
    public CheckOutPage(WebDriver driver) {
        super(driver,TITLE );}
    private WebElement freeDelivery = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/dl/dd/strong"));
    private WebElement userEmail = driver.findElement(By.xpath("//*[@aria-label='Email address (for order confirmation)']"));
    public WebElement getFreeDeliveryValue(){
        return freeDelivery;}

    public CheckOutPage loginTheUser(String login){
        userEmail.sendKeys(login);
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

    */}
