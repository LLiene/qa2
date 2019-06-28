package OnlineShop.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    private BaseFunk baseFunk;
    private final By SIDE_MENU = By.xpath(".//aside[@id = 'sidebar']");

    //Taisa konstruktoru

    public HomePage(BaseFunk baseFunk) {
        this.baseFunk = baseFunk;
    }

    public void clickonMenuByName(String name) { //šai metodei ir jāatgriež strings, vārds, tāpēc šāds datu tips
        WebElement sideMenu = baseFunk.getElement(SIDE_MENU);
        List<WebElement> items = sideMenu.findElements(By.tagName("li")); //savelk visus itemus, izvelk visus itemus ar tagu li

        //Taisa ciklu, mēģinot atrast mums vajadzigo elementu un uzklikshkinot uz taa

        for (WebElement we : items) { //katrā elementā meklē a tagu, kur ir tas teksts. ja tesksts īstais, uzklikšķinām
            if (we.findElement(By.tagName("a")).getText().equals(name)) {
                we.findElement(By.tagName("a")).click();
                break; //izejam no cikla un vairāk neturpinām
            }
        }



    }
}
