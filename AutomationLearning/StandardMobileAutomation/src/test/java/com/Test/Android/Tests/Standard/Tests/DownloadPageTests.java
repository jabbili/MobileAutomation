package com.Test.Android.Tests.Standard.Tests;

import com.Test.Android.Base;
import com.Test.Android.Logger;
import com.Test.Android.Screens.DownloadPage;
import com.Test.Android.Screens.EditionPage;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DownloadPageTests extends Base {

    public static String BRAND_TITLE_FIELD = "Sherpa Standard Edition Sherpa Standard Edition";
    public static String OVERVIEW_FIELD = "Overview";
    public static String INFORMATION_FIELD = "Information";
    public static String SHOW_DATE_FIELD = "May 15, 2019 - May 18, 2019";
    public static String SHOW_CITY_FIELD ="null, null";



    @Test
    public void test1_validSherpaTitleIsDisplayed() throws Exception {
        Logger.beginTest("Brand Title is displayed");
        try {
            EditionPage.tapOnEditionImage();
            threadSleep(20);
            DownloadPage.isBrandTitleDisplayed(BRAND_TITLE_FIELD);
        }catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Brand Title is not displayed");
        }
        Logger.endTest("Brand Title is displayed");

    }

    @Test
    public void test2_validOverviewDisplayed() throws Exception {
        Logger.beginTest("Check Overview is displayed");
        try {
            DownloadPage.isOverviewFieldDisplayed(OVERVIEW_FIELD);
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Overview is not displayed");
        }
        Logger.endTest("Overview is displayed");

    }

    @Test
    public void test3_validInformationDisplayed() throws Exception {
        Logger.beginTest("Check Information is displayed");
        try {
            DownloadPage.isInformationFieldDisplayed(INFORMATION_FIELD);
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Information is not displayed");
        }
        Logger.endTest("Information is displayed");

    }

    @Test
    public void test4_validDateFieldIsDisplayed() throws Exception {
        Logger.beginTest("Check Date is displayed");
        try {
            DownloadPage.isDateFieldDisplayed(SHOW_DATE_FIELD);
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Date is not displayed");
        }
        Logger.endTest("Date is displayed");

    }

    @Test
    public void test5_validCityDisplayed() throws Exception {
        Logger.beginTest("City field is displayed");
        try {
            DownloadPage.isCityFieldDisplayed(SHOW_CITY_FIELD);
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("City field is not displayed");
        }
        Logger.endTest("City field is displayed");

    }

    @Test
    public void test6_chooseTheBranchName() throws Exception {
        Logger.beginTest("Able to choose the Branch ");
        try {
            DownloadPage.tapOnBranchFieldDisplayed();//Tap On Select branch Name
            //ChooseBranch
            //Verify the selected branch
            DownloadPage.selectBranch("toto");
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Unable to choose the Branch");
        }
        Logger.endTest("Able to choose Branch");

    }

    @Test()
    public void test7_tapOnDownloadButton() throws Exception {
        Logger.beginTest("Able to tap on Download Button ");
        try {
            DownloadPage.tapOnDownloadButton();
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Unable to tap on Download Button");
        }
        Logger.endTest("Able to tap on Download Button");
    }


}

