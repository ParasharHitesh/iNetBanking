package inetBanking.testCases;

import java.io.IOException;


import org.testng.annotations.Test;

import inetBanking.pageObjects.RegisPageObjects;
import inetBanking.pageObjects.loginPage;

public class TC_Regis extends BaseClass {

	@Test
	public void RegisterTest() throws IOException, InterruptedException {
		
		
		
		
		loginPage lp=new loginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered Password");
		
		lp.clickSubmit();
		logger.info("Clicked Submit");
Thread.sleep(7000);

RegisPageObjects reg=new RegisPageObjects(driver);

    reg.clickAddcust();
    Thread.sleep(5000);
    
    reg.AddcustName("Amit");
    logger.info("provided name");
    reg.Addgndr();
    Thread.sleep(5000);
    reg.Adddob("10","12","1993");
    
    reg.Addaddr("colony");
    logger.info("provided address");
    reg.Addcity("dli");
    reg.Addstate("Haryana");
    reg.Addpin("1234");
    reg.Addtel("6789");
    String email=randomestring()+"@gmail.com";
    reg.Addemail(email);
    reg.Addpass("1234");
    //reg.submit();
    
    









	}
}