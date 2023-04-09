package appiumDemos;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.Appium.Generic.BaseClass;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchApp extends BaseClass {
	AndroidDriver driver;

//	@Test
//	public void launchApp() throws MalformedURLException
//	{
//		DesiredCapabilities capabilities= new DesiredCapabilities();
//		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
//		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "sravan");
//		capabilities.setCapability(MobileCapabilityType.UDID, "4cae4334");
//		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
//		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
//		capabilities.setCapability("appPackage", "io.appium.android.apis");
//		capabilities.setCapability("appActivity", ".ApiDemos");
//
//		URL url = new URL("http://localhost:4723/wd/hub");
//		driver = new AndroidDriver(url, capabilities);
//	}
	@Test
	public void longClick() {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]")).click();
		WebElement element = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));

		(driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(), "duration", 3000));
	}
//		@Test
//		public void scrolDown()
//		{
//		boolean canScrollMore = (Boolean) ( driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
//		    "left", 100, "top", 370, "width", 250, "height", 1900,
//		    "direction", "down",
//		    "percent", 3.0
//		    ));
//		    
//		}
//		@Test
//		 public void scrollUp()
//		 {
//			boolean canScrollMore1 = (Boolean) ( driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
//			    "left", 100, "top", 370, "width", 250, "height", 1900,
//			    "direction", "up",
//			    "percent", 3.0
//		));
//			
//		 }
}
