package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Utils;

public class MainLoginPage extends AbstractClass {

	private final Logger logger = Logger.getLogger(MainLoginPage.class);
	// private final String BASE_URL = "https://www.gmail.com/";
	private final String BASE_URL = "https://mail.google.com/mail/";
	WebDriverWait wait = new WebDriverWait(driver, 150);

	@FindBy(id = "Email")
	private WebElement inputLogin;

	@FindBy(id = "Passwd")
	private WebElement inputPassword;

	@FindBy(id = "signIn")
	private WebElement buttonSubmit;

	@FindBy(css = "div.T-I.J-J5-Ji.T-I-KE.L3")
	private WebElement clickWriteMessage;

	@FindBy(css = "textarea.vO")
	// textarea[@name='to']
	private WebElement inputAdress;

	@FindBy(xpath = "//input[@name='subjectbox']")
	private WebElement writeSubject;

	@FindBy(xpath = "//div[@class='Am Al editable']/iframe")
	private WebElement writeBodyMessage;

	@FindBy(xpath = "//div[@class='T-I J-J5-Ji aoO T-I-atl L3']")
	private WebElement clickSendMessage;

	@FindBy(xpath = "//div[@class='T-Jo-auh']")
	private WebElement chooseLetter;

	@FindBy(xpath = "//div[@class='asl T-I-J3 J-J5-Ji']")
	private WebElement inputToSpam;

	@FindBy(xpath = "//div[@class='ae4.aDM']")
	private WebElement theFirstLetter;

	public MainLoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	public void openPage() {
		driver.navigate().to(BASE_URL);
		logger.info("Login page opened");
	}

	public void login(String login, String password) {
		inputLogin.sendKeys(login);
		inputPassword.sendKeys(password);
		buttonSubmit.submit();
		logger.info("Login performed");
	}

	public void newMessage() {
	
		clickWriteMessage.click();
		inputAdress.sendKeys("valery66934@gmail.com");
		writeSubject.sendKeys(Utils.getRandomString(6));
		writeBodyMessage.sendKeys("Heelogit!!!!");
		clickSendMessage.click();

		logger.info("Login performed");
	}

	public void setSpam() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//div[@class='Cp']")));
		chooseLetter.click();
		inputToSpam.click();

	}

}
