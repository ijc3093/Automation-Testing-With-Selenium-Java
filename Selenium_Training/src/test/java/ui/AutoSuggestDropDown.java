package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropDown {
	public static WebDriver driver;
	public AutoSuggestDropDown() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ichukz\\eclipse-workspace\\RCVDemo\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.global/?cc=am");
		driver.manage().window().maximize();
		
		WebElement closeButton = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/span"));
		closeButton.click();
		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/label/span")).click();
		WebElement from = driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
		Thread.sleep(2000);
		from.sendKeys("Dallas/Ft Worth Intl-TX");
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		from.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
		//driver.quit();
		
		
	}

}
