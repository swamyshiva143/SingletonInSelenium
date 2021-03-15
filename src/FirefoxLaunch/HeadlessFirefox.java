package FirefoxLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessFirefox {

	public static void main(String[] args) {
		
		FirefoxBinary firefoxBinary = new FirefoxBinary();
		firefoxBinary.addCommandLineOptions("--headless");
		
		System.setProperty("webdriver.gecko.driver", "D:\\Swamyshiva\\swamyshiva\\geckodriver\\geckodriver.exe");
		
		FirefoxOptions fo= new FirefoxOptions();
		fo.setBinary(firefoxBinary);
		
		WebDriver driver= new FirefoxDriver(fo);
		
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());

	}

}
