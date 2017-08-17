import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by goekh on 22.07.2017.
 */
public class InputFieldClass {

    /*@FindBy(how = How.LINK_TEXT, using = "Your Account")
    WebElement yourAccount;*/

    @FindBy(how = How.ID,using ="log")
    WebElement inputUserName;

    @FindBy(how = How.ID,using = "pwd")
    WebElement inputPassword;

    @FindBy(how = How.ID,using = "rememberme")
    WebElement inputRememberMe;

    @FindBy(how = How.ID,using = "login")
    WebElement inputLogin;


    public InputFieldClass(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void loginWithCookiesSaved(String username,String password){
         inputUserName.sendKeys(username);
         inputPassword.sendKeys(password);
         inputLogin.click();
    }

    public void loginWithoutCookiesSaved(String username,String password){
        inputUserName.sendKeys(username);
        inputPassword.sendKeys(password);
        inputRememberMe.click();
        inputLogin.click();
    }



}
