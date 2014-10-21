package pages;

//import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterPage extends AbstractClass {

	// private final Logger logger = Logger.getLogger(MainLoginPage.class);

	@FindBy(xpath = "//span[contains(text(),'Create')][@class='sA']")
	private WebElement createANewFilter;

	@FindBy(xpath = "//input[@class='ZH nr aQa']")
	private WebElement inputFieldFrom;

	@FindBy(xpath = "//span[@class='w-Pv ZG']/input[1]")
	// span[@class='w-Pv ZG'][label[contains(text(),'Has attachment')]
	private WebElement checkHasAttachment;

	@FindBy(xpath = "//div[@class='acM']")
	private WebElement checkCreate;

	@FindBy(name = "ok")
	private WebElement buttonOk;

	@FindBy(xpath = "//div[@class='nH lZ']/input[6]")
	private WebElement checkDeleteIt;

	public void createANewFilterWithSetting() {
		createANewFilter.click();
		inputFieldFrom.sendKeys("Valery6693@gmail.com");
		checkHasAttachment.click();
		checkCreate.click();
		buttonOk.click();
		checkDeleteIt.click();
	}

	// public void fillFieldOfFilter(){
	// inputFieldFrom.sendKeys("Valery6693@gmail.com", "11kesha2011");
	// }

	public FilterPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@Override
	public void openPage() {

	}
}
