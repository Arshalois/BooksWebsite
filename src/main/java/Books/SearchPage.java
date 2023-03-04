package Books;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends pageBaseBooks{
    private final static String TITLE = "SearchPage";
   public SearchPage(WebDriver driver) {
       super(driver,TITLE );
    }


    private WebElement searchField = driver.findElement(By.xpath("//*[@placeholder='Search for books by keyword / title / author / ISBN']"));
    WebElement clickSearch = driver.findElement(By.xpath("//*[@class='header-search-btn']"));


    public SearchPage searchForJavaBooks (String text){
        searchField.sendKeys(text);
        return new SearchPage(driver);
    }
    public SearchResultsPage clickSearch (){
        clickSearch.click();
       return new SearchResultsPage(driver);
    }
}
