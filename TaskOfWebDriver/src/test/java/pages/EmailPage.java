package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Object.Users;

import utils.Utils;

public class EmailPage extends AbstractClass {
	private final Logger logger = Logger.getLogger(EmailPage.class);
	WebDriverWait wait = new WebDriverWait(driver, 10);

	@FindBy(css = "textarea.vO")
	private WebElement inputAdress;

	@FindBy(xpath = "//input[@name='subjectbox']")
	private WebElement writeSubject;

	@FindBy(xpath = "//div[@class='Am Al editable LW-avf']")
	// div[@class='Am Al editable']/iframe
	private WebElement writeBodyMessage;

	@FindBy(xpath = "//div[@class='a1 aaA aMZ']")
	private WebElement attachAFile;

	@FindBy(xpath = "//div[@class='T-I J-J5-Ji aoO T-I-atl L3']")
	private WebElement clickSendMessage;

	@FindBy(xpath = "//div[@class='dR']")
	private WebElement bandDownload;

	@FindBy(xpath = "//span[@class='ag ca']")
	private WebElement labelMessageSend;

	public void newMessage() {

		inputAdress.sendKeys(Users.USER2.getLogin());
		writeSubject.sendKeys(Utils.getRandomString(6));
		writeBodyMessage.sendKeys("Heelogit!!!!");
		clickSendMessage.click();

	}

	public void newMessageWithAttach() throws AWTException, IOException {

		inputAdress.sendKeys(Users.USER2.getLogin());
		writeSubject.sendKeys(Utils.getRandomString(6));
		writeBodyMessage.sendKeys(Utils.getRandomString(12));
		attachAFile.click();
		File file = new File(Utils.getFile(20000));
		StringSelection ss = new StringSelection(file.getAbsolutePath());
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot;

		robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By
				.xpath("//div[@class='dQ']")));

		clickSendMessage.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//span[@class='ag ca']")));

		logger.info("Login performed");
	}

	public EmailPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	public void openPage() {
		// driver.navigate().to(BASE_URL);
		logger.info("Login page opened");
	}
}
