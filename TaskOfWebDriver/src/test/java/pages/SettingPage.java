package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingPage extends AbstractClass {
	private final Logger logger = Logger.getLogger(MainLoginPage.class);

	@FindBy(xpath = "//div/a[@href='https://mail.google.com/mail/u/0/#settings/fwdandpop']")
	private WebElement chooseForwarding;

	public void ChooseForwardingAndPOP() {
		chooseForwarding.click();
		// logger.info("Login page opened");
	}

	public SettingPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@Override
	public void openPage() {

	}

}
