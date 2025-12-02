package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:/Java Software/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		Thread.sleep(3000);
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("messageWindowButton")).click();
		
String mainWindowHandle =driver.getWindowHandle();
System.out.println("The main window handle is: "+mainWindowHandle);
	}

}
