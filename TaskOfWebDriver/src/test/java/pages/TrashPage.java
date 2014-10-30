package pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrashPage extends AbstractClass {
	private final Logger logger = Logger.getLogger(TrashPage.class);
	WebDriverWait wait = new WebDriverWait(driver, 150);

	@FindBy(xpath = "//img[@class='yE']")
	private WebElement attachment;

	@FindBy(xpath = "//div[@class='ae4 UI UJ']//tr[@class='zA zE']")
	private List<WebElement> unreadLetters;

	@FindBy(xpath = "//div[@class='T-ays-a45']") //td[@class='WA xY']/div[@class='pG']"
	private WebElement isMarkImportant;

	public String isAttachment() {
		return attachment.getAttribute("alt");
	}

	public String isImportant() {
		return isMarkImportant.getAttribute("aria-label");
	}

	public boolean checkLetter() {
		return unreadLetters.size() > 0;
	}

	public TrashPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	public void openPage() {
		logger.info("Login page opened");
	}

}
