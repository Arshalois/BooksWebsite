package Books;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class SearchResultsPage extends pageBaseBooks {
    private final static String TITLE = "SearchPage";

    public SearchResultsPage(WebDriver driver) {
        super(driver, TITLE);
    }

    private WebElement priceFilter = driver.findElement(By.id("filterPrice"));
    private WebElement priceHighSelect = driver.findElement(By.xpath("//*[@value='high']"));
    private WebElement availabilityFilter = driver.findElement(By.id("filterAvailability"));
    By availabilitySelect = By.xpath("//*[@label ='In Stock (5)']");
    private WebElement langFilter = driver.findElement(By.id("filterLang"));
    By langSelect = By.xpath("//*[@label ='English (17)']");
    private WebElement formatFilter = driver.findElement(By.id("filterFormat"));
    By formatSelect = By.xpath("//*[@label ='Paperback (22)']");
    private WebElement showResults = driver.findElement(By.xpath("//button[contains(text(),'Refine results')]"));
    private List<WebElement> booksNames = driver.findElements(By.xpath("//*[@class='title']"));

    public SearchResultsPage applySomeFilters() {
        priceFilter.click();
        priceHighSelect.click();
        availabilityFilter.click();
        driver.findElement(availabilitySelect).click();
        langFilter.click();
        driver.findElement(langSelect).click();
        formatFilter.click();
        driver.findElement(formatSelect).click();
        showResults.click();
        return new SearchResultsPage(driver);
    }
    public List<String> getBooksList() {
        List<String> booksList = booksNames.stream().map(rep -> rep.getText()).collect(Collectors.toList());
        return booksList;
    }
}
