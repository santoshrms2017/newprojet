package santoshparking.exceldaterest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class forexceltest {
  
    public static  WebDriver driver;
    public  WebElement element;
    
	
    @BeforeTest
    public static void setup() {
		// TODO Auto-generated method stub

	    //driver=new FirefoxDriver();
    	
    	 driver=new ChromeDriver();
		
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}
	
	@Test
	public void satdimport(){
		
		
		element=driver.findElement(By.xpath("//input[@type='text']"));
		element.sendKeys("tecsyu");
		
		element=driver.findElement(By.xpath("//input[@type='password']"));
		element.sendKeys("tecsyu");
		
		element=driver.findElement(By.xpath("//input[@type='submit']"));
		element.click();
		
		// element=driver.findElement(By.xpath("//a[contains(.,'')]"));
		// element.sendKeys("tecsyu");
	}

	@AfterTest
	public void close(){
		driver.close();
	}
}
