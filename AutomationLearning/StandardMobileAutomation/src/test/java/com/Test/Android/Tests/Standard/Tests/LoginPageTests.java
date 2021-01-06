package com.Test.Android.Tests.Standard.Tests;

import com.Test.Android.Base;
import com.Test.Android.Logger;
import com.Test.Android.Screens.*;
import org.junit.Test;

public class LoginPageTests extends Base{

    @Test
    public void goToLoginPage() throws Exception {
        Logger.beginTest("Tap on SignIn button in Home Page ");
        try{
            EditionPage.tapOnEditionImage();
            DownloadPage.tapOnDownloadButton();
            OnboardPage.goToSecondPage();
            OnboardPage.goToThirdPage();
            OnboardPage.tapOnGetStarted();
            threadSleep(3);
            driver.closeApp();//Close the app without session is expired
            driver.launchApp();//Launch the app
            HomePage.tapOnSignInButton(true);
            threadSleep(3);
            LoginPage.signInToTheApp();
        }catch (Exception exception){
            exception.printStackTrace();//This line of code tells where exactly the script stops
            Logger.logError("Encountered error:- Unable to tap on Sign in Button in Home Page");// This line will stop the test case execution
        }
        Logger.endTest("Tapped on the SignIn Button in Home Page");

    }

    @Test
    public void scrollToValidSubmitButton() throws Exception {
        Logger.beginTest("Able to scroll");
        try {
            LoginPage.scrollToTheSubmitButton();
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Unable to scroll");
        }
        Logger.endTest("Able to scroll successfully");
    }

   @Test
   public void loginToTheApp() throws Exception {
       Logger.beginTest("Able to Login");
       try {
       LoginPage.signInToTheApp();
       } catch (Exception exception) {
           exception.printStackTrace();
           Logger.logError("Unable to login");
       }
       Logger.endTest("Able to Sign In successfully");
   }

}




