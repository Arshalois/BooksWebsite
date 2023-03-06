package Books;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BooksTestBase {
    WebDriver driver;

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/arshaluis/IdeaProjects/AutoTestProject/src/main/resources/drivers/chromedriver");
       Logger logger = (Logger) LogManager.getLogger("Chrome Driver starting");
       logger.info("Smth to test if logs are working");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.bookdepository.com/");

    }
  //  @AfterEach
   void tearDown() {
       driver.quit();
    }
}

