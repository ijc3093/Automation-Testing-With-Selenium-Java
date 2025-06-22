package UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTest {
	public static WebDriver driver;
	
	@Test
	public void titleTest(){
		
		String expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ichukz\\eclipse-workspace\\RCVDemo\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
		//driver.manage().window().maximize();
		driver.close();
	}
	
}
