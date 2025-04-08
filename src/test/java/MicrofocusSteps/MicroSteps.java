package MicrofocusSteps;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;
import PageLayer.RegistrationPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MicroSteps extends BaseClass {
	public static RegistrationPage registrationPage;

	@Given("user opens {string} browser")
	public void user_opens_browser(String browserName) {

		BaseClass.initialisation(browserName);
	}

	@When("user enters valid {string}  and {string}")
	public void user_enters_valid_and(String firstName, String lastName) throws Exception {

		registrationPage = new RegistrationPage();
		registrationPage.entersFirstLastName(firstName, lastName);
	}

	@Then("user enters {string} and {string}")
	public void user_enters_and(String jobRole, String companyName) throws Exception {

		registrationPage.entersjobRoleAndCompanyName(jobRole, companyName);
	}

	@Given("user enters valid {string} , {string} and {string}")
	public void user_enters_valid_and(String city, String postalCode, String country) throws Exception {

		registrationPage.address(city, postalCode, country);
	}

	@Given("user enters valid state , language, telephone and emailadd")
	public void user_enters_valid_state_language_telephone_and_emailadd(DataTable dataTable) throws Exception {
		// | Maharashtra(India) | Marathi(India) | 9090909090 | khalatesonali@gmail.com
		// |
		List<List<String>> ls = dataTable.asLists();
		String state = ls.get(0).get(0);
		String lang = ls.get(0).get(1);
		String mobileNumber = ls.get(0).get(2);
		String emailid = ls.get(0).get(3);

		registrationPage.stateLangTelEmaiInfo(state, lang, mobileNumber, emailid);
	}

	@AfterStep
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			byte[] f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

			String date = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());

			scenario.attach(f, "image/png" + date, scenario.getName());

		} else {
			byte[] f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

			String date = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());

			scenario.attach(f, "image/png" + date, scenario.getName());
		}

	}

}
