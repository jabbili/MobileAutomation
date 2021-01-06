package com.Test.Android.Screens;

import com.Test.Android.Logger;
import com.Test.Android.Base;
import com.Test.Android.Common;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import static com.Test.Android.Labels.*;

public class OnboardPage extends Base {
    public OnboardPage(AppiumDriver<WebElement> driver) {

    }

    /**
     * Splashscreen is Displayed
     * @throws Exception
     */
    public static void isSplashScreenDisplayed() throws Exception {
            Logger.logAction("Splash screen displayed");
        try {
           Common.isElementIsDisplayedById(SPLASHSCREEN_IMAGE);
            Logger.logStep("Splash screen displayed");
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Encountered Error:- Unable to see splash screen displayed");
        }
    }


    /**
     * Tap Next Button
     * @throws Exception
     */
    public static void goToSecondPage() throws Exception {
        Logger.logAction("Tap on next button");
        try {
            Common.tapOnElementById(NEXT_PAGE);
            Logger.logStep("Tapped on next button");
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Encountered Error:- Unable to Tap on next button");
        }

    }
    /**
     * Tap on Next Button
     * @throws Exception
     */
    public static void goToThirdPage() throws Exception{
        Logger.logAction("Tap on next button and got to get started page");
        try {
            Common.tapOnElementById(NEXT_PAGE);
            Logger.logStep("Tapped on next button and fo to get started page");
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Encountered Error:- Unable to Tap on next button");
        }

    }

    /**
     * Tap to go next on boarding page
     * @throws Exception
     */
    public static void tapOnGetStarted() throws Exception {
        Logger.logAction("Tap on get started");
        try {
            Common.tapOnElementById(GET_STARTED_FIELD);
            Logger.logStep("Tapped on get started button");
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Encountered Error:- Unable to Tap on get started button");
        }

    }
}



