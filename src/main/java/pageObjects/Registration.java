package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import interfaces.RegTestId;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Registration implements RegTestId {

	public Registration(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	   
	   @AndroidFindBy(accessibility=logininputfield)
	   private WebElement loginInput;
	   
	   @AndroidFindBy(accessibility=loginsavebutton)
	   private WebElement loginsave;
	   
	   @AndroidFindBy(accessibility=otpinputfield)
	   private WebElement otpInput;
	   
	   @AndroidFindBy(accessibility=otpbutton)
	   private WebElement otpsave;
	   
	   
	      
	   public WebElement getloginInputField(){
		   return loginInput;
	   }
	   
	   public WebElement getloginSaveButton(){
		   return loginsave;
	   }
	   
	   public WebElement getotpInputField(){
		   return otpInput;
	   }
	   
	   public WebElement getotpSaveButton(){
		   return otpsave;
	   }

}
