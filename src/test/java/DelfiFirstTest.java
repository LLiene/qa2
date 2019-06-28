import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DelfiFirstTest {

    private String titleToCompare = "KHL spēle: Rīgas 'Dinamo' - 'Severstaļ'. Teksta tiešraide ";
    private final By  TITLE = By.xpath(".//h1[contains(@class, 'headline__title')]");



    @Test
    public void delfiFirstTitleTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/lieneludborza/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //palielina logu uz maksimumu
        driver.get("http://delfi.lv");

        WebElement firstTitle = driver.findElement(TITLE); // izveido jaunu mainīgo ar tipu Webelement, kur ierakstīs funkcijas rezultātu
        String titleText = firstTitle.getText();


        Assertions.assertEquals(titleToCompare, titleText, "Titles are not equal");



    }


}
