package Steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegisterPageSnippets extends BaseClass {
	
	public static RegisterPage registerPage;
	@Given("user open {string} browser")
	public void user_open_browser(String browserName) {
		BaseClass.initialization(browserName);
		
	}
		
	@When("user is on RegisterPage")
	public void user_is_on_register_page() {
	    
		String url=prop.getProperty("URL");
		driver.get(url);
	
	}

	@When("user enter valid {string} , {string},{string} and {string}")
	public void user_enter_valid_and(String Fname, String Lname, String EmailId, String password) {
	   
		 registerPage=new RegisterPage();
		 registerPage.enterUserInfoFunctionality(Fname, Lname, EmailId, password);
	}

	@When("user select DOB as {string},{string},{string} and user select gender as {string}")
	public void user_select_dob_as_and_user_select_gender_as(String date, String month, String year, String gender) {
	    
		registerPage.selectDOBFunctionality(date, month, year, gender);

	}
}
