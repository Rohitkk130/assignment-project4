package actionListExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Dragdroptest2 extends BaseClass{
	
	
	@Test
	public void test2() throws InterruptedException {
		
		WebElement myframe = driver.findElement(By.xpath("//iframe[contains(@class,'demo-frame')]"));
		driver.switchTo().frame(myframe);
		Thread.sleep(3000);
		
		WebElement img1 = driver.findElement(By.xpath("//p[contains(text(),'Drag')]"));
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		
		act.dragAndDrop(img1, drop).perform();
		
	}

}
