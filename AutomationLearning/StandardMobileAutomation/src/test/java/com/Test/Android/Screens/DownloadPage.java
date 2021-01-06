package com.Test.Android.Screens;

import com.Test.Android.Base;
import com.Test.Android.Common;
import com.Test.Android.Labels;
import com.Test.Android.Logger;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DownloadPage extends Base {

    public DownloadPage(AppiumDriver<WebElement> driver) {

    }

    /**
     * Is Brand Title Displayed
     *
     * @throws Exception
     */
    public static void isBrandTitleDisplayed(String brandTitleDisplayed) throws Exception {
        Logger.logAction("Check Brand title is present or not");
        try {
            if (isElementIsDisplayedById(Labels.BRAND_TITLE_FIELD)) {
                Logger.logComment("Edition events title is present");
                String screenTitle = getTheBrandTitle();
                if (screenTitle.equals(brandTitleDisplayed)) {
                    Logger.logStep("Brand title is displayed correctly");
                } else {
                    Logger.logError("Brand title is displaying incorrectly i.e..," + screenTitle);
                }
            } else {
                Logger.logError("Brand title is not present");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Encountered Error:- Unable to check the Brand title is displayed or not");
        }
    }

    /**
     * Get the Brand title
     *
     * @return
     */
    public static String getTheBrandTitle() {
        try {
            String screenTitle = driver.findElement(By.id(Labels.BRAND_TITLE_FIELD)).getText();
            return screenTitle;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    /**
     * Tapping on Download button
     *
     * @throws Exception
     */
    public static void tapTheDownloadButton() throws Exception {
        Logger.logAction("Tap on Download button");
        try {
            Common.tapOnElementById(Labels.DOWNLOAD_BUTTON);
            Logger.logStep("Tapped on Download button");
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Encountered Error:- Unable to tap on Download button");
        }
    }

    /**
     * Is Brand Title Displayed
     *
     * @throws Exception
     */
    public static void isOverviewFieldDisplayed(String overviewFieldDisplayed) throws Exception {
        Logger.logAction("Check Overview field is present or not");
        try {
            if (isElementIsDisplayedById(Labels.OVERVIEW_FIELD)) {
                Logger.logComment("Overview field is present");
                String screenTitle = getTheOverviewField();
                if (screenTitle.equals(overviewFieldDisplayed)) {
                    Logger.logStep("Overview field is displayed correctly ");
                } else {
                    Logger.logError("Overview field is displaying incorrectly i.e..," + screenTitle);
                }
            } else {
                Logger.logError("Overview field is not present");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Encountered Error:- Unable to check the Overview field is displayed or not");
        }
    }

    /**
     * Get the Brand title
     *
     * @return
     */
    public static String getTheOverviewField() {
        try {
            String screenTitle = driver.findElement(By.id(Labels.OVERVIEW_FIELD)).getText();
            return screenTitle;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }


    /**
     * Is Date field is displayed
     * @throws Exception
     */
    public static void isDateFieldDisplayed(String dateFieldDisplayed)  throws Exception{
        Logger.logAction("Date field is present or not");
        try {
            if (isElementIsDisplayedById(Labels.SHOW_DATE_FIELD)){
                Logger.logComment("Edition events title is present");
                String screenTitle = getTheDateField();
                if (screenTitle.equals(dateFieldDisplayed)){
                    Logger.logStep("Date field is displayed correctly ");
                }else {
                    Logger.logError("Date field is displaying incorrectly i.e..,"+screenTitle);
                }
            }else {
                Logger.logError("Date field is not present");
            }
        }catch(Exception exception) {
            exception.printStackTrace();
            Logger.logError("Encountered Error:- Unable to check the Date field is displayed or not");
        }
    }

    /**
     * Get the Date Field
     * @return
     */
    public static String getTheDateField(){
        try {
            String screenTitle = driver.findElement(By.id(Labels.SHOW_DATE_FIELD)).getText();
            return screenTitle;
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return null;
    }


    /**
     * Is Information field is displayed
     * @throws Exception
     */
    public static void isInformationFieldDisplayed(String informationFieldDisplayed)  throws Exception{
        Logger.logAction("Check Information field is present or not");
        try {
            if (isElementIsDisplayedById(Labels.INFORMATION_FIELD)){
                Logger.logComment("Information is present");
                String screenTitle = getTheInformationField();
                if (screenTitle.equals(informationFieldDisplayed)){
                    Logger.logStep("Information is displayed correctly ");
                }else {
                    Logger.logError("Information is displaying incorrectly i.e..,"+screenTitle);
                }
            }else {
                Logger.logError("Information field is not present");
            }
        }catch(Exception exception) {
            exception.printStackTrace();
            Logger.logError("Encountered Error:- Unable to check the Information field is displayed or not");
        }
    }

    /**
     * Get the Information field
     * @return
     */
    public static String getTheInformationField(){
        try {
            String screenTitle = driver.findElement(By.id(Labels.INFORMATION_FIELD)).getText();
            return screenTitle;
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return null;
    }

    /**
     * Is show city is displayed
     * @throws Exception
     */
    public static void isCityFieldDisplayed(String showCityDisplayed)  throws Exception{
        Logger.logAction("Check Show city field is present or not");
        try {
            if (isElementIsDisplayedById(Labels.SHOW_CITY_FIELD)){
                Logger.logComment("Information is present");
                String screenTitle = getTheShowCityField();
                if (screenTitle.equals(showCityDisplayed)){
                    Logger.logStep("Show city is displayed correctly ");
                }else {
                    Logger.logError("Show city is displaying incorrectly i.e..,"+screenTitle);
                }
            }else {
                Logger.logError("Show city field is not present");
            }
        }catch(Exception exception) {
            exception.printStackTrace();
            Logger.logError("Encountered Error:- Unable to check the Show city field is displayed or not");
        }
    }

    /**
     * Get the show city field
     * @return
     */
    public static String getTheShowCityField() throws Exception{
        try {
            String screenTitle = driver.findElement(By.id(Labels.SHOW_CITY_FIELD)).getText();
            return screenTitle;
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return null;
    }


    /**
     * Check able to tap on Branch Field
     * @throws Exception
     */
    public static void tapOnBranchFieldDisplayed() throws Exception{
        Logger.logAction("Tap on Branch Field");
        try {
            Common.tapOnElementById(Labels.BRANCH_SELECTION_FIELD);
            Logger.logStep("Tapped on Branch Field");
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Encountered Error:- Unable to tap on Branch Field");
        }
    }

    /**
     * Tap on download button displayed
     * @throws Exception
     */
    public static void tapOnDownloadButton() throws Exception {
        Logger.logAction("Tap on Download button");
        try {
            Common.tapOnElementById(Labels.DOWNLOAD_BUTTON);
            threadSleep(10);
            Logger.logStep("Tapped on download button");

        }catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Encountered Error:- Unable to tap on Download button");
        }
    }

    /**
     * Is tap on open Button
     * @throws Exception
     */
    public static void selectBranch(String branchNameToSelect) throws Exception {
        Logger.logAction("Able to select Branch");
        try{
            Common.scrollToTextAndTap(branchNameToSelect);
            Logger.logStep("selected Branch");
        }catch (Exception exception){
            exception.printStackTrace();
            Logger.logError("Encountered Error:- Unable to choose Branch");
        }
     }



    /**
     * Is tap on open Button
     * @throws Exception
     */
    public static void tapOnOpenButton() throws Exception {
        Logger.logAction("Tap on open button");
        try{
            Common.tapOnElementById(Labels.OPEN_BUTTON_FIELD);
            Logger.logStep("Tapped on Open Button");

        }catch (Exception exception){
                exception.printStackTrace();
            Logger.logError("Encountered Error:- Unable to tap on Open Button");
        }
    }


}
