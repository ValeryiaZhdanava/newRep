package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Letter extends AbstractClass {
	private final Logger logger = Logger.getLogger(Letter.class);
	
	@FindBy(xpath = "//a[4]") //a[@href$=#https]")
	private WebElement clickLink;
	
	public void clickLink(){
		clickLink.click();
	}
	public Letter(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@Override
	public void openPage() {

	}

}
