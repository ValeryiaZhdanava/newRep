package steps;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Object.Email;
import Object.Users;

import pages.EmailPage;
import pages.MainLoginPage;
import utils.Utils;

public class Steps {
	private WebDriver driver;
	private final Logger logger = Logger.getLogger(Steps.class);

	public void initBrowser() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("Browser started");
	}

	public void login(Users USER1) {
		 MainLoginPage loginPage = new MainLoginPage(driver);
		 loginPage.openPage();
		 loginPage.login(USER1);
		
	}

	public void sendMessage(Email adress, Users USER1, Email subject, Utils util, Email bodyMessage) {

		MainLoginPage page = new MainLoginPage(driver);
		EmailPage epage = new EmailPage(driver);
		page.newMessage();
		epage.fillAdress(adress, USER1);
		epage.fillSubject(subject, util);
		epage.fillBodyMessage(bodyMessage, util);

	}

	public void closeDriver() {
		driver.quit();
	}
}
