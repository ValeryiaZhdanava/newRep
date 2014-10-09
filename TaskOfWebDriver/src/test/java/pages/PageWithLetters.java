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

    @FindBy(xpath = "//div[@class='Am Al editable']/iframe") 
    // class='editable.Lw-avf'
    private WebElement WriteBodyMessage;

    @FindBy(css = "div.T-I.J-J5-Ji.aoO.T-I-atl.L3")
    private WebElement ClickSendMessage;

   
    public PageWithLetters(WebDriver driver) {
	super(driver);
	PageFactory.initElements(this.driver, this);

    }

    @Override
    public void openPage() {
	driver.navigate().to(BASE_URL);
    }

    public void sendMessage(String recipient, String subject, String bodyMes) {
									       
	ClickWriteMessage.click();
	FieldForRecipient.sendKeys(recipient);
	WriteSubject.sendKeys(subject);
	WriteBodyMessage.sendKeys(bodyMes);
	logger.info("Login performed");
    }

}
