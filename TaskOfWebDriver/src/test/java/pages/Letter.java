package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Letter extends AbstractClass {
	private final Logger logger = Logger.getLogger(Letter.class);
	WebDriverWait wait = new WebDriverWait(driver, 10);

	@FindBy(xpath = "//a[4]")
	// a[@href$=#https]")
	private WebElement clickLink;

	public void clickLink() {
		clickLink.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By
				.xpath("//td[text()='Confirmation Success!']")));
	}

	public Letter(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@Override
	public void openPage() {

	}

}
