package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c:/Java Software/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.calculator.net/");
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println("Total links are "+link.size());
		
		for(int i=0;i<link.size();i++) {
			System.out.println("Name of the link is "+link.get(i).getText());
		}
		
driver.quit();
	}

}
