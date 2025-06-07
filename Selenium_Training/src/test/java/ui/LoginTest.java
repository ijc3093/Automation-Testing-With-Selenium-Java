package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

//	public static String browser = "chrome"; // External configuration - XLS, CSV
	public static String browser = "Firefox"; // External configuration - XLS, CSV
//	public static String browser = "edge"; // External configuration - XLS, CSV
	
//	public static FirefoxDriver firefoxdriver;
//	public static ChromeDriver chromedriver;
//	public static ChromeDriver edgedriver;
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		
		//FireFox
		if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\ichukz\\eclipse-workspace\\RCVDemo\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		//Chrome
		else if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ichukz\\eclipse-workspace\\RCVDemo\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		//Edge
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			System.setProperty("webdriver.edge.driver", "C:\\Users\\ichukz\\eclipse-workspace\\RCVDemo\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.close();
		//driver.quit();
	}

}
