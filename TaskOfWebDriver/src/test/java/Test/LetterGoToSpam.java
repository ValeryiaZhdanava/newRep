package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import steps.Steps;

public class LetterGoToSpam {
	private Steps step;

	@BeforeTest
	public void beforeTest() {
		step = new Steps();
		step.initBrowser();
	}

	// @Test
	// public void IsLetteFromTheFirstUserGoToSpam() throws InterruptedException
	// {
	//
	// step.login("Valery6693@gmail.com", "11kesha2011");
	// step.sendMessage();
	// step.closeDriver();
	// step.initBrowser();
	// step.login("Valery66934@gmail.com", "dslr0101");
	// step.setSpam();
	// step.closeDriver();
	// step.initBrowser();
	// step.login("Valery6693@gmail.com", "11kesha2011");
	//
	// step.sendMessage();
	// step.closeDriver();
	// step.initBrowser();
	// step.login("Valery66934@gmail.com", "dslr0101"); //the thrid mail:
	// WebDriverTestEmail // 111sun111
	// step.ToSeeSpam();
	// step.CheckNumberOfLetters();
	//
	// }

	@Test
	public void LetterFromOneUserTrashAndMarkAsImportant()
			throws InterruptedException {

		// step.login("Valery66934@gmail.com", "dslr0101");
		// step.inputSetting();
		// step.ChooseForwardingAndPOP();
		// step.addForwardAdress();
		// step.closeDriver();
		// step.initBrowser();
		// step.login("webdrivertestemail@gmail.com", "111sun111");
		// step.openLetter();
		// step.clickLink();
		// Thread.sleep(1000);
		// step.closeDriver();
		// step.initBrowser();
		step.login("Valery66934@gmail.com", "dslr0101");
		step.inputSetting();
		step.ChooseForwardingAndPOP();
		step.forwardACopy();
		step.chooseFilters();
		step.createANewFilterWithSetting();

		// steps.sendMessage();
		// steps.closeDriver();
		// steps.initBrowser();
		// steps.login("Valery66934@gmail.com", "dslr0101");
		// steps.ToSeeSpam();
		// steps.CheckNumberOfLetters();

	}

	@AfterTest
	public void afterTest() {
		// steps.closeDriver();
	}
}
