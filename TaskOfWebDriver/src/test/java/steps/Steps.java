package steps;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.MainLoginPage;
import pages.PageWithLetters;

public class Steps {
	private WebDriver driver;
	private final Logger logger = Logger.getLogger(Steps.class);

	public void initBrowser() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger.info("Browser started");
	}

	public void login(String email, String password) {
		MainLoginPage loginPage = new MainLoginPage(driver);
		loginPage.openPage();
		loginPage.login(email, password);
	}

	public void sendMessage() {
		PageWithLetters page = new PageWithLetters(driver);
		page.sendMessage();

	}
}
