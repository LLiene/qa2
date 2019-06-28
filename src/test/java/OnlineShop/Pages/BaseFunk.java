package OnlineShop.Pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseFunk {

        private WebDriver driver;
        //vienmer public, nekad nav pat void(neko neatgriez) vienmer nosaukus tads pats sakas ar lielo
        public BaseFunk() {

            System.setProperty("webdriver.chrome.driver", "/Users/lieneludborza/Downloads/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }

        public void goToUrl(String url) {

            if (!url.startsWith("http://") && !url.startsWith("https://")) {
                url = "http://" + url;
            }

            driver.get(url);

        }

        public List<WebElement> getElements(By locator) {
            List<WebElement> elements =  driver.findElements(locator);
            Assertions.assertFalse(elements.isEmpty(),"List of elements is empty");
            return elements;

        }

        public WebElement getElement (By locator) {
            return driver.findElement(locator);
        }

}

