package testngattributes;

import org.testng.annotations.Test;

public class t1 {
	//testng: test next generation
	//testing framework
	// annnotations, attributes, assertion, waits, report generation
	// inpsired from JUNIT
	//test cases
	//      nonstatic
	//      @Test
	//      default order: alphabetical order 
	
	//priority :  arrange the test case in particular order
	//description: add short note on test case 
	//groups
	//invocationcount:run same test case for multiple time 
	//enabled=false 
	//timeout
	
	@Test(priority=0,description="ONE",groups="L",invocationCount=5,enabled=false)
	public void m1()
	{
		System.out.println("Test case 1");
	}
	
	@Test(priority=1,description="TWo",groups="L")
	public void ab()
	{
		System.out.println("Test case 2");
	}
	
	@Test(priority=2,description="Three",groups="P")
	public void m2()
	{
		System.out.println("Test case 3");
	}

}
