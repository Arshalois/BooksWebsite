package Books;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage extends pageBaseBooks{
    private final static String TITLE = "SearchPage";
    public SearchResultsPage(WebDriver driver) {
        super(driver,TITLE );
}
    private WebElement priceFilter = driver.findElement(By.id("filterPrice"));
    private WebElement priceHighSelect = driver.findElement(By.xpath("//*[@value='high']"));
    private WebElement availabilityFilter = driver.findElement(By.id("filterAvailability"));
     By availabilitySelect = By.xpath("//*[@label ='In Stock (5)']");
    private WebElement langFilter = driver.findElement(By.id("filterLang"));
    By langSelect = By.xpath("//*[@label ='English (4)']");
   // private WebElement langSelect = driver.findElement(By.xpath("//*[@label ='English (4)']"));
    private WebElement showResults = driver.findElement(By.xpath("/html/body/div[3]/div[6]/div[4]/div[1]/div/form/div[6]/button"));

    public SearchResultsPage applySomeFilters (){
        priceFilter.click();
        priceHighSelect.click();
        availabilityFilter.click();
        driver.findElement(availabilitySelect).click();
        langFilter.click();
       // langSelect.click();
        //driver.findElement(langSelect).click();

      // showResults.click();
        return new SearchResultsPage(driver);

}}
