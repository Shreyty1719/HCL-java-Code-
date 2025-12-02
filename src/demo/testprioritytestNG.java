package demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testprioritytestNG {
@Test
public void tc() {
	System.out.println("Test Case 1");
}

@Test(priority=1)
public void tc1() {
	System.out.println("Test case 2");
}

@Test(priority=2)
public void tc2() {
	System.out.println("Test case 3");
}

@BeforeTest
public void tc3() {
	System.out.println("Before test");
}

@AfterTest
public void tc4() {
	System.out.println("After test");
}

@BeforeMethod
public void tc5() {
	System.out.println("Before method");
}

@AfterMethod
public void tc6() {
	System.out.println("After Method");
}
}
