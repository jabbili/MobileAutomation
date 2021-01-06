package com.Test.Android.Tests.Standard.Tests;
import com.Test.Android.Base;
import com.Test.Android.Logger;
import com.Test.Android.Screens.EditionPage;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


//@TestMethodOrder(OrderAnnotation.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EditionPageTests extends Base {
    public static String EVENTS_TITLE = "Events";
    public static String FEATURED_EVENTS_TITLE = "FEATURED EVENTS";
    public static String EDITION_TITLE = "Sherpa Standard Edition Sherpa Standard Edition";
    public static String EDITION_DATE = "May 15, 2019";
    public static String EDITION_LOCATION ="null, null";
    public static String EDITION_PAST_EVENTS = "PAST EVENTS";


    @Test
    public void test1_verifyValidEventsTitleDisplayed() throws Exception {
        Logger.beginTest("Check events title is displayed");
        try {
            EditionPage.isEventsTitleIsPresent(EVENTS_TITLE);
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Events title is not displayed");
        }
        Logger.endTest("Events title is displayed");

    }

    @Test()
    public void test2_verifyValidFeaturedEventsTitleDisplayed() throws Exception {
        Logger.beginTest("Check Featured Events title is displayed");
        try {
            EditionPage.verifyFeaturedEventsTitleIsPresent(FEATURED_EVENTS_TITLE);
        } catch (Exception exception) {
            Logger.logError("Check Featured Events title is not displayed");
        }
        Logger.endTest("Featured Events title is displayed");
    }


    @Test()
    public void test3_verifyValidTitleIsDisplayed() throws Exception {
        Logger.beginTest("Check Title is displayed");
        try {
            EditionPage.isBrandTitlePresent(EDITION_TITLE);
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Title is not displayed");
        }
        Logger.endTest("Title title is displayed");
    }


    @Test()
    public void test4_verifyValidDateIsDisplayed() throws Exception {
        Logger.beginTest("Check show date is displayed");
        try {
            EditionPage.isDateDisplayed(EDITION_DATE);
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("show date is not displayed");
        }
        Logger.endTest("show date title is displayed");

    }

    @Test()
    public void test5_locationIsDisplayed() throws Exception {
        Logger.beginTest("Check show location is displayed");
        try {
            EditionPage.isLocationFieldDisplayed(EDITION_LOCATION);
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("show location is not displayed");
        }
        Logger.endTest("show location title is displayed");

    }
    @Test()
    public void test6_verifyValidPastEventsTitleIsDisplayed() throws Exception {
        Logger.beginTest("Check past events is displayed");
        try {
            EditionPage.isPastEventsFieldIsDisplayed(EDITION_PAST_EVENTS);
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("show past events not displayed");
        }
        Logger.endTest("show past events is displayed");

    }

    @Test()
    public void test7_verifyAbleToTapEditionPageImage() throws Exception{
        Logger.beginTest(" Tap on Edition Image");
        try {
            EditionPage.tapOnEditionImage();
        } catch (Exception exception) {
            exception.printStackTrace();
            Logger.logError("Unable to Tap on Edition Image");
        }
        Logger.endTest("Able to Tap on Edition Image and go to Download Page");

    }

}
