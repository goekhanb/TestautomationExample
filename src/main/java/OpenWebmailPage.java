import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OpenWebmailPage {



    /***********webmail elements***********/

    @FindBy(how = How.ID,using ="rcmloginuser")
    WebElement userName;

    @FindBy(how = How.ID,using ="rcmloginpwd")
    WebElement userPassword;

    @FindBy(how = How.ID,using ="rcmloginsubmit")
    WebElement submitBtn;


    /***********write an webmail email******/
    @FindBy(how = How.ID,using="rcmbtn107")
    WebElement clickToWrite;

    @FindBy(how = How.ID,using="_to")
    WebElement emailTo;

    @FindBy(how = How.ID,using = "compose-subject")
    WebElement writeSubject;

    @FindBy(how = How.ID,using ="composebody")
    WebElement writeLetter;

    @FindBy(how=How.CSS,using = "select[name=\"editorSelector\"]")
    WebElement selectEditor;

    @FindBy(how=How.XPATH,using ="//option[@value='plain']")
    WebElement selectPlainText;

    @FindBy(how = How.ID,using="rcmbtn107")
    WebElement sendButton;

    @FindBy(how = How.ID,using ="rcmbtn110")
    WebElement attachElement;

    @FindBy(how=How.ID,using="uploadformInput")
    WebElement uploadFormInput;

    @FindBy(how=How.ID,using="rcmbtn125")
    WebElement upload;

    String file = "C:\\Users\\goekh\\Desktop\\File.txt";

    /**************************************/

    public String get_P_Tag() {
        return writeLetter.getText();
    }

    public void set_P_Tag(String writeLetter) {
        this.writeLetter.sendKeys(writeLetter);
    }

    public OpenWebmailPage(WebDriver driver){
       PageFactory.initElements(driver,this);
   }
    public OpenWebmailPage(){}

    public void webMail(String user,String pwd,String to,String subject,String text) {

            userName.sendKeys(user);
            userPassword.sendKeys(pwd);
            submitBtn.click();
            writeWebEmail(to,subject,text);
    }

    public void writeWebEmail(String to,String subject,String text){

         clickToWrite.click();
         emailTo.sendKeys(to);
         writeSubject.sendKeys(subject);
         selectEditor.click();
         selectPlainText.click();
         writeLetter.sendKeys(text);
         attachElement.click();
         uploadFormInput.sendKeys(file);
         upload.click();
         sendButton.click();

   }



}








