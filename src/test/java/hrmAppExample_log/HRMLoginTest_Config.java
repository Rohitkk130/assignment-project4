package hrmAppExample_log;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HRMLoginTest_Config extends BaseTest{

	
	
	@Test
	public void login() throws Exception {
		
//		System.out.println(conf.getApplication_QA_URL());
//		System.out.println(conf.getApplication_Dev_URL());
//		System.out.println(conf.getUserName());
//		System.out.println(conf.getPassword());
		log.info("Enter username : " + conf.getusername());
		//log.info("enter userName : " + conf.getUserName());
		driver.findElement(By.name("txtUsername")).sendKeys(conf.getusername());
		//log.info("enter password: " + conf.getPassword());
		log.info("Enter Password : " + conf.getpassword());
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys(conf.getpassword());
		//log.info("Click on login button");
		log.info("click on login button");
		driver.findElement(By.name("Submit")).click();
		
		//validation step
		Boolean verifyDashBoard = driver.findElement(By.tagName("h1")).isDisplayed();
		
		if(verifyDashBoard) {
			Assert.assertTrue(verifyDashBoard);
			//log.info("Verification of dashboard sucessfully.");
		}
		
		else {
			//log.info("Verification of dashboard is failed.");
			Assert.assertTrue(verifyDashBoard);
			
		}
		
		
	}
	
	
}
