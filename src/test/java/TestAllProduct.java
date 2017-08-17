import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by goekh on 22.07.2017.
 */
public class TestAllProduct {

    WebDriver webDriver = null;

    @Before
    public void SetUp(){
        webDriver = new ChromeDriver();
        webDriver.get("http://store.demoqa.com");
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Test
    public void verifyTestCaseAllProducts(){
        AllProductClass allProductClass = new AllProductClass(webDriver);
        allProductClass.clickToListInAllProducts();

    }

    @Test
    public void verifyTestCaseSearchProducts(){
        AllProductClass searchProducts = new AllProductClass(webDriver);
        searchProducts.clickToListInAllProducts();
        searchProducts.searchProducts("iPhone");
    }

    @After
    public void TearDown(){
        if(webDriver==null){webDriver.quit();}
//    webDriver.quit();
    }
}
