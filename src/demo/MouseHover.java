package demo;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.*;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","c:/Java Software/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		Actions mouse=new Actions(driver);
		WebElement  element=driver.findElement(By.linkText("Electronics"));
		mouse.moveToElement(element).build().perform();
		Thread.sleep(3000);
		
		WebElement ele=driver.findElement(By.linkText("Apple"));
		ele.click();
		
		
	}

}
