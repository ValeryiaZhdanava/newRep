package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainLoginPage extends AbstractClass {

	private final Logger logger = Logger.getLogger(MainLoginPage.class);
	private final String BASE_URL = "https://www.gmail.com/";

	@FindBy(id = "Email")
	private WebElement editForEmail;

	@FindBy(id = "Passwd")
	private WebElement editForPassword;

	@FindBy(id = "signIn")
	private WebElement buttonSubmit;

	public MainLoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	public void openPage() {
		driver.navigate().to(BASE_URL);
		// logger.info("Login page opened");
	}

	public void login(String email, String password) {
		editForEmail.sendKeys(email);
		editForPassword.sendKeys(password);
		buttonSubmit.submit();
		logger.info("Login performed");
	}

}