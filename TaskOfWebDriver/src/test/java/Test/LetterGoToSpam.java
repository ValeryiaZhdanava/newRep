package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import steps.Steps;

public class LetterGoToSpam {
	private Steps steps;

	@BeforeTest
	public void beforeTest() {
		steps = new Steps();
		steps.initBrowser();
	}

	@Test
	public void IsLetteFromTheFirstUserGoToSpam() throws InterruptedException  {

		steps.login("Valery6693@gmail.com", "11kesha2011");
		steps.sendMessage();
		steps.closeDriver();
		steps.initBrowser();
		steps.login("Valery66934@gmail.com", "dslr0101");
		steps.setSpam();
		steps.closeDriver();
		steps.initBrowser();
		steps.login("Valery6693@gmail.com", "11kesha2011");
		
		steps.sendMessage();
		steps.closeDriver();
		steps.initBrowser();
		steps.login("Valery66934@gmail.com", "dslr0101");
		steps.ToSeeSpam();

	}

	@AfterTest
	public void afterTest() {
	//steps.closeDriver();
	}
}
