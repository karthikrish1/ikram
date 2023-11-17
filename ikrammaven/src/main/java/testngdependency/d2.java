package testngdependency;

import org.testng.annotations.Test;

public class d2 {
	
	//dependsOnGroups: connection between grop and test cases
	
	
	@Test(priority=0,groups="L1")
	public void t1()
	{
		System.out.println("t1");
	}
	
	@Test(priority=1,groups="L1")
	public void t2()
	{
		System.out.println("t2");
	}
	
	@Test(priority=2,dependsOnGroups="L1")
	public void hme()
	{
		System.out.println("home");
	}

}
