package testngattributes;

import org.testng.annotations.Test;

public class t2 {
	
	@Test(timeOut=2000)
	public void m1() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("hi");
	}

}
