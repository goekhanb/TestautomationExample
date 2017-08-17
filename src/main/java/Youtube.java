import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by goekh on 19.07.2017.
 */
public class Youtube {

    //Google
    @FindBy(how = How.ID,using ="lst-ib")
    WebElement googleSearchText;

    @FindBy(how = How.NAME,using ="btnK")
    WebElement googleSearchButton;

    //YouTube

    @FindBy(how = How.LINK_TEXT,using ="YouTube")
    WebElement openYoutubeLink;

    @FindBy(how = How.ID,using ="masthead-search-term")
    WebElement youtubeSearchText;

    @FindBy(how = How.ID,using ="search-btn")
    WebElement youtubeSearchButton;

    @FindBy(how = How.LINK_TEXT,using ="Best of Blues, from Mississipi to Chicago")
    WebElement youtubeLink;

    @FindBy(how = How.LINK_TEXT,using ="Jazz and Blues Experience")
    WebElement link;

    public Youtube(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void openGoogleWebSite(String searchText,String title){
        googleSearchText.sendKeys(searchText);
        googleSearchButton.click();
        openYoutubeLink.click();

        this.openYoutubeLink(title);

    }

    public void openYoutubeLink(String title){

        youtubeSearchText.sendKeys(title);
        youtubeSearchButton.click();
        youtubeLink.click();
        link.click();

    }





}
