package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpamPage extends AbstractClass {
	private final Logger logger = Logger.getLogger(MainLoginPage.class);
	private final String BASE_URL = "https://mail.google.com/mail/#spam";

	@FindBy(xpath = "//div[@class='G-asx T-I-J3 J-J5-Ji']")
	private WebElement clickAllCategory;
	
	public void ToSeeSpam()
	{
		clickAllCategory.click();
	}

	public SpamPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	public void openPage() {
		driver.navigate().to(BASE_URL);
		logger.info("Login page opened");
	}

}
