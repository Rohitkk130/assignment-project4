package automation_Sheet;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Automation_Sheet extends BaseClass{
	
	@Test
	public void automation() {
		String parentwindow = driver.getWindowHandle();
		System.out.println("Window Info : " + parentwindow);
		
		driver.findElement(By.xpath("//a[contains(text(),'Sign in to')]")).click();
		
		Set<String> multiplewindow = driver.getWindowHandles();
		String mainwindow = (String) multiplewindow.toArray()[0];
		String gmailwindow = (String) multiplewindow.toArray()[1];
		
		driver.switchTo().window(gmailwindow);
		
		driver.findElement(By.xpath("//div[@class='w1I7fb']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("");
		
		
	}

}
