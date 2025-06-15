package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinks {

	public PrintAllLinks() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		//FireFox
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ichukz\\eclipse-workspace\\RCVDemo\\Driver\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.sugarcrm.com/request-demo/");
		driver.manage().window().maximize();
		
		List<WebElement> alltags = driver.findElementsByTagName("a");
		System.out.println("Total tags are: "+ alltags.size());
		
		for(int i=0; i< alltags.size(); i++) {
			System.out.println("Links on page are : "+ alltags.get(i).getAttribute("href"));
			System.out.println("Links on page are : "+ alltags.get(i).getText());
		}
		
		List<WebElement> alltags2 = driver.findElementsByTagName("option");
		System.out.println("Total tags are: "+ alltags2.size());
		
		for(int i=0; i< alltags.size(); i++) {
			System.out.println("Only two letter and number employees on page are : "+ alltags2.get(i).getAttribute("value"));
			System.out.println("Contry, Level, and Size on page are : "+ alltags2.get(i).getText());
		}
		driver.close();
		//driver.quit();
		
		
	}

}
