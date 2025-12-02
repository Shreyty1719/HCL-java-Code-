package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:/Java Software/chromedriver-win64/chromedriver.exe");
			
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://petstore.octoperf.com/");
//	        System.out.println("Title: " + driver.getTitle());
//	  driver.quit();
	    }}