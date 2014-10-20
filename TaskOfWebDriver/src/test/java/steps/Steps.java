package steps;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.EmailPage;
import pages.FilterPage;
import pages.ForwardPage;
import pages.Letter;
import pages.MainLoginPage;
import pages.SettingPage;
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
		EmailPage epage = new EmailPage(driver);
		page.clickNewMessage();
		epage.newMessage();

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

	public void CheckNumberOfLetters() {
		SpamPage spage = new SpamPage(driver);
		spage.CheckNumberOfLetters();

	}

	public void inputSetting() {
		MainLoginPage page = new MainLoginPage(driver);
		page.inputSetting();

	}

	public void ChooseForwardingAndPOP() {
		SettingPage setpage = new SettingPage(driver);
		setpage.chooseForwardingAndPOP();
	}
	
	public void chooseFilters() {
		SettingPage setpage = new SettingPage(driver);
		setpage.chooseFilters();
		// logger.info("Login page opened");
	}
	

	public void addForwardAdress() {
		ForwardPage fpage = new ForwardPage(driver);
		fpage.addForwardAdress();
	}

	public void closeDriver() {
		driver.quit();
	}

	public void openLetter() {
		MainLoginPage page = new MainLoginPage(driver);
		page.openLetter();

	}

	public void clickLink() {
		Letter letter = new Letter(driver);
		letter.clickLink();
	}

	public void forwardACopy() {
		ForwardPage fpage = new ForwardPage(driver);
		fpage.forwardACopy();
	}
	
	public void createANewFilterWithSetting(){
		FilterPage filpage = new FilterPage(driver);
		filpage.createANewFilterWithSetting();
		
	}
//	public void fillFieldOfFilter(){
//		
//	}

}
