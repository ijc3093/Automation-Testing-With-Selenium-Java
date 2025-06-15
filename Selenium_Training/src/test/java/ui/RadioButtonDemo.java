package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonDemo {
	public static WebDriver driver;
	public RadioButtonDemo() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ichukz\\eclipse-workspace\\RCVDemo\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.singaporeair.com/en_UK/us/home#/book/bookflight");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		//Radio
		WebElement radio1 = driver.findElement(By.id("bookFlights"));
		Thread.sleep(1500);
		WebElement radio2 = driver.findElement(By.id("redeemFlights"));
		
		//radio1.click();
		radio2.click();
		Thread.sleep(1500);
		
		System.out.println(radio1.isSelected());
		System.out.println(radio2.isSelected());
		
		System.out.println(driver.findElements(By.xpath("//*[@id=\"bookFlights\"]")).size());
		
		driver.close();
		//driver.quit();
		
		
	}

}
