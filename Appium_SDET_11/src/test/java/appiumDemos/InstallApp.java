package appiumDemos;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallApp {
	@Test
	public void installApp() throws MalformedURLException
	{
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "sravan");
		capabilities.setCapability(MobileCapabilityType.UDID, "4cae4334");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		capabilities.setCapability("App", "C:\\Users\\Sravan Kumar\\Downloads\\ApiDemos-debug.apk");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
	   
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, capabilities);
	}

}
