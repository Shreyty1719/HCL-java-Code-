package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:/Java Software/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/shreya-tyagi/Downloads/fExample1%201.html");
		List<WebElement>  iframeEle=driver.findElements(By.tagName("iframe"));
		System.out.println("Total no of iframes are: "+iframeEle.size());
		
		driver.switchTo().frame(0);
		System.out.println("Frame Source"+driver.getPageSource());
		driver.switchTo().defaultContent();
		
		
	}

}
