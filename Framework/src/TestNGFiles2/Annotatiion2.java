package TestNGFiles2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotatiion2 {

	@BeforeSuite
	public void installsoftware()
	{
		System.out.println("system enabled");
	}
	
	
	@Test
	public void software()
	{
		System.out.println("I am the test");
	}
	
	
	
	@AfterSuite
	public void deinstallsoftware()
	{
		System.out.println("system disabled");
	}
	
}
