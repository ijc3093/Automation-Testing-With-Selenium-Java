package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

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
		
//		driver.get("https://www.saucedemo.com/");
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
//		By.id(). By.id is not the only way but there are many ways to identify the input such By.cssSelector(), By.tagName() and etc that can identify the “input”.
		//id with xpath
//		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		
		//id 
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//className
//		driver.findElement(By.className("form_input")).sendKeys("standard_user");
		
		//cssSelector
//		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		
		//tagName
//		driver.findElement(By.tagName("input")).sendKeys("standard_user");
		
		//Password
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		//xpath
		//driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		//LinkText
//		driver.get("https://www.selenium.dev/documentation/webdriver/elements/");
//		driver.findElement(By.linkText("Locators")).click();
		//OR
//		driver.findElement(By.partialLinkText("Locators")).click();
		
		//driver.close();
		//driver.quit();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//This is issue oneS
//		WebElement password = driver.findElement(By.id("password"));
//		driver.findElement(withTagName("input").above(password)).sendKeys("secret_sauce");

		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.close();
		//driver.quit();
	}

}
