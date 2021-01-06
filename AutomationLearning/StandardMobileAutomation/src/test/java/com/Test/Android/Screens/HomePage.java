package com.Test.Android.Screens;

import com.Test.Android.Logger;
import com.Test.Android.Base;
import com.Test.Android.Common;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.Test.Android.Labels.*;


public class HomePage extends Base {

    public HomePage(AppiumDriver<WebElement> driver) {
    }


    /**
     *Tap on Hamburger Menu
     * @throws Exception
     */
    public void tapOnHamburgerMenu() throws Exception {
        Logger.logAction("Tap on hamburger menu");
        try {
            Common.tapOnElementById(HAMBURGERMENU_FIELD);
            Logger.logStep("Tapped on hamburger menu");
        } catch (Exception exception) {
                 exception.printStackTrace();
                Logger.logError("Encountered Error:- Unable to tap on hamburger menu");
        }
    }
    /**
     *Tap on ExitEdition
     * @throws Exception
     */

    public void tapOnExitEdition() throws Exception {
        Logger.logAction("Tap on exit edition");
        try {
            Common.tapOnElementById(EXIT_EDITION_FIELD);
            Logger.logStep("Tapped on exit edition");
        } catch (Exception exception) {
                exception.printStackTrace();
            Logger.logError("Encountered Error:- Unable to tap on exit edition");

        }

    }
    /**
     *Tap on sign in button
     * @throws Exception
     */
    public static void tapOnSignInButton(boolean warningWhenFail) throws Exception {
        Logger.logAction("Tap on signIn button");
        try {
            threadSleep(2);
            if (warningWhenFail) {
                WebElement signInButton = driver.findElement(By.id(SIGNIN_BUTTON_FIELD));
                if (signInButton.isDisplayed()) {
                    signInButton.click();
                    Logger.logStep("Tapped on signIn button");
                } else {
                    Logger.logWarning("Sign In button is not displayed in the current active screen");
                }
            }else {
                Common.tapOnElementById(SIGNIN_BUTTON_FIELD);//For demo purpose we commented this line inorder to make this method as WARNING in fail case
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            if (warningWhenFail){
                Logger.logWarning("Encountered Error (Warning) :- Unable to tap on signIn button");
            }else {
                Logger.logError("Encountered Error :- Unable to tap on signIn button");
            }
        }

        }
}
