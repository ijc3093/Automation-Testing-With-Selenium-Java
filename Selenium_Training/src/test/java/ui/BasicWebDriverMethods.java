package ui;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicWebDriverMethods {

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
		driver.manage().window().maximize();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		
		//WebElement we = driver.findElement(By.id("user-name"));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		//Inventory List
		List<WebElement> webelements = (List<WebElement>) driver.findElement(By.xpath("//div[@class='inventory_list']/div"));
		System.out.println(webelements);
		
		//Go to Sugarcrm
		driver.navigate().to("https://www.sugarcrm.com/");
		String windowhandle = driver.getWindowHandle();
		System.out.println(windowhandle);
		
		//Request A BackCall Link
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[10]/div/div/div/a[2]")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		
		driver.close();
		//driver.quit();
	}

}
