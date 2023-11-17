package intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class i1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://www.letskodeit.com/practice");
	}

}
