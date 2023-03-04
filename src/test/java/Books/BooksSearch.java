package Books;

import org.junit.jupiter.api.Test;


public class BooksSearch extends BooksTestBase{

   @Test
    public void goToSearchPage(){
       SearchPage searchPage = new SearchPage(driver);
       searchPage.searchForJavaBooks("Thinking in Java");
       searchPage.clickSearch();
       SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
       searchResultsPage.applySomeFilters();

}}
