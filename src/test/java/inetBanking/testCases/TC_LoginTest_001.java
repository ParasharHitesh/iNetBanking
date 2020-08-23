package inetBanking.testCases;


import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import inetBanking.pageObjects.loginPage;



public class TC_LoginTest_001 extends BaseClass {
	@Test
	public void loginTest() throws IOException {
		
		
		
		
		loginPage lp=new loginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered Password");
		
		lp.clickSubmit();
		logger.info("Clicked Submit");
		
		String s=driver.getTitle();
		System.out.println(s);

	
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
		
		Assert.assertTrue(true);
		logger.info("Login Test Passed");
	}
	else {
		captureScreen(driver,"loginTest");
		Assert.assertTrue(false);
		logger.info("Login Test Failed");
	}
		
		
	
	

}
}