package com.Test.Android.Tests.Standard.Tests;

import com.Test.Android.Logger;
import com.Test.Android.Screens.EditionPage;
import com.Test.Android.Screens.HomePage;
import com.Test.Android.Screens.OnboardPage;
import com.Test.Android.Base;
import com.Test.Android.Screens.DownloadPage;
import org.junit.Test;

public class HomePageTests extends Base {

    @Test()
    public void goToLoginPage() throws Exception {
        Logger.beginTest("Go to login page");
        try {
            EditionPage.tapOnEditionImage();
            DownloadPage.tapOnDownloadButton();
            OnboardPage.goToSecondPage();
            OnboardPage.goToThirdPage();
            OnboardPage.tapOnGetStarted();
            HomePage.tapOnSignInButton(true);
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Unable to go to login page");
        }
        Logger.endTest("Able to go to login page");

    }
}
