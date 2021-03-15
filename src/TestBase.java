import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	
	public static WebDriver driver= null;
	
	public static void initialize() {
		
		if(driver==null) {
			if(Constants.browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
				driver =  new ChromeDriver();	//launch browser
			}
			else if(Constants.browserName.equalsIgnoreCase("FF")) {
				System.setProperty("webdriver.gecko.driver", "D:\\Swamyshiva\\swamyshiva\\geckodriver\\geckodriver.exe");
				driver =  new FirefoxDriver();	//launch browser
			}
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(Constants.url);
	}
	
	public static void quit() {
		
		System.out.println("quitting the browser");
		driver.quit();
		driver=null;
		
	}
	
	public static void close() {
		System.out.println("closing the browser");
		driver.close();
		driver=null;
		
	}

}
