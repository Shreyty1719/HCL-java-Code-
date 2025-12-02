package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class CrossBrowser {

	

	WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "c:/Java Software/chromedriver-win64/chromedriver.exe");
			 driver = new ChromeDriver();

		}
		else if(browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:/Java Software/edgedriver_win64/msedgedriver.exe");
			 driver=new EdgeDriver();
		}
		else {
			throw new Exception("Browser doesn't exists");
		}
			
		}
	@Test
	public void jpet() throws InterruptedException {
		
		driver.get("https://petstore.octoperf.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Enter the Store")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Sign")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("Shreya");
		driver.findElement(By.name("password")).clear();
		
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("12345");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("signon")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign Out")).click();
	}
		
		}


