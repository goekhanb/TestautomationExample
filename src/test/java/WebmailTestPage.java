import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class WebmailTestPage{
    WebDriver webDriver = null;


    @Before
    public void SetUp(){
        webDriver = new ChromeDriver();
        webDriver.get("https://webmail.stud.h-da.de/stud/index.php");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
    public void testWebmail(){
        OpenWebmailPage openWebmailPage = new OpenWebmailPage(webDriver);
        openWebmailPage.webMail("stgobast","Medtronic213","goekhan.bastan@stud.h-da.de" + "," + "goekhan.bastan@hotmail.de",
                "TestAutomation", "Hallo lieber User,"+ "\n\ndas ist ein Test zur Testautomatisierung.\n\n" +
                        "Wir bitten dich, diese Nachricht zu ignorieren.\n\n" +
                        "Freundliche Grüße\n\n\n" +
                        "Team Testautomatisierung");
    }




    @After
    public void TearDown(){
        if(webDriver==null){webDriver.quit();}
    }



}
