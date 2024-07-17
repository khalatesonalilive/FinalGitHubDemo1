package UtilityLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class Wait extends BaseClass {

	public static void sendKeys(WebElement wb,String value)
	{
		
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb)).sendKeys(value);
		
	}
	
	public static void selectAnyOneOption(List<WebElement> wb,String gender)
	{
		
	List<WebElement>ls=	new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfAllElements(wb));
	
	for(WebElement wbnew:ls)
	{
		
		if(wbnew.getText().equalsIgnoreCase(gender))
		{
			wbnew.click();
			
		}
	}
	}
	
}
