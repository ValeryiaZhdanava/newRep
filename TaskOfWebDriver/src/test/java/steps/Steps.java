package steps;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.MainLoginPage;
import pages.SpamPage;

public class Steps {
	private WebDriver driver;
	private final Logger logger = Logger.getLogger(Steps.class);

	public void initBrowser() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger.info("Browser started");
	}

	public void login(String login, String password) {
		MainLoginPage loginPage = new MainLoginPage(driver);
		loginPage.openPage();
		loginPage.login(login, password);
		logger.info("Login performed");

	}

	public void sendMessage() throws InterruptedException {
		MainLoginPage page = new MainLoginPage(driver);
		page.newMessage();

	}

	public void setSpam() {
		MainLoginPage page = new MainLoginPage(driver);
		page.setSpam();
	}

	public void ToSeeSpam() {
		SpamPage spage = new SpamPage(driver);
		spage.ToSeeSpam();
		// spage.openPage();
	}

	public void closeDriver() {
		driver.quit();
	}
}
