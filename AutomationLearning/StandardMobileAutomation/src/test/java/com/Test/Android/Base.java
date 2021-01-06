package com.Test.Android;

import com.Test.Android.Screens.*;

import com.Test.Android.Screens.EditionPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Base extends Common{
        public static AppiumDriver<MobileElement> driver = null;

        protected static EditionPage editionPage = null;//Declaration of screen
        protected static DownloadPage downloadPage = null;
        protected static OnboardPage onboardPage = null;
        protected static LoginPage loginPage = null;
        protected static HomePage homePage = null;
        public static String testCaseName;

        /**
         * Reference: <a href="http://appium.io/slate/en/master/?ruby#appium-server-capabilities">http://appium.io/slate/en/master/?ruby#appium-server-capabilities</a>
         * This method sets required appium capabilities using the object of DesiredCapabilities class
         * setting device capability by calling setCapability method with first parameter as property name and second parameter is property value
         * @throws Exception
         */


        public static DesiredCapabilities capabilities = null;
        public static WebDriverWait driverWait = null;

        public static AppiumDriver<WebElement> getDriver(){
            File app = null;
            String appPathPathCapability;
//            if (Labels.platform.equals(Labels.IOS)) {
//                new DesiredCapabilities();
//                capabilities = DesiredCapabilities.iphone();
//                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
//                capabilities.setCapability(MobileCapabilityType.PLATFORM, "iOS");
//                capabilities.setCapability("deviceName", "iPhone 10");
//                capabilities.setCapability("udid", "f6d882edfcb5a98462c78204acff155980fad649");
//                capabilities.setCapability("platformVersion", "13.4.1");
//                app = new File("/Users/jabili/Desktop/STANDARD.ipa");
//                capabilities.setCapability("app", app.getAbsolutePath());
//                capabilities.setCapability("forceMjsonwp ", true);
//                capabilities.setCapability(MobileCapabilityType.FULL_RESET,true);
//                capabilities.setCapability("noSign",true);
//                capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,3000);
//                try {
//                    driver = new IOSDriver(new URL(Labels.IOS_CAPABILITIES_URL), capabilities);
//                    Set<String> context=driver.getContextHandles();
//                    System.out.println("Available contexts="+context);
//                } catch (MalformedURLException e) {
//                    e.printStackTrace();
//                }
//                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//                driverWait = new WebDriverWait(driver,30);//This line of code is to add wait for to the driver to perform the implicit and explicit wait
//            } else if (Labels.platform.equals(Labels.ANDROID)) {
                new DesiredCapabilities();
                capabilities = DesiredCapabilities.android();
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
                capabilities.setCapability("deviceName", Labels.DEVICE_NAME);
                capabilities.setCapability("browserName", "");
                capabilities.setCapability("platformName", Labels.ANDROID);
                capabilities.setCapability("udid","192.168.0.100:5555");
                capabilities.setCapability("platformVersion", Labels.ANDROID_DEVICE_OS);
                capabilities.setCapability("appPackage", Labels.ANDROID_CAPABILITIES_PACKAGE_NAME);
                capabilities.setCapability("appActivity",Labels.ANDROID_CAPABILITIES_APP_ACTIVITY);
                app = new File("/Users/jabili/Desktop/AutomationLearning/StandardMobileAutomation/standardcontainer.51.apk");
                appPathPathCapability = app.getAbsolutePath();
                capabilities.setCapability("app", appPathPathCapability);
                capabilities.setCapability("noReset", true);
                capabilities.setCapability("newCommandTimeout", "8000");
                capabilities.setCapability("unicodeKeyboard", "true");
//            System.setProperty("webdriver.chrome.driver","C:\\selenium_drivers\\chromedriver.exe");

            try {

                    driver = new AndroidDriver(new URL(Labels.ANDROID_CAPABILITIES_URL), capabilities);
                    Set<String> context=driver.getContextHandles();
                    System.out.println("Available contexts="+context);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                driverWait = new WebDriverWait(driver,30);
//            } else {
////                Logger.logWarning("The platform mentioned for the test script is neither iOS or Android");
//            }
            driverWait = new WebDriverWait(driver, 30);
            editionPage = new EditionPage(driver); // Assign the driver to screen name
            downloadPage = new DownloadPage(driver);
            onboardPage = new OnboardPage(driver);
            loginPage = new LoginPage(driver);
            homePage = new HomePage(driver);
            return driver;
        }

        @BeforeClass
        public static void beforeTest(){
        getDriver();
        }

        /**
         * Quits app after executing test scripts.
         */
        @AfterClass
        public static void tearDown() {

         driver.quit();

        }

}

