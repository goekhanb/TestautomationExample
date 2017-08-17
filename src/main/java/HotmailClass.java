import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by goekh on 25.07.2017.
 */
public class HotmailClass {

    @FindBy(how=How.ID,using = "i0116")
    private WebElement inputUserName;
    public WebElement getInputUserName(){return inputUserName;}

    @FindBy(how=How.ID,using="idSIButton9")
    private WebElement submitInputData;
    public WebElement getSubmitInputData(){return submitInputData;}

    @FindBy(how=How.ID,using="i0118")
    private WebElement inputPassword;
    public WebElement getInputPassword(){return inputPassword;}

    //hier müsste man, ausschließlich bei identischen ID's "idSIButton9", mit dem XPATH arbeiten.
    @FindBy(how=How.ID,using="idSIButton9")
    private WebElement submitInputData__;
    public WebElement getSubmitInputData__(){return submitInputData__;}

    @FindBy(how=How.XPATH,
    using = "//div[@id='primaryContainer']/div[5]/div/div/div/div/div[2]/div/div/div[2]/button")
    private WebElement searchText;

    @FindBy(how = How.XPATH,using = "//div[2]/div/div/div[2]/div/div/div/button")
    private WebElement searchButton;

    public HotmailClass(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void inputUserData(String userEmail,String password){

        this.getInputUserName().sendKeys(userEmail);
        this.getSubmitInputData().click();
        this.getInputPassword().sendKeys(password);
        this.getSubmitInputData__().click();

    }

    public void searchEmail(String text){

        searchText.sendKeys(text);
        searchButton.click();
    }



}
