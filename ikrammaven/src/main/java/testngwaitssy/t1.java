package testngwaitssy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class t1 {
	/*waits/synchronisation technique
	 * 
	 * conditional          : explicit wait 
	 * unconditional        : implicit wait
	 * 
	 * 
	 * implicit wait : once it is declared all the code which is present after it
	 *                 will take the time limit
	 *                 
	 * code is correct: executes within time limit, it will proceed further, it will not wait for
	 *                 completion of time limit
	 *                 
	  code is wrong: wait for the completion of time limit ad then it will throw up error
	 ** */
	
	@Test
	public void hs()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		ob.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		System.out.println(ob.getTitle());//4
		System.out.println(ob.getCurrentUrl());//4
		ob.findElementByLinkText("Ikjhs"); //4
		ob.navigate().refresh();//4
		ob.quit();
	}

}
