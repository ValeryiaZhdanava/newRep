package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpamPage extends AbstractClass {
	private final Logger logger = Logger.getLogger(MainLoginPage.class);
	private final String SPAM_URL = "https://mail.google.com/mail/u/1/#spam";
	WebDriverWait wait = new WebDriverWait(driver, 100);

	// @FindBy(xpath = "//div[@class='TN.GLujEb']")
	// private WebElement inputSpam;

	@FindBy(id = "gbqfq")
	private WebElement inputText;
	
	@FindBy(xpath = "//span[@class='gbqfi gb_Fa']") //gbqfi gb_Fa
	private WebElement inputSearch;  //gbqfb

	public void ToSeeSpam() {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By
//				.xpath("//div[@class='Cp']"))); 
												
		inputText.click();
		inputText.sendKeys("in:spam");
		inputSearch.click();

	}

	public SpamPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	public void openPage() {
		driver.navigate().to(SPAM_URL);
		logger.info("Login page opened");
	}

}
