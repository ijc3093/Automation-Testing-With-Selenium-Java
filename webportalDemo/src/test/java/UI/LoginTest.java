package UI;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	@BeforeTest
	public void loginToApplication() {
		
		System.out.println("Login to application");

	}
	
	@AfterTest
	public void logoutToApplication() {
		
		System.out.println("Logout to application");

	}
	
	@BeforeMethod
	public void connectToDB() {
		
		System.out.println("BD Connected");

	}
	
	@AfterMethod
	public void disconnectFromDB() {
		
		System.out.println("BD disconnected");

	}

	@Test(priority=1, description="This is a login test")
	public void loginTest() {
		
		System.out.println("Login is successful");

	}
	
	@Test(priority=2, description="This is a logout test")
	public void logoutTest() {
		
		System.out.println("Logout is successful");
 
	}

}
