package testNGpackage;

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

public class TestNGclass2 {
	
	
	
	@Test ()
	public void testA ()
	{
		String actualresult = "homepage working";
	    String expectedresult = "homepage working";
		Assert.assertEquals(actualresult, expectedresult, "homepage");
		System.out.println("TestA- class2");
	}
	
	@Test ()
	public void testB ()
	{
		System.out.println("TestB- class2");
	}
	
	@Test
	public void testC ()
	{
		System.out.println("TestC- class2");
	}
	
	@Test
	public void testD ()
	{
		System.out.println("TestD- class2");
	}
	
	
}
