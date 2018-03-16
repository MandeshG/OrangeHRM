package orangeHRM.stepFiles;

import org.openqa.selenium.By;

import org.testng.AssertJUnit;

import OrangeHRM.pages.loginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {


	@Given("^User login to the application$")
	public void user_login_to_the_application() throws Throwable {
		boolean login = base.driver.findElement(By.name("Submit")).isDisplayed();
		AssertJUnit.assertTrue(login);

	}

	@And("^User enter the username$")
	public void user_enter_the_username() throws Throwable {
		loginPage lp = new loginPage(base.driver);
		lp.Enter_Username();

	}

	@And("^User enter the password$")
	public void user_enter_the_password() throws Throwable {
		loginPage lp = new loginPage(base.driver);
		lp.Enter_Password();

	}

	@When("^User clicks on the Login Button$")
	public void user_clicks_on_the_Login_Button() throws Throwable {
		loginPage lp = new loginPage(base.driver);
		lp.login();
	}

	@Then("^user is able to login to the application$")
	public void user_is_able_to_login_to_the_application() throws Throwable {
		if (base.driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b")).isDisplayed()) {
			System.out.println("HomePage is Displayed");

		} else {
			System.out.println("HomePage is not Displayed");
		}

	}

}