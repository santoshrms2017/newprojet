package santodhparki;

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
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class screencaptureforchrome {

	public static WebDriver driver;

	public static WebElement elemnt;

	@BeforeTest
	public void setup() {

		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/channel/UCk4l906LQYHTovA0k_6tYVA/featured");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@Test(priority = 0)
	public void test() throws Exception {

		driver.findElement(By.xpath("//paper-tab[contains(.,'Videos')] ")).click();
		// driver.findElement(By.xpath("//input[@name='btnK']")).click();
		
		Thread.sleep(3000);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// Code to copy the screenshot in the desired location
		FileUtils.copyFile(scrFile, new File(
				"C://Users//Home//git//newprojet//santoshparking//src//main//java//santoshparking//screenshot//chrogoogle.jpg"));

	}
	
	@Test(priority = 1)
	public void tests() throws Exception {

		driver.findElement(By.xpath("//paper-tab[contains(.,'Playlists')]  ")).click();
		// driver.findElement(By.xpath("//input[@name='btnK']")).click();
		
		Thread.sleep(3000);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// Code to copy the screenshot in the desired location
		FileUtils.copyFile(scrFile, new File(
				"C://Users//Home//git//newprojet//santoshparking//src//main//java//santoshparking//screenshot//chrogoogles.jpg"));

	}
	
	

	@Test(priority = 2)
	public void test1() throws Exception {
//		driver.navigate().refresh();
//
//		 driver.navigate().back();
//		 driver.navigate().forward();
		driver.findElement(By.xpath("//paper-tab[contains(.,'Channels')] ")).click();
		Thread.sleep(3000);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// Code to copy the screenshot in the desired location
		FileUtils.copyFile(scrFile, new File(
				"C://Users//Home//git//newprojet//santoshparking//src//main//java//santoshparking//screenshot//chrogoogle1.jpg"));

	}

	@Test(priority = 3)
	public void test2() throws Exception {

//		driver.navigate().back();
//		
//
//		driver.navigate().refresh();

		

		driver.findElement(By.xpath("//paper-tab[contains(.,'About')] ")).click();
		
		
		Thread.sleep(3000);
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// Code to copy the screenshot in the desired location
		FileUtils.copyFile(scrFile, new File(
				"C://Users//Home//git//newprojet//santoshparking//src//main//java//santoshparking//screenshot//chrogoogle2.jpg"));

	}

	@AfterTest
	public void exit() throws Exception {

		Thread.sleep(3000);
		driver.close();
	}
}
