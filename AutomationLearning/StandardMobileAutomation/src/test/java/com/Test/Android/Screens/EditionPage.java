package com.Test.Android.Screens;

import com.Test.Android.Common;
import com.Test.Android.Logger;
import com.Test.Android.Base;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.Test.Android.Labels.*;


public class EditionPage extends Base {

    //Constructor method
    public EditionPage(AppiumDriver<WebElement> driver) {

    }

    /**
     * Is Events Title Displayed
     * @throws Exception
     */
    public static void isEventsTitleIsPresent(String eventsTitleToBeDisplayed)  throws Exception{
        Logger.logAction("Check events title is present or not");
        try {
            if (isElementIsDisplayedById(EDITION_EVENTS_TITLE)){
                Logger.logComment("Edition events title is present");
                String screenTitle = getTheEditionEventsTitle();
                if (screenTitle.equals(eventsTitleToBeDisplayed)){
                    Logger.logStep("Edition page title is displayed correctly");
                }else {
                    Logger.logError("Edition page title is displaying incorrectly i.e..,"+screenTitle);
                }
            }else {
                Logger.logError("Edition events title is not present");
            }
        }catch(Exception exception) {
            exception.printStackTrace();
            Logger.logError("Encountered Error:- Unable to check the events title is displayed or not");
        }
    }

    /**
     * Get the edition events title
     * @return
     */
    public static String getTheEditionEventsTitle(){
        try {
            String screenTitle = driver.findElement(By.id(EDITION_EVENTS_TITLE)).getText();
            return screenTitle;
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return null;
    }


    /**
     * Is Featured Events is Displayed
     * @throws Exception
     */
    public static void verifyFeaturedEventsTitleIsPresent(String featuredEventsTitleToBeDisplayed)  throws Exception {
        Logger.logAction("Check featured events title is present or not ");
        try {
            if (isElementIsDisplayedById(EDITION_FEATURED_EVENTS_TITLE)){
                Logger.logComment("Featured events title is present");
                String screenTitle = getTheEditionFeaturedEventsTitle();
                if (screenTitle.equals(featuredEventsTitleToBeDisplayed)){
                    Logger.logStep("Featured events title is displayed correctly");
                }else {
                    Logger.logError("Featured events title is displaying incorrectly i.e..,"+ screenTitle);
                }
            }else {
                Logger.logError("Featured events title is not present");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Encountered Error:- Unable to check the featured events title is displayed or not");
        }
    }

    /**
     * Get the Featured events title
     * @return
     */
    public static String getTheEditionFeaturedEventsTitle(){
        try {
            String screenTitle = driver.findElement(By.id(EDITION_FEATURED_EVENTS_TITLE)).getText();
            return screenTitle;
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return null;
    }

    /**
     * Is brand logo element displayed
     * @throws Exception
     */
    public static void checkBrandLogoIsDisplayed() throws Exception{
        Logger.logAction("Check the brand logo is displayed");
        try {
            Common.isElementIsDisplayedById(EDITION_BRAND_IMAGE);
            Logger.logStep("Edition logo is displayed");
        }catch (Exception exception){
            exception.printStackTrace();
            Logger.logError("Encountered Error:- Unable to check the brand logo is displayed or not");
        }
    }

    /**
     * Is Brand title is Displayed
     * @throws Exception
     */
    public static void isBrandTitlePresent(String titleToBeDisplayed)  throws Exception {
        Logger.logAction("Check title is present or not ");
        try {
            if (isElementIsDisplayedById(EDITION_TITLE)){
                Logger.logComment("Title is present");
                String screenTitle = getTheBrandTitle();
                if (screenTitle.equals(titleToBeDisplayed)){
                    Logger.logStep("Title is displayed correctly");
                }else {
                    Logger.logError("Title is displaying incorrectly i.e..,"+screenTitle);
                }
            }else {
                Logger.logError("Title is not present");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Encountered Error:- Unable to check the title is displayed or not");
        }
    }

    /**
     * Get the brand title
     * @return
     */
    public static String getTheBrandTitle(){
        try {
            String screenTitle = driver.findElement(By.id(EDITION_TITLE)).getText();
            return screenTitle;
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return null;
    }


    /**
     * Is Date Displayed
     * @throws Exception
     */
    public static void isDateDisplayed(String dateToBeDisplayed)  throws Exception {
        Logger.logAction("Check Date is present or not ");
        try {
            if (isElementIsDisplayedById(EDITION_DATE)){
                Logger.logComment("Date is present");
                String screenTitle = getTheDate();
                if (screenTitle.equals(dateToBeDisplayed)){
                    Logger.logStep("Date is displayed correctly");
                }else {
                    Logger.logError("Date is displaying incorrectly i.e..,"+screenTitle);
                }
            }else {
                Logger.logError("Date is not present");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Encountered Error:- Unable to check the Date is displayed or not");
        }
    }

    /**
     * Get the Date
     * @return
     */
    public static String getTheDate(){
        try {
            String screenTitle = driver.findElement(By.id(EDITION_DATE)).getText();
            return screenTitle;
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return null;
    }

    /**
     * Is Date Displayed
     * @throws Exception
     */
    public static void isLocationFieldDisplayed(String locationToBeDisplayed)  throws Exception {
        Logger.logAction("Check Location is present or not ");
        try {
            if (isElementIsDisplayedById(EDITION_LOCATION)){
                Logger.logComment("Date is present");
                String screenTitle = getTheLocation();
                if (screenTitle.equals(locationToBeDisplayed)){
                    Logger.logStep("Location is displayed correctly");
                }else {
                    Logger.logError("Location is displaying incorrectly i.e..,"+screenTitle);
                }
            }else {
                Logger.logError("Location is not present");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Encountered Error:- Unable to check the Location is displayed or not");
        }
    }

    /**
     * Get the Date
     * @return
     */
    public static String getTheLocation(){
        try {
            String screenTitle = driver.findElement(By.id(EDITION_LOCATION)).getText();
            return screenTitle;
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return null;
    }

    /**
     * Is Date Displayed
     * @throws Exception
     */
    public static void isPastEventsFieldIsDisplayed(String pastEventsTitleToBeDisplayed)  throws Exception {
        Logger.logAction("Check Past events is present or not ");
        try {
            if (isElementIsDisplayedById(EDITION_PAST_EVENTS)){
                Logger.logComment("Past events is present");
                String screenTitle = getThePastEvents();
                if (screenTitle.equals(pastEventsTitleToBeDisplayed)){
                    Logger.logStep("Past Events is displayed correctly");
                }else {
                    Logger.logError("Past Events is displaying incorrectly i.e..,"+screenTitle);
                }
            }else {
                Logger.logError("Past Events is not present");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Encountered Error:- Unable to check the Past Events is displayed or not");
        }
    }

    /**
     * Get the Date
     * @return
     */
    public static String getThePastEvents(){
        try {
            String screenTitle = driver.findElement(By.id(EDITION_PAST_EVENTS)).getText();
            return screenTitle;
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return null;
    }


    /**
     * Tapping on brand image in Edition page
     * @throws Exception
     */
    public static void tapOnEditionImage()  throws Exception{
        Logger.logAction("Tap on edition page");
        try {
            Common.tapOnElementById(EDITION_BRAND_IMAGE);
            Logger.logStep("Tapped on Edition page");
        }catch(Exception exception) {
            exception.printStackTrace();
            Logger.logError("Encountered Error:- Unable to tap on Edition page");
        }
    }

}

