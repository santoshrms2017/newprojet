package santoshparking.homepage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class JavaSample {

	  public static final String USERNAME = "sagarsujad1";
	  public static final String AUTOMATE_KEY = "sqe7oA9yb7zyPFUcKyAE";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";


  public static void main(String[] args) throws Exception {
	  
	  DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browser", "Chrome");
	    caps.setCapability("browser_version", "65.0");
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "10");
	    caps.setCapability("resolution", "1024x768");

	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    driver.get("https://www.youtube.com/channel/UCk4l906LQYHTovA0k_6tYVA/featured");
       
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    
    driver.findElement(By.xpath("//paper-tab[contains(.,'Videos')] ")).click();
	// driver.findElement(By.xpath("//input[@name='btnK']")).click();
	
	Thread.sleep(3000);
    
    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	// Code to copy the screenshot in the desired location
	FileUtils.copyFile(scrFile, new File("C://Users//Home//git//newprojet//santoshparking//src//main//java//santoshparking//screenshot//chrogoogle.jpg"));
	
	
	driver.findElement(By.xpath("//paper-tab[contains(.,'Channels')] ")).click();
	Thread.sleep(3000);
	File scrFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	// Code to copy the screenshot in the desired location
	FileUtils.copyFile(scrFile1, new File(
			"C://Users//Home//git//newprojet//santoshparking//src//main//java//santoshparking//screenshot//chrogoogle1.jpg"));

	driver.findElement(By.xpath("//paper-tab[contains(.,'About')] ")).click();
	
	
	Thread.sleep(3000);
	
	File scrFile11 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	// Code to copy the screenshot in the desired location
	FileUtils.copyFile(scrFile11, new File(
			"C://Users//Home//git//newprojet//santoshparking//src//main//java//santoshparking//screenshot//chrogoogle2.jpg"));


    
    driver.quit();

  }
}
