package Books;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends pageBaseBooks{
    private final static String TITLE = "LoginPage";
    public LoginPage(WebDriver driver) {
        super(driver,TITLE );}

    WebElement loginField = driver.findElement(By.xpath("//*[@placeholder=\"Email\"]"));
    private WebElement passwordField = driver.findElement(By.xpath("//*[@placeholder=\"Book Depository password\"]"));
        public LoginPage successfulLogIn(String login, String password) {
            loginField.sendKeys(login);
            passwordField.sendKeys(password);
            return new LoginPage(driver);
}}
