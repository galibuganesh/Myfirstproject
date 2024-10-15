package OmNamashivaya;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Oneeeeeee {
	ChromeDriver driver = new ChromeDriver();

	public void VerifyingTitle() {
		WebDriver driver;
		
	}
	@BeforeMethod
	public void Asserts() {
		driver.get("https://www.orangehrm.com/");
		
		String title = driver.getTitle();
		System.out.println("page title" + title);
		Assert.assertTrue(title.contains("OrangeHRM"));
		
	}
	
@AfterMethod 
public void afterMethod() throws InterruptedException {
	Thread.sleep(5000);
	driver.close();
		
		
	}
}
