package ui;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoIframe_alert_popup {
	public static WebDriver driver;
	public static String browser = "Firefox"; // External configuration - XLS, CSV
	public DemoIframe_alert_popup() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws InterruptedException {
		
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
				
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement frame1 = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(1000);
		
		Alert alertonpage = driver.switchTo().alert();
		alertonpage.sendKeys("RCV Academy");
		alertonpage.accept();
		
		
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
//		driver.close();
		driver.quit();	
	}

}
