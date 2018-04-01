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
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowsertesting {

	public static WebDriver driver;
	
	public static WebElement elemnt;

	
	@BeforeTest
	@Parameters("browser")
  public void setup(String browsername){
		
		if(browsername.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("chrome"))
		{
			String d="D:\\rms backup\\project backup\\santoshparking\\src\\main\\resources\\drivers\\chromedriver.exe";
			
			System.setProperty("webdriver.chrome.driver", d);
			driver=new ChromeDriver();
		}
//		else if(browsername.equalsIgnoreCase("ie"))
//		{
//			
//			String e="D:\\rms backup\\project backup\\santoshparking\\src\\main\\resources\\drivers\\IEDriverServer.exe";
//			System.setProperty("webdriver.ie.driver", e);
//			driver=new InternetExplorerDriver();
//		}
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
		FileUtils.copyFile(scrFile, new File("C://Users//Home//git//newprojet//santoshparking//src//main//java//santoshparking//screenshot//googles.jpg"));
		

			
			
		
    }
@AfterTest
  public void exit() throws Exception{
	
	Thread.sleep(3000);
	  driver.close();
  }
}

