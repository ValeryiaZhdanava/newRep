package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Object.Email;
import Object.Users;

import steps.Steps;
import utils.Utils;

public class letterFromUser1GoToSpamFolder {
	private Steps steps;

	@BeforeTest
	public void beforeTest() {
		steps = new Steps();
		steps.initBrowser();
	}

	@Test
	public void FirstUserSendMessageToSecondUser(Email adress, Users user,
			Email subject, Utils util, Email bodyMessage) {

		steps.sendMessage(adress, user, subject, util, bodyMessage);
		steps.closeDriver();
		steps.initBrowser();

	}

	@AfterTest
	public void afterTest() {
		// steps.closeDriver();
	}
}
