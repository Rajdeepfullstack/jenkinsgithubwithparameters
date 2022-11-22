package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	
	@Parameters("Browser")
	@Test
	public void TC001(String browser) throws InterruptedException {
		
		WebDriver driver  = null;
		//browser = "chrome";
		if (browser.contains("chrome")){
			driver = WebDriverManager.chromedriver().create();	
		}
		else if(browser.contains("firefox")) {
			
		driver = WebDriverManager.firefoxdriver().create();
		}
		else if(browser.contains("edge")) {
			driver = WebDriverManager.edgedriver().create();
		}
		
		
		driver.get("https://www.magicbricks.com/");
		driver.manage().window().maximize();
		Thread.sleep(1);
		driver.quit();
		
		
	}
	

}
