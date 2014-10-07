package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import steps.Steps;

public class letterFromUser1GoToSpamFolder {
	private Steps steps;

	@BeforeTest
	public void beforeTest() {
		steps = new Steps();
		steps.initBrowser();
	}

	@Test
	public void FirstUserSendMessageToSecondUser() {
		steps.login("valery6693@gmail.com", "11kesha2011");
		steps.sendMessage("valery66934@gmail.com", "SayHello",
				"HEllo my Dear Friend!!!");// (пароль=dslr0101 )

		steps.closeDriver();
		steps.initBrowser();
		steps.login("valery66934@gmail.com", "dslr0101");
		// WebDriverWait wait = new WebDriverWait(driver, 5);

		// steps.sendMessage("valery66934@gmail.com", "SayHello",
		// "HEllo my Dear Friend!!!");
		// steps.login("valery66934@gmail.com", "dslr0101");
	}

	@AfterTest
	public void afterTest() {
		// steps.closeDriver();
	}
}
