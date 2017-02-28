package Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class NewTest extends TestCase {

private WebDriver driver;
	
	@Test
	public void TestGoogleOpen() {
		
		driver.get("https://www.google.com");
		System.out.println("Browser gets initialted successsfully!!!!!!!");
		String title =driver.getTitle();
		Assert.assertTrue(title.contains("Google"));
	}
	
	
	@BeforeTest
	public void beforeTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	@AfterTest
	public void aftreTest(){
		driver.quit();
	}
}
