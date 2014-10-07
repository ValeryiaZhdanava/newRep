package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageWithLetters extends AbstractClass {

    private final Logger logger = Logger.getLogger(MainLoginPage.class);
    private final String BASE_URL = "https://mail.google.com/mail";

    @FindBy(css = "div.T-I.J-J5-Ji.T-I-KE.L3")
    // css = "div.T-I.J-J5-Ji.T-I-KE.L3")
    private WebElement ClickWriteMessage;

    @FindBy(xpath = "//textarea[@name='to']")
    private WebElement FieldForRecipient;

    @FindBy(xpath = "//input[@name='subjectbox']")
    private WebElement WriteSubject;

    @FindBy(xpath = "//body") ////div[@id=':ch']/iframe
    // class='editable.Lw-avf'
    private WebElement WriteBodyMessage;

    @FindBy(css = "div.T-I.J-J5-Ji.aoO.T-I-atl.L3")
    private WebElement ClickSendMessage;

    @FindBy(css = "div.gb_Xa.gb_7.gb_Pc.gb_f")
    private WebElement ClickAccount;

    @FindBy(id = "gb_71")
    private WebElement ClickExit; // gb_0b gb_6b gb_V

    @FindBy(id = "remove-link")
    private WebElement RemoveLink;

    public PageWithLetters(WebDriver driver) {
	super(driver);
	PageFactory.initElements(this.driver, this);

    }

    @Override
    public void openPage() {
	driver.navigate().to(BASE_URL);
    }

    public void sendMessage(String recipient, String subject, String bodyMes) {// String
									       // recipient
	ClickWriteMessage.click();

	FieldForRecipient.sendKeys(recipient);
	WriteSubject.sendKeys(subject);
	WriteBodyMessage.sendKeys(bodyMes);
	ClickSendMessage.click();
	//ClickAccount.click();
	//ClickExit.click();
	
	logger.info("Login performed");
    }

}
