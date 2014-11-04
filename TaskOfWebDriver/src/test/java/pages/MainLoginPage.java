package pages;

//import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainLoginPage extends AbstractClass {

	// private final Logger logger = Logger.getLogger(MainLoginPage.class);
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

	@FindBy(xpath = "//div[@class='T-Jo-auh']")
	private WebElement chooseLetter;

	@FindBy(xpath = "//div[@class='asl T-I-J3 J-J5-Ji']")
	private WebElement inputToSpam;

	@FindBy(xpath = "//div[@class='ae4 aDM']")
	private WebElement theFirstLetter;

	@FindBy(xpath = "//div[@class='aos T-I-J3 J-J5-Ji']")
	private WebElement buttonSetting;

	@FindBy(xpath = "//div[@class='J-N aMS']")
	private WebElement buttonSettingInContextMenu;

	@FindBy(xpath = "//td[@class='xY a4W']")
	private WebElement openLetter;

	@FindBy(id = "gbqfq")
	private WebElement inputText;

	@FindBy(xpath = "//span[@class='gbqfi gb_Na']")
	private WebElement inputSearch;

	public MainLoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	public void openPage() {
		driver.navigate().to(BASE_URL);
	}

	public void login(String login, String password) {
		inputLogin.sendKeys(login);
		inputPassword.sendKeys(password);
		buttonSubmit.submit();
	}

	public void goToTrash() {
		inputText.click();
		inputText.sendKeys("in:trash");
		inputSearch.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//div[@class='yW']")));
	}

	public void goToSpam() {
		inputText.click();
		inputText.sendKeys("in:spam");
		inputSearch.click();
	}

	public void goToInbox() {
		inputText.click();
		inputText.sendKeys("in:inbox");
		inputSearch.click();
	}

	public void clickNewMessage() {

		clickWriteMessage.click();
	}

	public void setSpam() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//div[@class='Cp']")));
		chooseLetter.click();
		inputToSpam.click();
	}

	public void inputSetting() {
		buttonSetting.click();
		buttonSettingInContextMenu.click();
	}

	public void openLetter() {
		openLetter.click();
	}

}
