package pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public abstract class AbstractClass {

	protected final WebDriver driver;

	public AbstractClass(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver getDriver() {
		return this.driver;
	}

	public abstract void openPage();

	public void waitPage() {
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

}
