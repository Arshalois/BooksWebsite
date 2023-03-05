package Books;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage extends pageBaseBooks{
    private final static String TITLE = "CheckOutPage";
    public CheckOutPage(WebDriver driver) {
        super(driver,TITLE );}

   By enterEmail = By.xpath("//*[@name='email']");
  //  private WebElement enterEmail = driver.findElement(By.xpath("//*[@name='email']"));
   By enterPassword = By.xpath("//*[@name='password']");
   // private WebElement enterPassword = driver.findElement(By.xpath("//*[@name='password']"));
    //private WebElement clickToSubmit = driver.findElement(By.id("signInSubmit"));

    public CheckOutPage loginTheUser(String login, String password){
       // enterEmail.sendKeys(login);
        //enterPassword.sendKeys(password);
        driver.findElement(enterEmail).sendKeys(login);
        driver.findElement(enterPassword).sendKeys(password);

     // clickToSubmit.click();
        return new CheckOutPage(driver);
}}
