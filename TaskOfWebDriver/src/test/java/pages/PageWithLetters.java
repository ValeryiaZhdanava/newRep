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
	private WebElement writeMessage;

	@FindBy(id = ":9r")
	private WebElement FieldForRecipient;

	public PageWithLetters(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);

	}

	@Override
	public void openPage() {
		driver.navigate().to(BASE_URL);
	}

	public void sendMessage(String recipient) {// String recipient
		writeMessage.click();
		FieldForRecipient.sendKeys(recipient);

		logger.info("Login performed");
	}

}
