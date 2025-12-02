package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDwon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","c:/Java Software/chromedriver-win64/chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.calculator.net");
		 driver.findElement(By.linkText("Mortgage Calculator")).click();
		 
		 WebElement element=driver.findElement(By.name("cstartmonth"));
		 
		 Select dropdown=new Select(element);
		
		 dropdown.selectByIndex(4);
		 
		
	}

}
