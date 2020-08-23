package inetBanking.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import inetBanking.pageObjects.loginPage;
import inetBanking.utlities.XLutils;

public class TC_Login_DD extends BaseClass {
	
	@Test(dataProvider="loginData")
	public void loginDDT(String uname,String pwd) throws InterruptedException, IOException  {
		
		loginPage lp=new loginPage(driver);
		lp.setUserName(uname);
		lp.setPassword(pwd);
		lp.clickSubmit();
		Thread.sleep(3000);
		
		if(isAlertPresent()==true)    {
			Thread.sleep(7000);
			captureScreen(driver,"loginDDT");
			Thread.sleep(7000);
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
	}
	
	@DataProvider(name="loginData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/inetBanking/testData/loginData.xlsx";
	
	int rownum=XLutils.getRowCount(path,"sheet1");
	int colcount=XLutils.getCellCount(path,"sheet1",1);
	
	String loginData [][]=new String [rownum][colcount];
	
	for(int i=1;i<rownum;i++)  {
		for(int j=0;j<colcount;j++)
		{ loginData[i-1][j]=XLutils.getCellData(path,"Sheet1",i,j);		
	}}
	return loginData;
	
	
	
	
	
	}
	
	}


