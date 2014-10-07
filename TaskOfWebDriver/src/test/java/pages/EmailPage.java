package pages;

//import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Utils;

import Object.Email;
import Object.Users;

public class EmailPage extends AbstractClass {

	// private final Logger logger = Logger.getLogger(MainLoginPage.class);
	private final String BASE_URL = "https://mail.google.com/mail/u/0/#inbox?compose=new";

	@FindBy(xpath = "//textarea[@name='to']")
	private WebElement FieldForAdress;

	@FindBy(xpath = "//input[@name='subjectbox']")
	private WebElement WriteSubject;

	@FindBy(xpath = "//div[@class='Am Al editable']/iframe")
	private WebElement WriteBodyMessage;

	@FindBy(css = "div.T-I.J-J5-Ji.aoO.T-I-atl.L3")
	private WebElement ClickSendMessage;

	public void fillAdress(Email adress, Users user) {
		adress.setAdress(user.getLogin());
		FieldForAdress.sendKeys();

	}

	public void fillSubject(Email subject, Utils util) {
		subject.setSubject(util.getRandomString(10));
		WriteSubject.sendKeys();

	}

	public void fillBodyMessage(Email bodyMessage, Utils util) {
		bodyMessage.setSubject(util.getRandomString(6));
		WriteBodyMessage.sendKeys();

	}

	// ClickSendMessage.click();

	public EmailPage(WebDriver driver) {
		super(driver);

	}

	@Override
	public void openPage() {
		driver.navigate().to(BASE_URL);

	}

}
