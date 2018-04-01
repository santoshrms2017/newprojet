package santoshparking.homepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class parkapp {

	public static WebDriver driver;
	
	public static WebElement elemnt;
	
@BeforeTest
	public static void setup(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver.exe");
		 driver = new ChromeDriver();
			driver.get("https://www.google.co.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	@Test
	public static void test() {
				
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("test");;
			
		
	}

	@AfterTest
	public static void exit(){
		driver.quit();
	}
}
