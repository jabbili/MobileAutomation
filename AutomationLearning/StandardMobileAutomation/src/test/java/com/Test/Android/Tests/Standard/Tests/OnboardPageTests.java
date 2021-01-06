package com.Test.Android.Tests.Standard.Tests;

import com.Test.Android.Base;
import com.Test.Android.Logger;
import com.Test.Android.Screens.DownloadPage;
import com.Test.Android.Screens.EditionPage;
import com.Test.Android.Screens.OnboardPage;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OnboardPageTests extends Base {

    @Test()
    public void test1_verifySplashScreenIsDisplayed() throws Exception {
        Logger.beginTest("Brand Title is displayed");
        try {
        EditionPage.tapOnEditionImage();
        DownloadPage.tapOnDownloadButton();
        OnboardPage.isSplashScreenDisplayed();

        }catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Brand Title is not displayed");
        }
        Logger.endTest("Brand Title is displayed");

    }


    @Test()
    public void test2_tapOnboardPageOne() throws Exception {
        Logger.beginTest("Tap on Onboard page one");
        try {
            OnboardPage.goToSecondPage();
        }catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Unable to Tap on Onboard page one ");
        }
        Logger.endTest("Successfully tapped on Onboard page one");

    }

    @Test()
    public void test3_tapOnOnboardPageTwo() throws Exception {
        Logger.beginTest("Tap on Onboard page two");
        try {
        OnboardPage.goToThirdPage();
        }catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Unable to Tap on Onboard page two");
        }
        Logger.endTest("Successfully tapped on Onboard page two");
    }

    @Test()
    public void test4_verifyGetStartedButton() throws Exception {
        Logger.beginTest("Tap on get started");
        try {
        OnboardPage.tapOnGetStarted();
 //           driver.quit();
//         driver.resetApp();
//       driver.launchApp();

        }catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Unable to tap on get started");
        }
        Logger.endTest("Successfully tapped on get started ");

    }

}
