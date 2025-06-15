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

public class WorkingWithWebElements {
	public static void main(String[] args) {
		
		
		//FireFox
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ichukz\\eclipse-workspace\\RCVDemo\\Driver\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.sugarcrm.com/request-demo/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
		driver.findElement(By.name("input_3.3")).sendKeys("Testing");
		driver.findElement(By.name("input_3.3")).clear();
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"input_1_3_3\"]")).getAttribute("class"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).getCssValue("text-transform"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).getSize());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).getLocation());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).getTagName());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).isSelected());
		driver.close();
	}

}
