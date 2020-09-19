package inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisPageObjects {
WebDriver driver;

	public RegisPageObjects(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
}
	
	@FindBy(xpath="//a[contains(text(),'New Customer')]")
	WebElement custbtn;
	
	
	@FindBy(name="name")
	WebElement custname;
	
	@FindBy(name="rad1")
	WebElement gndr;
	
	@FindBy(name="dob")
	WebElement dob;
	
	@FindBy(name="addr")
	WebElement addr;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="pinno")
	WebElement pinno;
	
	@FindBy(name="telephoneno")
	WebElement tele;
	
	@FindBy(name="emailid")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="sub")
	WebElement sub;
	
	public void clickAddcust() {
		custbtn.click();
		}
	
	public void AddcustName(String cname) {
		custname.sendKeys(cname);
		
	}
	public void Addgndr() {
		gndr.click();
		
	}
	public void Adddob(String dd,String mm,String yy) {
		dob.sendKeys(dd); 
		dob.sendKeys(mm);
		dob.sendKeys(yy);}
	
	public void Addaddr(String adrs ) {
		addr.sendKeys(adrs);  }
	
	public void Addcity(String cty) {
		city.sendKeys(cty);  }
	
	public void Addstate(String stat) {
		state.sendKeys(stat);  }
	
	public void Addpin(String pin) {
		pinno.sendKeys(pin);  }
	
	public void Addtel(String tel) {
		tele.sendKeys(tel);  }
	

	public void Addemail(String emal) {
		email.sendKeys(emal);  }
	
	public void Addpass(String pas) {
		password.sendKeys(pas);  }
	
	public void submit() {
		sub.click();  }
	
	
	

}
