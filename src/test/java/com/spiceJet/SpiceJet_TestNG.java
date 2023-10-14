package com.spiceJet;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.runnerclass.SpiceJet_Runner;
import com.web.pom.Booking_SJ;
import com.web.pom.Details;
import com.web.pom.FinalPage;
import com.web.pom.HomePage_SJ;
import com.web.pom.Login_SJ;
import com.web.pom.Signup_SJ;

public class SpiceJet_TestNG extends SpiceJet_Runner {

	@Test(priority = 0)
	public void navigateToWebsite() throws IOException {

		try {
			launchUrl("https://www.spicejet.com/");
			implicitlyWait();
			capture("launchpage");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 1, enabled = false)                  // enabled false once signup process completed
	public void signUpForm() throws InterruptedException {

		Signup_SJ s = new Signup_SJ();                               // created instance for class Signup_SJ

		clickOnElement(s.signup());
		String mainwindow = getWindowHandle();
		Set<String> s1 = getWindowHandles();
		Iterator<String> i1 = s1.iterator();

		while (i1.hasNext()) {
			String ChildWindow = i1.next();
			if (!mainwindow.equalsIgnoreCase(ChildWindow)) {           //used windows handling here
				try {
					windowSwitch(ChildWindow);

					sleep();
					dropDownSelect("Mr", s.title(), "MR");
					userInput(s.fName(), "Hariharan");
					userInput(s.lName(), "R");

					dropDownSelect("India ", s.country(), "IN ");         // country dropdown

					sleep(); // datepicker
					jsClick(s.dob());
					dropDownSelect("October", s.monthselector(), "9");
					dropDownSelect("1999", s.yearselector(), "1999");
					jsClick(s.dateselector());
					userInput(s.mobInput(), "9363588041");
					sleep();
					userInput(s.mailInput(), "hharanmnm@gmail.com");
					userInput(s.passInput(), "Harirmnm@123");
					userInput(s.cpassInput(), "Harirmnm@123");

					jsClick(s.checkBox()); // checkbox

					jsClick(s.signUpBtn());
					driver.close();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

	@Test(priority = 1)
	public void loginForm() throws InterruptedException, IOException {

		try {
			Login_SJ log = new Login_SJ();                     // created instance for class Login_SJ

			clickOnElement(log.login());
			clickOnElement(log.emailCheckBox());
			userInput(log.loginMailInput(), "hharanmnm@gmail.com");
			userInput(log.loginPassInput(), "Harirmnm@123");
			clickOnElement(log.loginButton());
			capture("login");
			sleep();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 2)
	public void homePage() throws InterruptedException, IOException {

		try {
			HomePage_SJ home = new HomePage_SJ();                  // created instance for class HomePage_SJ
			// jsClick(home.onewayCheck());
			userInput(home.origin(), "blr");
			userInput(home.destination(), "del");
			Actions ac = new Actions(driver);
			ac.click(home.depBox()).build().perform();
			ac.click(home.passengers()).build().perform();
			ac.click(home.plus()).build().perform();
			jsScroll(home.passengersDone());
			ac.click(home.passengersDone()).build().perform();
			ac.click(home.checkbox()).build().perform();
			ac.click(home.searchFlight()).build().perform();
			capture("homepage");
			sleep();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 3)
	public void bookingPage() throws IOException, InterruptedException {

		try {
			Booking_SJ book = new Booking_SJ();
			jsClick(book.continueBtn());
			capture("bookingpage");
			sleep();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 4)
	public void detailsPage() throws IOException, InterruptedException {

		try {
			Details detail = new Details();
			Actions ac = new Actions(driver);                                //used Actions class here
			ac.click(detail.mailCheckBox()).build().perform();
			userInput(detail.fNameDetail(), "Test");
			userInput(detail.LNameDetail(), "T");
			ac.click(detail.continueDetail()).build().perform();
			capture("detailspage");
			sleep();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 5)
	public void finalPage() throws IOException, InterruptedException {
		try {
			FinalPage fp = new FinalPage();
			jsClick(fp.FinalContinue());
			capture("complete");
			sleep();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
