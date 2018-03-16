package OrangeHRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployee {
	WebDriver driver;

	@FindBy(xpath = ".//*[@id='menu_pim_viewPimModule']/b")
	WebElement PIM;

	@FindBy(xpath = ".//*[@id='menu_pim_viewEmployeeList']")
	WebElement EmployeeList;

	@FindBy(name = "btnAdd")
	WebElement add;

	@FindBy(name = "firstName")
	WebElement f_Name;

	@FindBy(name = "middleName")
	WebElement m_Name;

	@FindBy(name = "lastName")
	WebElement l_Name;

	@FindBy(xpath = ".//*[@id='employeeId']")
	WebElement id;
	
	
	@FindBy(xpath=".//*[@id='photofile']")
	WebElement uploadPhoto;
	
	@FindBy(id="btnSave")
	WebElement save;
	
	
	public AddEmployee(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void employeeList() {
		EmployeeList.click();
	}

	public void employee_add() {
		add.click();
		f_Name.sendKeys("Raja1");
		m_Name.sendKeys("test");
		l_Name.sendKeys("Rani");
		uploadPhoto.sendKeys("M:\\com.OrangeHRM\\OrangeHRM\\src\\test\\java\\Resources\\apple_raw.png");
		save.click();
	

	}

}
