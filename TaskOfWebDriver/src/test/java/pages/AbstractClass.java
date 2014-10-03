package pages;

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

}
