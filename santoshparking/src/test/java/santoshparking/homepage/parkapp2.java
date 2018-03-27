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

public class parkapp2 {

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
			
			String g="C://Users//Home//git//newprojet//santoshparking//src//main//java//santoshparking//screenshot//tests.png";
			
			this.takeSnapShot(driver, g);
			Thread.sleep(3000);
			
//			this.takeSnapShot(driver, "D://project//santoshparking//src//main//java//santoshparking//screenshot//test1.png");
//			Thread.sleep(3000);
			driver.navigate().back();
		
		//this.takeSnapShot(driver, System.getProperty("user.dir")+"//santoshparking//screenshot//test1.png");
		 // this.takeSnapShot(driver, "C://New folder//test.png") ;  
		  
				
	}

	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

           
    }
@AfterTest
  public void exit() throws Exception{
	
	Thread.sleep(3000);
	  driver.close();
  }
}

