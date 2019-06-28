package OnlineShop;

import OnlineShop.Pages.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;


public class OnlineShopTest {

    private final String URL = "1a.lv";
    private BaseFunk baseFunk = new BaseFunk();

    @Test
    public void checkPrice() {

        baseFunk.goToUrl(URL);
        HomePage homePage = new HomePage(baseFunk);
        homePage.clickonMenuByName("Datortehnika, preces birojam");

        MenuCategoryPage mainCategoryPage = new MenuCategoryPage(baseFunk);
        mainCategoryPage.selectCategory("Portatīvie datori un aksesuāri");

        SubCategoryPage subCategoryPage = new SubCategoryPage(baseFunk);
        subCategoryPage.selectSubCategory("Portatīvie datori");

        CatalogPage catalogPage = new CatalogPage(baseFunk);
        WebElement item = catalogPage.getItemById(3); //pieglabā webelementam, jo tālāk ar to ir jāstrādā

    }

}
