package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tooltip {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:/Java Software/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement googleIcon=driver.findElement(By.cssSelector("a[aria-label='Google apps']"));
		
		String tooltip=googleIcon.getAttribute("aria-label");
		 
	 System.out.println("Tooltip text: "+tooltip);
		

	}

}
