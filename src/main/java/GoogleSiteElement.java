import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GoogleSiteElement {

    /***********google elements***********/
    @FindBy(how = How.ID,using ="lst-ib")
    WebElement googleSearchBox;

    @FindBy(how = How.NAME,using="btnK")
    WebElement googleSubmit;

    @FindBy(how = How.LINK_TEXT,using="Hallo – Wikipedia")
    WebElement googleLinkText;

    @FindBy(how = How.LINK_TEXT ,using="IT-Service - Hochschule Darmstadt / University of Applied Sciences")
    WebElement googleWebMailLink;

    @FindBy(how = How.XPATH,using = "(//a[contains(text(),'Webmail für Studierende')])[2]")
    WebElement clickWebMailStudent;

    /**************************************/

    public GoogleSiteElement(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void searchTextWebElement (String text){

        googleSearchBox.sendKeys(text.toString());
        googleSubmit.click();
        googleLinkText.click();

    }

    public void testMethod(String url){
        googleSearchBox.sendKeys(url);
        googleSubmit.click();
        googleWebMailLink.click();
        clickWebMailStudent.click();
    }

}
