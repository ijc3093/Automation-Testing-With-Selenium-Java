package ichukz;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation {

	public DemoAutomation() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		//Chrome
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ichukz\\eclipse-workspace\\RCVDemo\\Driver\\chromedriver.exe");
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		
		//FireFox
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ichukz\\eclipse-workspace\\RCVDemo\\Driver\\geckodriver.exe");
//		FirefoxDriver driver = new FirefoxDriver();
//		driver.get("https://www.amazon.com/amazonprime");
		
		//Edge
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\ichukz\\eclipse-workspace\\RCVDemo\\Driver\\msedgedriver.exe");
//		EdgeDriver driver = new EdgeDriver();
//		driver.get("https://www.amazon.com/amazonprime");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("iphone");
		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		driver.close();
		//driver.quit();
 
	}

}
