import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DelfiHomeWork {

    private final String URL = "http://delfi.lv";
    private final By TITLE = By.xpath(".//h1[contains(@class, 'headline__title')]"); // final nevar tikt mainīts, nevar likt citu datu tipu
    private final By COMMENT_COUNT = By.xpath(".//a[contains(@class, '28 text-red-ribbon')]");
    private final By ARTICLE_PAGE_TITLE = By.xpath(".//h1[contains(@class, 'd-inline')]");
    private final By COMMENTS_PAGE_TITLE = By.xpath(".//h1[(@class = 'article-title')]/a"); //iet soli zemām ar /
   // private final By commentsInPage = By.xpath(".//div[contains(@class, 'article-title')]");
   // private final By commentOpenedPage = By.xpath(".//a[contains(@class, 'comment-count')]");

private WebDriver driver;

    @Test
    public void delfiCommentTest() {

        //Test plan
        //Define driver path
        //Open browser
        //Open homepage
        //Find first title
        //Save first title - Tas ir vajadzigs, jo atverot lapu, mainisies DOM un elements vairs nebus accesable. Saglaba ieliekot mainigaja.
        //To dara Webelementu parveidojot uz String vai Integer
        //Click on title
        //Find comment count
        //Click on comments
        //Find title
        //Save title
        //Compare title
        //Close browser



        System.setProperty("webdriver.chrome.driver", "/Users/lieneludborza/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);

        WebElement title = driver.findElement(TITLE);

        String titleText = title.getText();

        title.click();

        String titleTextOpened = driver.findElement(ARTICLE_PAGE_TITLE).getText();
        Assertions.assertEquals(titleText, titleTextOpened, "Wrong article page title!");

// Open comment section

        driver.findElement(COMMENT_COUNT).click(); //nesaglaba ieksh webelement jo tam izmanto tikai click

        String commentPageArticle = driver.findElement(COMMENTS_PAGE_TITLE).getText();

        Assertions.assertEquals(titleText, commentPageArticle);

//Close browser


        System.out.println(titleText);
        System.out.println(titleTextOpened);

    }

    @AfterEach
    public void closebrowser() {
        driver.close();

    }



}
