import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CommentTest {

    private final String URL = "http://delfi.lv";
    private final By COMMENTS_MAIN_PAGE = By.xpath(".//a[contains(@class, 'comment-count')]");
    private final By ARTICLE = By.xpath(".//h1[contains(@class, 'headline__title')]");
    private final By COMMENTS_ARTICLE_PAGE = By.xpath(".//a[contains(@class, 'text-red-ribbon')]");
    private final By COMMENTS = By.xpath(".//span[contains(@class, 'type-cnt')]");

    private WebDriver driver;


    @Test
    public void commentTest() {

        //Define driver path
        //Open browser
        //Open homepage
        //Find and save comment count on main page
        //Open article
        //Find and save comment count on article page
        //Check comment count
        //Open comments
        //Find and save comment count in comments section
        //Check comment count
        //Close browser

        //Define driver path
        System.setProperty("webdriver.chrome.driver", "/Users/lieneludborza/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize(); //palielina logu uz maksimumu

        //Open homepage
        driver.get(URL);

        //Find and save comment count on main page
        String commentsMainPage = driver.findElement(COMMENTS_MAIN_PAGE).getText();

        //Open article

        driver.findElement(ARTICLE).click();

        //Find and save comment count on article page
        String commentsArticlePage = driver.findElement(COMMENTS_ARTICLE_PAGE).getText();

        //Check comment count
        Assertions.assertEquals(commentsMainPage, commentsArticlePage, "Incorrect count");

        //Open comments
        driver.findElement(COMMENTS_ARTICLE_PAGE).click();

        //Find and save comment count in comments section

        List<WebElement> Comments = driver.findElements(COMMENTS);

        String anonymousComments = Comments.get(1).getText();
        String registeredComments = Comments.get(0).getText();


        int anonymousCount = Integer.valueOf(anonymousComments.substring(1, anonymousComments.length() - 1));
        int registeredCount = Integer.valueOf(registeredComments.substring(1, registeredComments.length() - 1));
        int totalComments = anonymousCount + registeredCount;


        //Check comment count in comment section

        int commentsArticlePageCompare = Integer.valueOf(commentsArticlePage.substring(1, commentsArticlePage.length() - 1));
        Assertions.assertEquals(commentsArticlePageCompare, totalComments, " Incorrect count of comments in Comment detail page");


    }

    //Close browser
    @AfterEach
    public void closebrowser() {
        driver.close();

    }

}
