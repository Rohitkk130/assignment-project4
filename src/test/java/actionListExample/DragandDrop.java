package actionListExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DragandDrop extends BaseClass {
	
	
	@Test
	public void dragdroptest() throws InterruptedException {
		
		WebElement trashframe = driver.findElement(By.xpath("//iframe[contains(@src,'/resources/demos/droppable/default.html')]"));
		driver.switchTo().frame(trashframe);
		Thread.sleep(3000);
		
		WebElement img2 = driver.findElement(By.xpath("//p[contains(text(),'Drag')]"));
		WebElement trash = driver.findElement(By.cssSelector("div#droppable"));
		Thread.sleep(4000);
		//act.dragAndDrop(img2, trash).perform();
		
		act.clickAndHold(img2).moveToElement(trash).release().perform();
		Thread.sleep(2000);
	}

}
