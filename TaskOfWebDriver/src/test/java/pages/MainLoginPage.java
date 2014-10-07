package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Object.Users;

public class MainLoginPage extends AbstractClass {

	private final Logger logger = Logger.getLogger(MainLoginPage.class);
	private final String BASE_URL = "https://www.gmail.com/";
	private final String LETTER_URL = "https://mail.google.com/mail";

	@FindBy(id = "Email")
	private WebElement editForEmail;

	@FindBy(id = "Passwd")
	private WebElement editForPassword;

	@FindBy(css = "div.T-I.J-J5-Ji.T-I-KE.L3")
	private WebElement ClickWriteMessage;

	@FindBy(id = "signIn")
	private WebElement buttonSubmit;

	public MainLoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	public void openPage() {
		driver.navigate().to(BASE_URL);
		driver.navigate().to(LETTER_URL);
		logger.info("Login page opened");
	}

	public void newMessage() {

		ClickWriteMessage.click();
		logger.info("Login performed");
	}

	public void login(Users USER1) {
		editForEmail.sendKeys(USER1.getLogin());
		editForPassword.sendKeys(USER1.getPassword());
		// Checkbox.click();
		buttonSubmit.submit();
		logger.info("Login performed");
	}

}
