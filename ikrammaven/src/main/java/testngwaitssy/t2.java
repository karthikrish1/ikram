package testngwaitssy;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class t2 {

/* create an object for webdriver wait class
 * pass driver instance and time limit as input
 * call untill method 
 * code is correct: executes within time limit, it will proceed further, it will not wait for
*                 completion of time limit
*                
code is wrong: wait for the completion of time limit ad then it will throw up error
	*/
	@Test
	public void hs()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		WebDriverWait w= new WebDriverWait(ob,5);	
		//title
		//w.until(ExpectedConditions.titleIs("Gjhkjh"));
		//w.until(ExpectedConditions.titleContains("oo"));
		
		//alert
		//w.until(ExpectedConditions.alertIsPresent()); //5
		
		//visibility of single element
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
		
		//visibility of more elements
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img")));
		
		//clickable o r not
		w.until(ExpectedConditions.elementToBeClickable(By.linkText("Images")));
		
		ob.quit();
		
	}
}
