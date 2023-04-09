package com.Appium.Generic;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
     public AndroidDriver driver;
     
     @BeforeSuite
    public void LaunchDb()
    {
    	 System.out.println("db launched");
    }
     
    @BeforeMethod 
	public void LaunchApp() throws MalformedURLException
	{
    	AndroidDriver driver;
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "sravan");
		capabilities.setCapability(MobileCapabilityType.UDID, "4cae4334");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		capabilities.setCapability("appPackage", "io.appium.android.apis");
		capabilities.setCapability("appActivity", ".ApiDemos");
	   
		URL url = new URL("http://localhost:4723/wd/hub");
	    driver = new AndroidDriver(url, capabilities);	
	}
    @AfterClass
    public void closeApp()
    {
    	
    }
    public void closeDb()
    {
    	System.out.println("Db closed");
    }
	
}
