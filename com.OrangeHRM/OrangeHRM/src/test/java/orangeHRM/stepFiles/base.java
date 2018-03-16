package orangeHRM.stepFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class base {
	
	static WebDriver driver;
	
	@Before
	public void setup(){
		
		System.setProperty("webdriver.chrome.driver", "M:\\com.OrangeHRM\\OrangeHRM\\src\\test\\java\\Resources\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(15, TimeUnit.SECONDS);
		
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
	}
	
	
	@After
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		driver.quit();
		driver = null;

	
	}

}