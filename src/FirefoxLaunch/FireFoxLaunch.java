package FirefoxLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Swamyshiva\\swamyshiva\\geckodriver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		
		String title= driver.getTitle();
		System.out.println(title);
	}

}
