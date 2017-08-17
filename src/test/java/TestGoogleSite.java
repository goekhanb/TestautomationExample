import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by goekh on 23.07.2017.
 */
public class TestGoogleSite {

    WebDriver webDriver = null;


    @Before
    public void SetUp(){
        webDriver = new ChromeDriver();
        webDriver.get("https://www.google.de/?gws_rd=ssl");
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    public void googleElementSite(){
        GoogleSiteElement googleSiteElement = new GoogleSiteElement(webDriver);
        googleSiteElement.searchTextWebElement("Hallo");

    }

    @Test
    public void verifyTestMethod(){
        GoogleSiteElement googleSiteElement = new GoogleSiteElement(webDriver);
        googleSiteElement.testMethod("webmail hochschule Darmstadt");

    }

    @After
    public void TearDown(){
        if(webDriver==null){webDriver.quit();}
    }

}
