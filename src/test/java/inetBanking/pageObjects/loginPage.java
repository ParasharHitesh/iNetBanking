package inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver driver;
	
	public loginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
} 
	@FindBy(name="uid")
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	@FindBy(xpath="html[1]/body[1]/div[3]/div[1]/ul[1]/li[15]/a[1]")
	WebElement lnkLogout;
	
	
	public void setUserName(String uname)  {
		
		txtUserName.sendKeys(uname);
	}
	
public void setPassword(String pwd)  {
		
	txtPassword.sendKeys(pwd);
	}

public void clickSubmit()  {
	
	btnLogin.click();
	}

public void clickLogout() {
	lnkLogout.click();
}


		
		
	
	
	
}
