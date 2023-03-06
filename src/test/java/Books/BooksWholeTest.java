package Books;

import org.bouncycastle.asn1.dvcs.DVCSObjectIdentifiers;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;


public class BooksWholeTest extends BooksTestBase {

    @Test
    public void SearchForBookAndCheckTheBooksList() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchForJavaBooks("Thinking in Java");
        searchPage.clickSearch();
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.applySomeFilters();
        List<String> expectedBooksList = new ArrayList<>();
        expectedBooksList.add("Thinking in Java");
        expectedBooksList.add("Think Java");
        expectedBooksList.add("Thinking Recursively - A 20th Anniversary Edition with Java (WSE)");
        expectedBooksList.add("Think Data Structures");
        SearchResultsPage searchResultsPage2 = new SearchResultsPage(driver);
        Assert.assertEquals(expectedBooksList, searchResultsPage2.getBooksList());
    }

    @Test
    public void addToBasket() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchForJavaBooks("Thinking in Java");
        searchPage.clickSearch();
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.applySomeFilters();
        BasketPopUp basketPopUp = new BasketPopUp(driver);
        basketPopUp.addToBasket();
        BasketPage basketPage = new BasketPage(driver);
        basketPage.myBasket();
    }


    @Test
    public void fillDeliveryInfo() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchForJavaBooks("Thinking in Java");
        searchPage.clickSearch();
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.applySomeFilters();
        BasketPopUp basketPopUp = new BasketPopUp(driver);
        basketPopUp.addToBasket();
        BasketPage basketPage = new BasketPage(driver);
        basketPage.myBasket();
        CheckOutPage checkOutPage = new CheckOutPage(driver);
        checkOutPage.enterDeliveryInfo("test@test.com", "John Sm");

    }

    @Test
    public void Login() {
        driver.get("https://www.bookdepository.com/account/login/to/account");
        LoginPage loginPage = new LoginPage(driver);
        Assertions.assertTrue(loginPage.getLogo().isDisplayed());
        loginPage.loginTheUser("dsdssz");
        // LoginPage loginPage = new LoginPage(driver);
        // loginPage.successfulLogIn("test", "test2");
    }

}
