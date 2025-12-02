package demo;

import org.testng.annotations.Test;

public class Depends {

	@Test(groups= {"viewAccount"})
	public void viewAccount() {
		System.out.println("view Dashboard");
	}
	
	@Test(groups= {"openBrowser"})
	public void openBrowser() {
		System.out.println("Browser Opened");
	}
	
	@Test(groups= {"login"})
	public void login() {
		System.out.println("Login to Account");
	}
	
	@Test(groups= {"logout"})
	public void logout() {
		System.out.println("Logout from Application");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
