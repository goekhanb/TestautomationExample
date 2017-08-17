import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by goekh on 22.07.2017.
 */

public class AllProductClass {

    @FindBy(how = How.LINK_TEXT,using ="All Product")
    WebElement clickLinkText;

    @FindBy(how = How.LINK_TEXT,using ="Default")
    WebElement clickToListIcon;

    @FindBy(how = How.NAME,using ="s")
    WebElement searchProduct;

    @FindBy(how = How.CLASS_NAME,using ="searchform")
    WebElement searchSubmit;



    public AllProductClass(WebDriver webDriver){
        PageFactory.initElements(webDriver,this);
    }

    public void clickToListInAllProducts(){
        clickLinkText.click();
        clickToListIcon.click();
    }

    public void searchProducts(String product){
        searchProduct.sendKeys(product);
        searchSubmit.submit();
    }


}
