package TestNGFiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	
	@BeforeMethod// Before each method gets executed the @BeforeMethod will get executed
	public void UserIdGeneration() 
	{
		System.out.println("This block executs before each Test");
	}
	
	
	@BeforeTest // Before each test gets executed the @Beforetest will get executed 
	public void DeleteCookies()
	{
		System.out.println("This block executes before all test cases");
		//Delete the cookies and app
	}
	
	
	@AfterTest
	public void Cookiesclose()
	{
		System.out.println("This block executes after all test cases");
		//Close the browsers or app
	}
	
	
	@AfterMethod
	public void ReportAdding()
	{
		System.out.println("This block executs after each Test");
		
	}
	
	
	@Test
	public void FlightBooking()
	{
		System.out.println("Executing Test 1");

	}
	
	
	@Test
	public void FlightCancel()
	{
		System.out.println("Executing Test 2");	
		
	}
	
	
	/*NOTE! @BeforeMethod is the pre-requisite for every testcase
	 		@AfterMethod is the post-requisite for every testcase
	 		5 testcases = 5 times execution
	 		
	 		@BeforeTest is the pre-requisite for all the test cases
	 		@AfterTest is the post-requisite for all the test cases
	 		5 testcases = 1 single execution 
	 		
	*/
	
	
}