package hrmAppExample_log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HRMLoginTest extends BaseTest{

	
	
	@Test
	public void verifylogin() {
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("button")).click();
		
		//Assert.assertTrue(driver.getTitle().contains(""));
		
		String errorMessage = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
		System.out.println("Error Message: " + errorMessage);
		
		
		
		
		Assert.assertEquals(errorMessage, "Invalid credentials");
		
		
	}
	
	
	
}
