package testNGpackage;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGclass1 {

	SoftAssert soft = new SoftAssert ();
	
	@Test ()
	public void test1 () 
	{
		boolean actual = true ;
		boolean expected = false ;
		SoftAssert soft = new SoftAssert ();
		soft.assertEquals(actual, expected);
	    soft.assertAll();
		
	
	}
	
	
	@Test ()
	public void test2 ()
	{   String actualtile = "homepage working";
	    String expectedtitle = "homepage not working";
	    
		String actualUrl = "//gsjjskksls";
		String expectedUrl = "//gsjjskksls";
		
		String actualbutton = "Next";
		String expectedButton = "next";
		
	//	SoftAssert soft = new SoftAssert ();
		soft.assertEquals(actualtile, expectedtitle, "got title");
		soft.assertEquals(actualUrl, expectedUrl, "got URL");
	    soft.assertEquals(actualbutton, expectedButton, "got button");
		soft.assertAll();
		
		System.out.println("Test2- class1");
		
	}
	
	@Test (enabled = false)
	public void test3 ()
	{
		System.out.println("Test3- class1");
	}
	
	@Test (enabled = false) 
	public void test4 ()
	{
		System.out.println("Test4- class1");
	}
	
	
	
}
