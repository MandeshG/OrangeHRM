package OrangeHRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class loginPage {
	
	@FindBy(name="txtUsername")
	WebElement username;
	
	@FindBy(name="txtPassword")
	WebElement password;
	
	@FindBy(name="Submit")
	WebElement submit;
	
	
	public loginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void  Enter_Username(){
		username.sendKeys("Admin");
	}
	
	public void Enter_Password(){
		password.sendKeys("admin");
	}
	
	public void login(){
		submit.click();
	}
	
	public void login_Application(){
		username.sendKeys("Admin");
		password.sendKeys("admin");
		submit.click();
	}

}
