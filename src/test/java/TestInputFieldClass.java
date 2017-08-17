import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by goekh on 22.07.2017.
 */
public class TestInputFieldClass {

    WebDriver webDriver = null;

    @Before
    public void SetUp(){
        webDriver = new ChromeDriver();
        webDriver.get("http://store.demoqa.com");
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Test
    public void loginTestWithPOM(){
        WebElement clickToMyAccount = webDriver.findElement(By.className("account_icon"));
        clickToMyAccount.click();

        InputFieldClass inputFieldClass = new InputFieldClass(webDriver);
        inputFieldClass.loginWithCookiesSaved("TestUserName","TestPassword");


    }

    @Test
    public void secondLoginTest(){
        WebElement clickToMyAccount = webDriver.findElement(By.className("account_icon"));
        clickToMyAccount.click();

        InputFieldClass inputFieldClass = new InputFieldClass(webDriver);
        inputFieldClass.loginWithoutCookiesSaved("TestUserName","TestPassword");


    }


    @After
    public void TearDown(){
        if(webDriver==null){webDriver.quit();}
//    webDriver.quit();
    }


}
