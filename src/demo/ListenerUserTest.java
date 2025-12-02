package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ListenerUserTest {

	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","c:/Java Software/chromedriver-win64/chromedriver.exe");

		driver=new ChromeDriver();
		
	}
	
	
	@Test
	public void googleSuccess() {
		driver.get("https://www.google.com");
		String expected="Google";
		Assert.assertEquals(driver.getTitle(), expected);
	}
	
	
	@Test
	public void googleFail() {
		driver.get("https://google.com");
		String expected="GoogleKaskjdsakd";
		Assert.assertEquals(driver.getTitle(), expected);
				
	}
	
	@Test
	public void skipTest() {
		
		throw new SkipException("Skipping the test method");
	}
	
	
	
	
	
	
	
}
