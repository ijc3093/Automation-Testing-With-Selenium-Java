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

public class CheckBoxDemo {
	public static WebDriver driver;
	public CheckBoxDemo() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ichukz\\eclipse-workspace\\RCVDemo\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/request-demo/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
		
		//Mark Checkbox. This is issue one
		WebElement checkbox = driver.findElement(By.id("field_1_12"));
		checkbox.isSelected();
		
		Actions actions = new Actions(driver);
		actions.moveToElement(checkbox);
		actions.perform(); 
		
		//Mark Checkbox
		//driver.findElement(By.id("field_1_12")).click();
		
		
		System.out.println(driver.findElements(By.id("//input[@type='checkbox']")).size());
		driver.close();
		//driver.quit();
		
		
	}

}
