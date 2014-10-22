package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utils.Utils;

public class EmailPage extends AbstractClass {
	private final Logger logger = Logger.getLogger(EmailPage.class);

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

	public void newMessage() {

		inputAdress.sendKeys("valery66934@gmail.com");
		writeSubject.sendKeys(Utils.getRandomString(6));
		writeBodyMessage.sendKeys("Heelogit!!!!");
		clickSendMessage.click();

	}

	public void newMessageWithAttach() {

		inputAdress.sendKeys("valery66934@gmail.com");
		writeSubject.sendKeys(Utils.getRandomString(6));
		writeBodyMessage.sendKeys("Heelogit!!!!");
		attachAFile.click();

		// clickSendMessage.click();

		// logger.info("Login performed");
	}

	public void attacheFile() throws IOException, AWTException {
		File file = new File(Utils.getFile(123));
		attachAFile.click();
		StringSelection ss = new StringSelection(file.getAbsolutePath());
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot;

		robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		// robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		// robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		// robot.keyRelease(KeyEvent.VK_ENTER);
		// robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		logger.info("File create!!!");
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
