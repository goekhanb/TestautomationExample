import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class TestYoutubeSite {
    WebDriver webDriver = null;

    @Before
    public void SetUp(){
        webDriver = new ChromeDriver();
        webDriver.get("https://www.google.de/?gws_rd=ssl");
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Test
    public void testGoogleElements(){
        Youtube youtube = new Youtube(webDriver);
        youtube.openGoogleWebSite("youtube","Blues");
    }



    @After
    public void TearDown(){
        if(webDriver==null){webDriver.quit();}
//    webDriver.quit();
    }



}
