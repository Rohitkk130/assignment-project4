package assessment;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Logintest_HRM extends BaseClass{
	
	
	@Test
	public void logintest() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("button")).click();
		String url = driver.getCurrentUrl();
		System.out.println("Current Url : "+ url);
		Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		//String errorMessage = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
		//System.out.println("Error Message: " + errorMessage);
		//Assert.assertEquals(errorMessage, "Invalid credentials");
	}
	
	@Test
	public void logintest2() {
		
		Boolean verifyDashboard = driver.findElement(By.tagName("h1")).isDisplayed();
        System.out.print("Is dashboard present on page : " +verifyDashboard);
        Assert.assertTrue(verifyDashboard);
		
	}

}
