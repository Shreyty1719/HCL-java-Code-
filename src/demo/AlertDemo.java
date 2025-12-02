package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","c:/Java Software/chromedriver-win64/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
		driver.findElement(By.xpath("//*[@id=\"content\"]/button")).click();
		Thread.sleep(3000);
		

		Alert alert=driver.switchTo().alert();
		System.out.println("The Text of the alert is "+alert.getText());
		
		alert.accept();
//		alert.dismiss();
		
	}

}
