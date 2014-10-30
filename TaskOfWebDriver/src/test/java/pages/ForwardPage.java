package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Object.Users;

public class ForwardPage extends AbstractClass {
	private final Logger logger = Logger.getLogger(ForwardPage.class);

	@FindBy(xpath = "//input[@value='Add a forwarding address']")
	private WebElement addForwardingAdress;

	@FindBy(xpath = "//div[@class='PN']/input[@type='text']")
	private WebElement enterForwardingAddress;

	@FindBy(xpath = "//div[@class='Kj-JD-Jl']/button[@name='next']")
	// /button[@name='next']
	private WebElement buttonNext;

	@FindBy(xpath = "//iframe[@class='ds']")
	private WebElement frameConfirmforwardingAddress;

	@FindBy(xpath = "//input[@value='Proceed']")
	private WebElement buttonProceed;

	@FindBy(name = "ok")
	private WebElement buttonOk;

	@FindBy(xpath = "//input[@value='1'][@name='sx_em']")
	private WebElement clickRadiobutton;

	@FindBy(xpath = "//button[ancestor::div[@class='nH Tv1JD']][text()='Save Changes']")
	private WebElement clickSaveChange;

	public void addForwardAdress() {
		addForwardingAdress.click();
		enterForwardingAddress.sendKeys(Users.USER3.getLogin());
		buttonNext.click();

		driver.switchTo().frame(frameConfirmforwardingAddress);
		buttonProceed.click();
		driver.switchTo().parentFrame();
		buttonOk.click();
	}

	public void forwardACopy() {
		clickRadiobutton.click();
		clickSaveChange.click();
	}

	public ForwardPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@Override
	public void openPage() {

	}

}
