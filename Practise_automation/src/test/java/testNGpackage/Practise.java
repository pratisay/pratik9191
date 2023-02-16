package testNGpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Practise {
public static void main(String[] args) {
	
	 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	 WebDriver driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     driver.manage().window().maximize();
	 driver.get("https://www.amazon.in");
	 
	    String actualTitle = driver.getTitle();
	    String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	    Assert.assertEquals(actualTitle, expectedTitle, "homepage title is correct");
	    
	    String actualUrl = driver.getCurrentUrl();
	    String expectedUrl = "https://www.amazon.in/home";
	    Assert.assertNotEquals(actualUrl, expectedUrl, "homepage url is not correct");
		
		boolean result = actualTitle.equals(expectedTitle);
	    Assert.assertTrue(result);
		
	    boolean result1 = actualUrl.equals(expectedUrl);
		Assert.assertFalse(result1);
		
		if (result1 != true)
		{
			Assert.fail();
		}	
	}
}
