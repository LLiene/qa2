import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class KasJaunsArticleTest {

    private final String URL = "https://jauns.lv/";
    private WebDriver driver;
    private final By SECOND_ARTICLE = By.xpath(".//h2[contains(@class, 'article-poster-simple')]");
    private final By SECOND_ARTICLE_LINK = By.xpath(".//a[contains(@class, 'article-poster-simple')]");
    private final By ARTICLE_PAGE_TITLE = By.xpath(".//span[@class =  'heading__text']");
    private final By COMMENT_COUNT = By.className("comment-count__number");

//.//h2[contains(@class, 'article-poster-simple')]

    @Test
    public void kasJaunsArticleTest() {
        //Open browser
        //Open homepage
        //Find Second Article
        //Save second Article
        //Find comments to second article
        //Save comments
        //Open article
        //Find second Articles title
        //Save second Articles title
        //Find comments in second article
        //Save comments in second article
        //Check that article match
        //Check that comments match


        //Open browser
        System.setProperty("webdriver.chrome.driver", "/Users/lieneludborza/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize(); //palielina logu uz maksimumu

        //Open home page
        driver.get(URL);

        //Find and save second article
        String secondArticle = driver.findElement(SECOND_ARTICLE).getText().replaceAll("\\d","");


        //Find and save comment in Article page
        List<WebElement> Comments = driver.findElements(COMMENT_COUNT);
        String secondArticleTitleCommentsCount = Comments.get(2).getText();

        int secondArticleTitleComments = Integer.valueOf(secondArticleTitleCommentsCount);


        //Open article
        driver.findElement(SECOND_ARTICLE_LINK).click();

        //Find second Article title
        String articleTextOpened = driver.findElement(ARTICLE_PAGE_TITLE).getText().replaceAll("\\d","");
        System.out.println(articleTextOpened + "      article text when opened");
        System.out.println(secondArticle + "     second article ");

        //Find and save comment in Article page

     //  driver.findElements(COMMENT_COUNT).isEmpty() ? commentOpenedPage = 0 : commentOpenedPage = Integer.valueOf(driver.findElement(COMMENT_COUNT).getText());




        //Check that article match
        Assertions.assertEquals(secondArticle, articleTextOpened, "Do not match");

        //Check that comments match
     //   Assertions.assertEquals(secondArticleTitleComments, commentOpenedPage, "Do not match");

     //   System.out.println(secondArticleTitleComments + "           " + commentOpenedPage );


    }

    //Close browser
    @AfterEach
    public void closebrowser() {
        driver.close();

    }

   // private String [] getTitleAndComments(By locator){
     //  return driver.findElement(locator).getText().split("\n");
    //}

}
