package reg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import interfaces.RegTestId;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.Registration;
import utilities.Base2;

public class RegTest2 extends Base2 implements RegTestId {
	AndroidDriver<AndroidElement> driver;
	Registration reg;
     @BeforeTest
     public void beforeloginScreenTest() throws Exception {
    	 killAllNodes();
     }
	 @Test
	  public void loginScreenTest() throws IOException, InterruptedException
	  {
		 service=startServer(); 
	  		// TODO Auto-generated method stub
	  	System.out.println("check1");
		driver=capabilities("bizgoApp");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	     System.out.println("check1");
	      
	  	    
	     reg=new Registration(driver);
	       Thread.sleep(6000);
	      


	  	   //reg.getloginPopupWindow().click();
	       
	       //Login Screen
	       //driver.findElementById(allowpoupup).click();
	       //Login Screen
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
	       reg.getloginInputField().click();
	       //driver.findElementByAccessibilityId(logininputfield).click();
	       driver.getKeyboard().sendKeys(number);
	       //driver.findElementByAccessibilityId(otpsavebutton).click();
	       //Login Screen
	       Thread.sleep(10000);

	       //Utilities util=new Utilities(driver);
	       //util.scrollToText("Image Upload");
	             
	       service.stop();
	       
	  	}



}
