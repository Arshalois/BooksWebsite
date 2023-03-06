package Books;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends pageBaseBooks{
    private final static String TITLE = "LoginPage";
    public LoginPage(WebDriver driver) {
        super(driver,TITLE );}

    private WebElement logo = driver.findElement(By.xpath("//*[@src='https://d3ogvdx946i4sr.cloudfront.net/assets/v2.25.81/img/logo.svg']"));

   // WebElement loginField = driver.findElement(By.xpath("//*[@placeholder=\"Email\"]"));
    //private WebElement passwordField = driver.findElement(By.xpath("//*[@placeholder=\"Book Depository password\"]"));
   By enterEmail = By.xpath("//*[@placeholder='Email']");
    public WebElement getLogo(){ //created getter
        return logo;}
    public LoginPage loginTheUser(String login){
        driver.findElement(enterEmail).sendKeys(login);
        return new LoginPage(driver);
    }

        //public LoginPage successfulLogIn(String login, String password) {
            //loginField.sendKeys(login);
           // passwordField.sendKeys(password);
          //  return new LoginPage(driver);}
}
