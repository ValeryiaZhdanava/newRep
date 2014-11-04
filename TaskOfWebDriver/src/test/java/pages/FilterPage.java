package pages;

//import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Object.Users;

public class FilterPage extends AbstractClass {

	// private final Logger logger = Logger.getLogger(MainLoginPage.class);

	@FindBy(xpath = "//span[contains(text(),'Create')][@class='sA']")
	private WebElement createANewFilter;

	@FindBy(xpath = "//input[@class='ZH nr aQa']")
	private WebElement inputFieldFrom;

	@FindBy(xpath = "//label[text()='Has attachment']/../input")
	// [@type='checkbox']
	// span[@class='w-Pv ZG'][label[contains(text(),'Has attachment')]
	private WebElement checkHasAttachment;

	@FindBy(xpath = "//div[@class='acM']")
	private WebElement checkCreate;

//	@FindBy(name = "ok")
//	private WebElement buttonOk;

	@FindBy(xpath = "//label[text()='Delete it']/../input")
	// div[@class='nH lZ'][1]")
	private WebElement checkDeleteIt;

	@FindBy(xpath = "//label[text()='Always mark it as important']/../input")
	private WebElement checkAlwaysMarkAsImportant;

	@FindBy(xpath = "//div[@class='T-I J-J5-Ji Zx acL T-I-atl L3']")
	private WebElement buttonCreateFilter;

	public void createANewFilterWithSetting() {
		createANewFilter.click();
		inputFieldFrom.sendKeys(Users.USER1.getLogin());
		checkHasAttachment.click();
		checkCreate.click();
		//buttonOk.click();
		checkDeleteIt.click();
		checkAlwaysMarkAsImportant.click();
		buttonCreateFilter.click();
	}

	public FilterPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@Override
	public void openPage() {
	}
}
