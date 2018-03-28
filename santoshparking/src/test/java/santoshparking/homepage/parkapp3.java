package santoshparking.homepage;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class parkapp3 {

	public static WebDriver driver;
	
	public static WebElement elemnt;
	@BeforeTest
  public void setup(){
		
	String d="D:\\rms backup\\project backup\\santoshparking\\src\\main\\resources\\drivers\\chromedriver.exe";
	
	System.setProperty("webdriver.chrome.driver", d);
		
		//System.setProperty("webdriver.chrome.driver", "D:\\project\\santoshparking\\src\\main\\resources\\drivers\\chromedriver.exe");
	 
	 // System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver.exe");
		 driver = new ChromeDriver();
			driver.get("https://www.google.co.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
}
		
	
	
	@Test
	public void test() throws Exception{

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("dream initiative productions");
		//driver.findElement(By.xpath("//input[@name='btnK']")).click();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// Code to copy the screenshot in the desired location
		FileUtils.copyFile(scrFile, new File("C://Users//Home//git//newprojet//santoshparking//src//main//java//santoshparking//screenshot//google.jpg"));
		

			
			
		
    }
@Test
	public void test1() throws Exception{
	    driver.navigate().refresh();
	
//	    driver.navigate().back();
	   // driver.navigate().forward();
	    driver.findElement(By.xpath("//input[@name='q']")).clear();
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys(" santoshmb");
	   // driver.findElement(By.xpath("//input[@name='btnK']")).click();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// Code to copy the screenshot in the desired location
		FileUtils.copyFile(scrFile, new File("C://Users//Home//git//newprojet//santoshparking//src//main//java//santoshparking//screenshot//google1.jpg"));
		
	
			
			
		
	}



@Test
public void test2() throws Exception{
	
//	driver.navigate().back();
//	
//	driver.navigate().forward();
	
	 driver.navigate().refresh();

	 driver.findElement(By.xpath("//input[@name='q']")).clear();
	 
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("sagar");
//	driver.findElement(By.xpath("//input[@name='btnK']")).click();
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	// Code to copy the screenshot in the desired location
	FileUtils.copyFile(scrFile, new File("C://Users//Home//git//newprojet//santoshparking//src//main//java//santoshparking//screenshot//google2.jpg"));
	

		
		
	
}



@AfterTest
  public void exit() throws Exception{
	
	Thread.sleep(3000);
	  driver.close();
  }
}

