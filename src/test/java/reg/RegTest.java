package reg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import interfaces.RegTestId;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.Registration;
import utilities.Base;

public class RegTest extends Base implements RegTestId {
	
	 @Test
	  public void loginScreenTest() throws IOException, InterruptedException
	  {
	  		// TODO Auto-generated method stub
	  	
	  		AndroidDriver<AndroidElement> driver=capabilitiesBizgo();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       Registration reg=new Registration(driver);
	       //reg.getloginPopupWindow().click();
	       
	       //Login Screen
	       //driver.findElementById(allowpoupup).click();
	       //Login Screen
	       Thread.sleep(10000);
	       reg.getloginInputField().click();
	       //driver.findElementByAccessibilityId(logininputfield).click();
	       driver.getKeyboard().sendKeys(number);
	       Thread.sleep(5000);
	       
	       reg.getloginSaveButton().click();
	       //driver.findElementByAccessibilityId(loginsavebutton).click();
	       
	       //Otp Screen
	       Thread.sleep(10000);
	       reg.getotpInputField().click();
	       //driver.findElementByAccessibilityId(otpinputfield).click();
	       driver.getKeyboard().sendKeys(otp);
	       Thread.sleep(500);
	       
	       reg.getotpSaveButton().click();
	       
	       //driver.findElementByAccessibilityId(otpsavebutton).click();
	       //Login Screen
	       Thread.sleep(5000);

	       //Utilities util=new Utilities(driver);
	       //util.scrollToText("Image Upload");
	             
	       
	       
	  	}



}
