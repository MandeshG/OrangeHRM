package orangeHRM.stepFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import OrangeHRM.pages.AddEmployee;
import OrangeHRM.pages.loginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addEmployeeSteps {
	WebDriver driver;
	
	@Given("^User hoover PIM menu and Clicks on tehe Employee list$")
	public void user_hoover_PIM_menu_and_Clicks_on_the_Employee_list() throws Throwable {
		loginPage lp= new loginPage(base.driver);
		lp.login_Application();
		
		WebElement PIM= base.driver.findElement(By.xpath(".//*[@id='menu_pim_viewPimModule']/b"));
		Actions acc= new Actions(base.driver);
		acc.moveToElement(PIM).perform();
		
		AddEmployee ae= new AddEmployee(base.driver);
		ae.employeeList();
		
	   
	}

	@And("^User clicks on the Add button$")
	public void user_clicks_on_the_Add_button() throws Throwable {
		AddEmployee as= new AddEmployee(base.driver);
		as.employee_add();

		
	}

	@When("^User Add employee by entering all values in the fields$")
	public void user_Add_employee_by_entering_all_values_in_the_fields() throws Throwable {
	   
	}

	@And("^User clicks on the save button\\.$")
	public void user_clicks_on_the_save_button() throws Throwable {
	   
	}

	@Then("^User clicks on the Employee list$")
	public void user_clicks_on_the_Employee_list() throws Throwable {
	   
	}

	@And("^user verify if the name exits$")
	public void user_verify_if_the_name_exits() throws Throwable {
	    
	}
	
	
	

}
