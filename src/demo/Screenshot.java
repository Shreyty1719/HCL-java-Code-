package demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "c:/Java Software/chromedriver-win64/chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();

driver.get("file:///C:/Users/shreya-tyagi/Downloads/fExample1%201.html");

TakesScreenshot ts=(TakesScreenshot) driver;

File src=ts.getScreenshotAs(OutputType.FILE);

File dest=new File("C:\\Users\\shreya-tyagi\\OneDrive - HCL TECHNOLOGIES LIMITED\\Pictures\\Screenshots\\eaple.png");

FileHandler.copy(src, dest);
System.out.println("Screenshot captured Successfully");
	}

}
