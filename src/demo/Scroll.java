package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","c:/Java Software/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement element=driver.findElement(By.id("tabButton"));
		
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(3000);
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(3000);
		
		driver.findElement( By.id("windowButton")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("messageWindowButton")).click();
	}

}
