package calculator;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * The TestCalculator class sets up and initializes an AppiumDriver 
 * to interact with an Android Calculator application.
 */
public class TestCalculator {

    /**
     * The main method sets up the desired capabilities for the AppiumDriver 
     * and initializes the driver to connect to the Appium server.
     *
     * @param args command-line arguments
     * @throws MalformedURLException if the URL for the Appium server is malformed
     */
    public static void main(String[] args) throws MalformedURLException {
        // Create an instance of DesiredCapabilities
        DesiredCapabilities capabilities = new DesiredCapabilities();
        
        // Set the device name
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M31");
        
        // Set the device UDID (Unique Device Identifier)
        capabilities.setCapability(MobileCapabilityType.UDID, "UDID");
        
        // Set the platform name to Android
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        
        // Set the Android platform version
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
        
        // Set the app package name of the calculator application
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.sec.android.app.popupcalculator");
        
        // Set the app activity name of the calculator application
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.sec.android.app.popupcalculator.Calculator");
        
        // Set the URL for the Appium server
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        
        // Initialize the AppiumDriver with the server URL and desired capabilities
        AppiumDriver driver = new AppiumDriver(url, capabilities);
        
        // Your test code goes here

        // Quit the driver after the test
        driver.quit();
    }
}
