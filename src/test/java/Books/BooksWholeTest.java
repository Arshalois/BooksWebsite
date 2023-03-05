package Books;

import org.junit.jupiter.api.Test;


public class BooksWholeTest extends BooksTestBase{

   @Test
    public void SearchForBook(){
       SearchPage searchPage = new SearchPage(driver);
       searchPage.searchForJavaBooks("Thinking in Java");
       searchPage.clickSearch();
       SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
       searchResultsPage.applySomeFilters();
}
@Test
   public void goToBasketPage(){
   SearchPage searchPage = new SearchPage(driver);
   searchPage.searchForJavaBooks("Thinking in Java");
   searchPage.clickSearch();
   SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
   searchResultsPage.applySomeFilters();
   BasketPopUp basketPopUp = new BasketPopUp(driver);
   basketPopUp.addToBasket();
   BasketPage basketPage = new BasketPage(driver);
   basketPage.myBasket();}

   @Test
           public void Login(){
      driver.get("https://www.bookdepository.com/account/login/to/account");
   LoginPage loginPage = new LoginPage(driver);
   loginPage.successfulLogIn("test", "test2");
}

}
