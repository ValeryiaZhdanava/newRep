package pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpamPage extends AbstractClass {
	private final Logger logger = Logger.getLogger(SpamPage.class);
	private final String SPAM_URL = "https://mail.google.com/mail/u/1/#spam";

	int k = 0;

	@FindBy(id = "gbqfq")
	private WebElement inputText;

	@FindBy(xpath = "//span[@class='gbqfi gb_Ia']")
	private WebElement inputSearch;

	@FindBy(xpath = "//div[@class='zA zE']")
	private List<WebElement> allLetters;

	public void ToSeeSpam() {
		inputText.click();
		inputText.sendKeys("in:spam");
		inputSearch.click();

	}

	public void CheckNumberOfLetters() {

		for (int i = 0; i < allLetters.size(); i++) {
			String email = allLetters.get(i).getAttribute("email");
			if (email.equals("valery6693@gmail.com")) {
				k++;
			}
			if (k == 2) {
				logger.info("The test is successful");// return true;
			}

		}
		logger.info("The test is faild");
		// return false;
		// logger.info("The test is failed");

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
