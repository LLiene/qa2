package OnlineShop.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CatalogPage {

    //Taisa Basefunk
    private BaseFunk baseFunk;
    private final By CATALOG_ITEM = By.xpath(".//div[(@class =  'area')])");


    //Taisa konstruktoru
    public CatalogPage(BaseFunk baseFunk) {
        this.baseFunk = baseFunk;
    }

    //Taisa funkciju, lai dabutu listu ar elementiem
    public WebElement getItemById (int id) { //atdod elementu id kā integeru
        return baseFunk.getElements(CATALOG_ITEM).get(id);
    }
}
