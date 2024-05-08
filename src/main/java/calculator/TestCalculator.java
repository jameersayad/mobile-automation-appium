package calculator;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestCalculator {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M31");
		capabilities.setCapability(MobileCapabilityType.UDID, "UDID");
		
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");		
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.sec.android.app.popupcalculator");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.sec.android.app.popupcalculator.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AppiumDriver driver = new AppiumDriver(url,capabilities);
		
		
	}

}
