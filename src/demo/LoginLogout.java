package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginLogout {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:/Java Software/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://petstore.octoperf.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Enter the Store")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Sign")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("j2ee");
		driver.findElement(By.name("password")).clear();
		
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("j2ee");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("signon")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign Out")).click();
		
	//	driver.quit();
		

	}

}
