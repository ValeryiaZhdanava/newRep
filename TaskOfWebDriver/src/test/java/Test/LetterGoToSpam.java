package Test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Object.Users;

import steps.Steps;

public class LetterGoToSpam {
	private Steps step;

	@BeforeTest
	public void beforeTest() {
		step = new Steps();
		step.initBrowser();
	}

	@Test(enabled = false)
	public void IsLetteFromTheFirstUserGoToSpam() throws InterruptedException {
		// step.login(Users.USER1);
		// step.sendMessage();
		// step.closeDriver();
		// step.initBrowser();
		// step.login(Users.USER2);
		// step.setSpam();
		// step.closeDriver();
		// step.initBrowser();
		// step.login(Users.USER1);
		//
		// step.sendMessage();
		// step.closeDriver();
		// step.initBrowser();
		// step.login(Users.USER2); //the thrid mail:
		// //WebDriverTestEmail // 111sun111
		// step.ToSeeSpam();
		// step.CheckNumberOfLetters();

	}

	@Test
	public void LetterFromOneUserTrashAndMarkAsImportant() throws Exception {

		// step.login(Users.USER2);
		// step.inputSetting();
		// step.ChooseForwardingAndPOP();
		// step.addForwardAdress();
		// step.closeDriver();
		// step.initBrowser();
		// step.login(Users.USER3);
		// step.openLetter();
		// step.clickLink();
		// Thread.sleep(1000);
		// step.closeDriver();
		// step.initBrowser();
		// step.login(Users.USER2);
		// step.inputSetting();
		// step.ChooseForwardingAndPOP();
		// step.forwardACopy();
		// step.chooseFilters();
		// step.createANewFilterWithSetting();
		// step.closeDriver();
		// step.initBrowser();
		step.login(Users.USER1);
		step.sendMessageWithAttach();
		step.sendMessage();
		step.closeDriver();
		step.initBrowser();
		step.login(Users.USER3);
		Assert.assertTrue(step.checkLetterInTrashAndMarkAsImportant());

		// steps.CheckNumberOfLetters();

	}

//	@AfterTest
//	public void afterTest() {
//		// steps.closeDriver();
//	}
}
