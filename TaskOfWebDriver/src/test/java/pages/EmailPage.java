package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Utils;

public class EmailPage extends AbstractClass {
	private final Logger logger = Logger.getLogger(EmailPage.class);

	@FindBy(css = "textarea.vO")
	private WebElement inputAdress;

	@FindBy(xpath = "//input[@name='subjectbox']")
	private WebElement writeSubject;

	@FindBy(xpath = "//div[@class='Am Al editable']/iframe")
	private WebElement writeBodyMessage;

	@FindBy(xpath = "//div[@class='T-I J-J5-Ji aoO T-I-atl L3']")
	private WebElement clickSendMessage;

	public void newMessage() {

		inputAdress.sendKeys("valery66934@gmail.com");//
		writeSubject.sendKeys(Utils.getRandomString(6));
		writeBodyMessage.sendKeys("Heelogit!!!!");
		clickSendMessage.click();

		logger.info("Login performed");
	}

	public EmailPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	public void openPage() {
		// driver.navigate().to(BASE_URL);
		logger.info("Login page opened");
	}
}
