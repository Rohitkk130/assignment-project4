package iRCTCExample;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class IRCTCtest extends BaseClass{
	
	@Test
	public void logincheck() throws InterruptedException, Exception {
		
		String parentwindow = driver.getWindowHandle();
		System.out.println("window info : " + parentwindow);
		
		driver.findElement(By.xpath("//button[contains(text(),'K')]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(@class,'allcircle circletwo')]")).click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(".\\screenshot\\clicktest1.png");
		FileUtils.copyFile(source, target);
		
		
		Set<String> multiplewindow = driver.getWindowHandles();
		String mainwindow = (String) multiplewindow.toArray()[0];
		String hotelwindow = (String) multiplewindow.toArray()[1];
		
		System.out.println("Mainwindow Info : " + mainwindow);
		System.out.println("Hotelwindow Info : " + hotelwindow);
		
		driver.switchTo().window(hotelwindow);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@data-target='#LoginFormPopup']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().window(mainwindow);
		driver.findElement(By.xpath("//label[contains(text(),'Person With')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'OK')]")).click();
		Thread.sleep(3000);
		
		driver.switchTo().window(hotelwindow);
		//driver.findElement(By.xpath("//button[@type='submit']"));
		driver.findElement(By.xpath("//form//child::div[@class='text-center']//button[contains(text(),'Login')]")).click();
		Thread.sleep(4000);
		
		
	}

}
