package ui;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropdown {

	public SelectDropdown() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws InterruptedException {

		//FireFox
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ichukz\\eclipse-workspace\\RCVDemo\\Driver\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.sugarcrm.com/request-demo/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
		
		WebElement ddown = driver.findElement(By.name("input_8"));
		Select select = new Select(ddown);
		 
		WebElement firstOption = select.getFirstSelectedOption();
		System.out.println(firstOption.getText());
		
		select.selectByValue("level1");
		Thread.sleep(2000);
		
		select.selectByVisibleText("51 - 100 employees");
		Thread.sleep(2000);
		
		select.selectByIndex(5);
		Thread.sleep(2000);
		

		
		WebElement ddown2 = driver.findElement(By.name("input_84"));
		Select select2 = new Select(ddown2);
		
		WebElement firstOption1 = select2.getFirstSelectedOption();
		System.out.println(firstOption1.getText());

		select2.selectByValue("US");
		Thread.sleep(2000);
		
		select2.selectByVisibleText("United States");
		Thread.sleep(2000);
		
//		List<WebElement> allItems = select2.getAllSelectedOptions();
//		System.out.println(allItems.size());
//		select2.deselectAll();
//		Thread.sleep(2000);
//		
//		select2.selectByValue("US");
//		Thread.sleep(2000);
//		select2.selectByIndex(5);
//		Thread.sleep(2000);
//		
//		select2.deselectByIndex(5);
//		Thread.sleep(2000);
//		List<WebElement> allItems1 = select2.getAllSelectedOptions();
//		System.out.println(allItems1.size());
		
		
		driver.close();
		//driver.quit();
		
		
	}

}
