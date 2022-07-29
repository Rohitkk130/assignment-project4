package controlPaytmExample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utilityconfig.ConfigRead;

public class UsingConfig extends BaseClass{
	
	
	@Test
	public void configseen() throws Exception {
		
		ConfigRead confi = new ConfigRead();
		/*System.out.println(confi.getappurl());
		System.out.println(confi.getdevurl());
		System.out.println(confi.getusername());
		System.out.println(confi.getpassword());  */
		
		driver.findElement(By.xpath("//span[text()='Username']")).sendKeys(confi.getusername());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Password']")).sendKeys(confi.getpassword());
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
	}

}
