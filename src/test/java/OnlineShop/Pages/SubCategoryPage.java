package OnlineShop.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SubCategoryPage {

    private BaseFunk baseFunk;
    private final By SIDE_MENU = By.xpath(".//ul[@class = 'level-3']/li");



    public SubCategoryPage (BaseFunk baseFunk) {
        this.baseFunk = baseFunk;
    };

    //Funkcija, kas uzklikskina uz objekta

    public void selectSubCategory(String name) {
        List<WebElement> items = baseFunk.getElements(SIDE_MENU);

        //atrodam to specifisko elementu, dabujam tekstu, salidzinam ar doto, ja ir tad kliksjinam un izejam ārā no cikla
        for (WebElement we: items) {

            if (we.findElement(By.tagName("a")).getText().contains(name)) {
                we.findElement(By.tagName("a")).click();
                break;
            }
        }
    }

}
