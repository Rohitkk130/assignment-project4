package controlPaytmExample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class Controltest extends BaseClass{
	
	@Test
	public void verifysignin() throws InterruptedException, IOException {
		
		driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(".\\screenshot\\paytm.png");
		FileUtils.copyFile(source, target);
		
		String headingText = driver.findElement(By.cssSelector(".heading")).getText();
		System.out.println(headingText);
		Assert.assertTrue(headingText.contains("your Paytm Web"));
		driver.findElement(By.xpath("//span[contains(text(),'Watch Video')]")).click();
	}

}
