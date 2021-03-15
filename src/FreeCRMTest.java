import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FreeCRMTest {
	
	@BeforeMethod
	public void setUp() {
		TestBase.initialize();
		
	}
	
	@Test(priority=1)
	public void verifyFreeCRMTitleTest() {
		String title= TestBase.driver.getTitle();
		System.out.println("the title is:"+title);
		Assert.assertEquals(title, Constants.loginPageTitle);
	}
	
//	@Test(priority=2)
//	public void logoTest() {
//		Assert.assertEquals(TestBase.driver.findElement(By.xpath(xpath).isDisplyaed(), true);
//	}
	@AfterMethod
	public void tearDown() {
		TestBase.quit();
	}

}
