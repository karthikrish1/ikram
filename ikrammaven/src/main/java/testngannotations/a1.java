package testngannotations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class a1 {
	
	//before suite: first 
	//after suite : last
	
	//before test:   run only once before all the test cases started its execution
	// after test:   run only once after all the testcases finished its execution
	
	//before class: run only once after before test
	//after class:  run only once before after test 
	
	//before method: run before each test case
	// after method: run after each test case 
	
	// before test:  visiting website 
	//   before class : max
    //       before method: refreshing   tc1: title   aftermethod: cookie deletion
	//        before method: refreshing  tc2 :click  aftermethod: cookie deletion
	//    after class: getting url
	//aftertest : closing 
	ChromeDriver ob;
	@Test(priority=0)
	public void t1()
	{
		System.out.println("test case 1: title "+ ob.getTitle());
	}
	@Test(priority=1)
	public void t2()
	{
		System.out.println("test case 2: clicking ");
		ob.findElementByLinkText("Privacy").click();
	}
    @BeforeTest
	public void bt()
	{
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ob= new ChromeDriver();
		ob.get("http://www.google.com");
		System.out.println("before test -visiting webste");
	}
    @AfterTest
	public void at() throws InterruptedException
	{
    	Thread.sleep(2000);
		System.out.println("after test- closing ");
		ob.quit();
	}
    
    
    @BeforeClass
   	public void btc()
   	{
   		System.out.println("before class : maximising ");
   		ob.manage().window().maximize();
   	}
       @AfterClass
   	public void atc()
   	{
   		System.out.println("after class: url "+ ob.getCurrentUrl());
   	}
       
       @BeforeMethod
   	public void btm()
   	{
   		System.out.println("before method- refreshing ");
   		ob.navigate().refresh();
   	}
       @AfterMethod
   	public void atm()
   	{
   		System.out.println("after method - deleting cookies ");
   		ob.manage().deleteAllCookies();
   	}
       
       @BeforeSuite
       public void bs()
       {
    	   System.out.println("before suite- first");
       }
       
       @AfterSuite
       public void bas()
       {
    	   System.out.println("after suite-last");
       }
}
