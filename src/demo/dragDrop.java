package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dragDrop {

	@Test
	public void dragdrop() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","c:/Java Software/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(3000);
		Actions mouse=new Actions(driver);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		mouse.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(3000);
//		driver.close();
		
	}

}
