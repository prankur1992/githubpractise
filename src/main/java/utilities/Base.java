package utilities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	
	public static AndroidDriver<AndroidElement>  driver;
	public static  AndroidDriver<AndroidElement> capabilitiesBizgo() throws MalformedURLException
	{
		String url="http://127.0.0.1:4723/wd/hub";

		 File f = new File("src");
	     File nf = new File(f, "bizgoapplication.apk");
	     DesiredCapabilities cap = new DesiredCapabilities();
	     cap.setCapability(MobileCapabilityType.DEVICE_NAME, "NewDevice");
	     //cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.bizgo.MainActivity");
	     //cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.bizgo");
	     cap.setCapability(MobileCapabilityType.APP, nf.getAbsolutePath());
	     
	     cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
	   	 driver = new AndroidDriver<>(new URL(url), cap);
	    cap.setCapability("noReset", true);   
   
	    return driver;
	}
	public void killAllNodes() throws Exception
	{
	//taskkill /F /IM node.exe
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(3000);
		
	}
	
	public static void getScreenshot(String s) throws IOException
	{
	File scrfile=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrfile,new File(System.getProperty("user.dir")+"\\Screenshots\\"+s+".png"));
	
	}

}
