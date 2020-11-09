
package inetBanking.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import inetBanking.pageObjects.loginPage;
import inetBanking.utlities.XLutils;

public class TC_Login_DD extends BaseClass {
	
	@Test(dataProvider="loginData")
	public void loginDDT(String uname,String pwd) throws InterruptedException, IOException  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage lp=new loginPage(driver);
		lp.setUserName(uname);
		lp.setPassword(pwd);
		lp.clickSubmit();
		Thread.sleep(2000);
		
		if(isAlertPresent()==true)    {
			
			
	
				driver.switchTo().alert().accept();
				driver.switchTo().defaultContent();
				Assert.assertTrue(false);
		}
		else   {
			Assert.assertTrue(true);
			lp.clickLogout();
			
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
		//String path=System.getProperty("C:/Users/lenovo/eclipse-workspace/inetBanking/src/test/java/inetBanking/testData/loginData.xlsx");
	int rownum=XLutils.getRowCount(path,"sheet1");
	int colcount=XLutils.getCellCount(path,"sheet1",1);  // 1 is written coz system will read col of first row
	
	String loginData [][]=new String [rownum][colcount];
	
	for(int i=1;i<=rownum;i++)  {
		for(int j=0;j<colcount;j++)
		{ loginData[i-1][j]=XLutils.getCellData(path,"Sheet1",i,j);		
	}}
	return loginData;
	
	
	
	
	
	}
	
	}


