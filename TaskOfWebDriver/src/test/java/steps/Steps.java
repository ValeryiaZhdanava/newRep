package steps;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Object.Users;

import pages.EmailPage;
import pages.FilterPage;
import pages.ForwardPage;
import pages.Letter;
import pages.MainLoginPage;
import pages.SettingPage;
import pages.SpamPage;
import pages.TrashPage;

public class Steps {
	private WebDriver driver;
	private final Logger logger = Logger.getLogger(Steps.class);

	public void initBrowser() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		logger.info("Browser started");
	}

	public void login(Users user) {
		MainLoginPage loginPage = new MainLoginPage(driver);

		loginPage.openPage();
		loginPage.login(user.getLogin(), user.getPassword());
		logger.info("Login performed");

	}

	public void sendMessage() throws InterruptedException {
		MainLoginPage page = new MainLoginPage(driver);
		EmailPage epage = new EmailPage(driver);
		page.waitPage();
		page.clickNewMessage();
		epage.newMessage();
		logger.info("Message is sent");
	}

	public void sendMessageWithAttach() throws InterruptedException,
			IOException, AWTException {
		MainLoginPage page = new MainLoginPage(driver);
		page.waitPage();
		EmailPage epage = new EmailPage(driver);
		page.clickNewMessage();
		epage.newMessageWithAttach();

		logger.info("Message with attach is sent");
	}

	// public void createNewFile() throws Exception {
	// EmailPage epage = new EmailPage(driver);
	// epage.attacheFile();
	// }

	public void setSpam() {
		MainLoginPage page = new MainLoginPage(driver);
		page.setSpam();
	}

	public void ToSeeSpam() {
		MainLoginPage mpage = new MainLoginPage(driver);
		mpage.goToSpam();
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
	}

	public void addForwardAdress() {
		ForwardPage fpage = new ForwardPage(driver);
		fpage.addForwardAdress();
		logger.info("Added a forwarding address");
	}

	public void closeDriver() {
		driver.quit();
	}

	public void openLetter() {
		MainLoginPage page = new MainLoginPage(driver);
		page.waitPage();
		page.openLetter();
	}

	public void clickLink() {
		Letter letter = new Letter(driver);
		letter.waitPage();
		letter.clickLink();
	}

	public void forwardACopy() {
		ForwardPage fpage = new ForwardPage(driver);
		fpage.forwardACopy();
	}

	public void createANewFilterWithSetting() {
		FilterPage filpage = new FilterPage(driver);
		filpage.createANewFilterWithSetting();

	}

	public boolean checkLetterInTrashAndMarkAsImportant() {
		TrashPage tpage = new TrashPage(driver);
		MainLoginPage mpage = new MainLoginPage(driver);
		mpage.goToTrash();
		return (("Important because you marked it as important.")
				.equalsIgnoreCase(tpage.isImportant()));
		// (tpage.checkLetter())
		// ("Attachment").equalsIgnoreCase(tpage.isAttachment())
	}
	// public boolean checkLetterInInboxAndWithoutMarkAsImportant() {
	// TrashPage tpage = new TrashPage(driver);
	// MainLoginPage mpage = new MainLoginPage(driver);
	// mpage.goToInbox();
	// return (tpage.checkLetter()
	// & ("Not important").equalsIgnoreCase(anotherString)
	// );
}
// public void fillFieldOfFilter(){
//
// }

