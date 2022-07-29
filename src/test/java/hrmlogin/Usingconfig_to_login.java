package hrmlogin;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Usingconfig_to_login extends BaseClass{

	
	
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
		Boolean verifyashBoard = driver.findElement(By.tagName("h1")).isDisplayed();
		
		if(verifyashBoard) {
			Assert.assertTrue(verifyashBoard);
			log.info("Verification of dashboard sucessfully.");
		}
		
		else {
			log.info("Verification of dashboard is failed.");
			Assert.assertTrue(verifyashBoard);
			
		}
		
		
	}
	
	
}
