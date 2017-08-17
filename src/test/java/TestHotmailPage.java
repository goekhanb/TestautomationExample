import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by goekh on 25.07.2017.
 */
public class TestHotmailPage {
    WebDriver webDriver = null;

    @Before
    public void TearDown(){
        webDriver = new ChromeDriver();
        webDriver.get("https://www.hotmail.de");

        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void openingInputTest(){
        HotmailClass hotmailClass = new HotmailClass(webDriver);
        hotmailClass.inputUserData("goekhan.bastan@hotmail.de","medtronic");
        //hotmailClass.searchEmail("Hallo");
    }


    @After
    public void down(){
     if(webDriver==null){ webDriver.quit();}
    }

}
