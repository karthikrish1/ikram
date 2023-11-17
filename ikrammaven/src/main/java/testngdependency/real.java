package testngdependency;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class real {
	ChromeDriver ob;
	@Test(priority=0, description="visiting website", groups="K")
	public void visitingg()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ob= new ChromeDriver();
		ob.get("http://www.google.com");
	}
	
	@Test(priority=1, description="maximing website", groups="K")
	public void max()
	{
		ob.manage().window().maximize();
	}
	
	@Test(priority=2, description="refreshing website",invocationCount=3, groups="K")
	public void refresh()
	{
		ob.navigate().refresh();
	}
	
	@Test(priority=3, description="clicking", dependsOnGroups="K")
	public void clicking()
	{
		ob.findElementByLinkText("Images").click();
	}
	
	@Test(priority=4, description="closing website",timeOut=3000, dependsOnGroups="K")
	public void close() throws InterruptedException
	{
		Thread.sleep(2000);
		ob.quit();
	}

}
