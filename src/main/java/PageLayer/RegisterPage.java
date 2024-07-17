package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDropDown;
import UtilityLayer.Wait;

public class RegisterPage extends BaseClass{

	@FindBy(name="firstname")
	private WebElement fname;
	
	@FindBy(name="lastname")
	private WebElement lname;
	
	@FindBy(name="reg_email__")
	private WebElement emailId;
	
	@FindBy(name="reg_passwd__")
	private WebElement pass;
	
	@FindBy(name="birthday_day")
	private WebElement bdate;
	
	@FindBy(name="birthday_month")
	private WebElement bmonth;
	
	@FindBy(name="birthday_year")
	private WebElement byear;
	
	
	@FindBys(@FindBy(xpath="//label[text()='Female']"))
	private List<WebElement> Gender;
	

	
	
	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterUserInfoFunctionality(String Fname, String Lname, String EmailId, String password)
	{
		
		Wait.sendKeys(fname, Fname);
		Wait.sendKeys(lname, Lname);
		Wait.sendKeys(emailId, EmailId);
		Wait.sendKeys(pass, password);
		
	}
	
	public void selectDOBFunctionality(String date, String month, String year, String gender)
	{
		
		HandleDropDown.selectByVisibleText(bdate, date);
		HandleDropDown.selectByVisibleText(bmonth, month);
		HandleDropDown.selectByVisibleText(byear, year);
		
		Wait.selectAnyOneOption(Gender, gender);
	}
	
	
	
	
	
}
