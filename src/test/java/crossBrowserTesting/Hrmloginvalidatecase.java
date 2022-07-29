package crossBrowserTesting;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Hrmloginvalidatecase extends BaseClass {
	
	
	@Test(priority = 1, description = "verify with valid user detail")
	public void test1() {
		
		WebElement txt_userName = driver.findElement(By.id("txtUsername"));
        txt_userName.sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        driver.findElement(By.className("button")).click();
        
        
        Boolean verifyDashboard = driver.findElement(By.tagName("h1")).isDisplayed();
        System.out.print("is dashboard present on page" +verifyDashboard);
        Assert.assertTrue(verifyDashboard);
	}
        
        @Test(priority = 2)
        public void test2() {
        	
        	driver.findElement(By.partialLinkText("Welcom")).click();;
        	
        	WebDriverWait wait = new WebDriverWait(driver, 120);
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Logou")));
        	
        	driver.findElement(By.partialLinkText("Logou")).click();
        	
        	Assert.assertTrue(driver.getCurrentUrl().contains("login"));
        	
        
        
	}
	
	
	

}
