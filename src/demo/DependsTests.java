package demo;

import org.testng.annotations.Test;

public class DependsTests {

	
	@Test(dependsOnMethods= {"openBrowser"})
	public void signIn() {
		System.out.println("The user signed in Successfully");
	}
	
	@Test
	public void openBrowser() {
		System.out.println("The Browser is Opened");
	}
	
	@Test(dependsOnMethods= {"signIn"})
	public void logout() {
		System.out.println("The user logged out succesfully");
	}
}
