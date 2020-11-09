package inetBanking.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import inetBanking.pageObjects.loginPage;

public class Parameterization extends BaseClass   {
	@DataProvider(name="Data")
	public static Object[][] para () {
	
		return new Object[][] { { "mngr291912", "enubYje" },{ "mngr291913", "enubYje" },{ "mngr291912", "enubYje" } };
	}
	
	@Test(dataProvider = "Data")
	public void test(String uname,String pwd) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	loginPage lp=new loginPage(driver);
	
	lp.setUserName(uname);
	lp.setPassword(pwd);
	lp.clickSubmit();
	
if(isAlertPresent()==true)    {
		driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
	}
	else   {
		Assert.assertTrue(true);
		lp.clickLogout();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
	}

}
public boolean isAlertPresent()  {
	try {
	driver.switchTo().alert();
	return true;    }
	catch(NoAlertPresentException e)  {
		return false;
	}
} }
	
	
	
	


