package com.Test.Android.Screens;

import com.Test.Android.Common;
import com.Test.Android.Base;
import com.Test.Android.Logger;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.Test.Android.Labels.*;
public class LoginPage extends Base {
    public LoginPage(AppiumDriver<WebElement> driver) {

    }

    /**
     * Scroll to the Submit Button
     */

    public static void scrollToTheSubmitButton() {
        Logger.logAction("Scroll to the Submit Button");
        try {
            Common.scrollToText(SIGN_IN_STRING);
            Logger.logStep("Scrolled to the Submit Button");
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Unable to scroll to the app");
        }
    }

    /**
     * Sign in to the app
     */
    public static void signInToTheApp() {
        Logger.logAction("Signing into the app ");
        try{
        Common.scrollToText(SIGN_IN_STRING);
        sendKeysToUserNameField();
        sendKeysToPasswordField();
        tapOnSubmitButton();
            Logger.logStep("Signed into the app");
        }catch (Exception exception){
            exception.printStackTrace();
            Logger.logError("Encountered Error:- Unable to Sign in to the app");
        }
    }


    /**
     * Send keys to the user name field
     *
     * @throws Exception
     */
    public static void sendKeysToUserNameField() {
        Logger.logAction("Send Keys to Username field");
        try {
            List<WebElement> editfields = driver.findElements(By.className("android.widget.EditText"));
            editfields.get(0).sendKeys(USER_NAME_VALUE);
            Logger.logStep("Sent keys to Username field");
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Encountered Error:- Unable to send keys to username field");
        }

    }

    /**
     * Send keys to the password field
     * password
     *
     * @throws Exception
     */
    public static void sendKeysToPasswordField() {
        Logger.logAction("Send keys password field");
        try {
            List<WebElement> editfields = driver.findElements(By.className("android.widget.EditText"));
            editfields.get(1).sendKeys(PASSWORD_VALUE);
            Logger.logStep("Sent keys to password field");
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Encountered Error:- Unable to sent keys to password field");
        }
    }

    /**
     * Send keys to the submit button field
     * @throws Exception
     */
    public static void tapOnSubmitButton() {
        Logger.logAction("Tap on Submit Button");
        try{
            List<WebElement> buttons = driver.findElements(By.className("android.widget.Button"));
            buttons.get(0).click();
            Logger.logStep("Tapped on Submit Button");
        }catch (Exception exception){
            exception.printStackTrace();
            Logger.logError("Encountered Error:- Unable to tap on Submit Button");
        }
    }
}