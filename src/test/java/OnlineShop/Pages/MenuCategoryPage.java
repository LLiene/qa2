package OnlineShop.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MenuCategoryPage {

    private BaseFunk baseFunk;
    private final By SIDE_MENU = By.xpath(".//aside[@id = 'sidebar']");

    //kaa katram pagam, taisa konstruktoru

    public MenuCategoryPage (BaseFunk baseFunk) {
        this.baseFunk = baseFunk;
    }

    public void selectCategory(String name) {
        WebElement menu = baseFunk.getElement(SIDE_MENU);
        List<WebElement> items = menu.findElements(By.tagName("li"));


        for (WebElement we: items) {

            if (we.findElement(By.tagName("a")).getText().equals(name)) {
                we.findElement(By.tagName("a")).click();
                break;
            }
        }
    }
}
