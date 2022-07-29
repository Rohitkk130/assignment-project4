package crossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	
	@Parameters("Coforge_browser")
	@BeforeTest
	public void launchsite(String browser) {
		System.out.print("Running browser is : " + browser);
		
		if(browser.equalsIgnoreCase("CHROME")) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
		else{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		}
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@AfterTest
	public void closesite() {
		driver.close();
	}

}
