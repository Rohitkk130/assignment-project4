package automation_Sheet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void launchsite() throws Exception {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://docs.google.com/forms/d/e/1FAIpQLSd32CTclabKVm44rKIUBGzYlngLduGMMbYgbTGCNQZAUih9mw/viewform");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void closesite() {
		driver.quit();
	}

}
