package controlPaytmExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ExerciseToDo extends BaseClass{
	
	
	@Test
	public void deselecttest() throws InterruptedException {
	
	
	WebElement myframe = driver.findElement(By.xpath("//iframe[contains(@src,'overview-summary.html')]"));
	driver.switchTo().frame(myframe);
	Thread.sleep(4000);
	
	
	driver.findElement(By.xpath("//a[contains(text(),'deselectAll')]")).click();
	Thread.sleep(4000);
	
	}
}
