package com.Test.Android;

public class Labels extends Base {
 ////////////////////// APPIUM Capabilities /////////////////////
 public static final String APPIUM_PORT_NUMBER_DEFAULT = "4723";
 public static final String DEVICE_TYPE_DEFAULT = "phone";


 ////////////////////  Types of devices ////////////////////
 public static final String IOS = "IOS";
 public static final String ANDROID = "Android";

 //////  Important Capabilities//////////
 //Todo:- Please recheck on editing the below labels
 public static String DEFAULT_PLATFORM = ANDROID;
 public static String DEVICE_NAME = "Samsung Note9";
 public static String DEVICE_OS = "12.1"; //Todo:- Device OS needs to be changed only for iOS, for android automatically it will pick up OS while test script running.
 public static String WDA_LOCAL_PORT_DEFAULT = "9070";
 public static final String ANDROID_CAPABILITIES_APP_PATH = "../app_debug.apk";
 public static final String ANDROID_CAPABILITIES_DEVICE_TYPE = "Emulator";
 public static String DEVICE_UDID = "192.168.0.100:5555";
 public static String ANDROID_DEVICE_OS = "9 ";
 public static final String APPIUM_DEVICE_ID_DEFAULT = "emulator-5554"; // MI id


 //////  APPIUM  iOS app capabilities//////////
 public static final String APPIUM_PORT_NUMBER_IOS = System.getProperty("port", APPIUM_PORT_NUMBER_DEFAULT);
 public static final String IOS_CAPABILITIES_URL = "http://localhost:" + APPIUM_PORT_NUMBER_IOS + "/wd/hub";
 public static final String IOS_CAPABILITIES_DEVICE_NAME = "iPhone 7 Plus";
 public static final String IOS_CAPABILITIES_PLATFORM_VERSION_IPHONE7PLUS = "12.0";
 public static final String IOS_CAPABILITIES_PLATFORM_NAME = "iOS";
 public static final String IOS_CAPABILITIES_APPIUM_VERSION = "1.9.1";


 /////////  APPIUM  android app capabilities /////////
 public static final String ANDROID_PLATFORM = "Android";
 public static final String ANDROID_CAPABILITIES_APPIUM_VERSION = "1.15.1";
 public static final String APPIUM_PORT_NUMBER = System.getProperty("port", APPIUM_PORT_NUMBER_DEFAULT);
 public static final String ANDROID_CAPABILITIES_DEVICE_ID = System.getProperty("deviceId", APPIUM_DEVICE_ID_DEFAULT);
 public static final String ANDROID_CAPABILITIES_URL = "http://localhost:" + APPIUM_PORT_NUMBER + "/wd/hub";
 public static final String ANDROID_CAPABILITIES_PACKAGE_NAME = "com.sherpa.standardcontainer";
 public static final String ANDROID_CAPABILITIES_APP_ACTIVITY = "com.sherpa.atouch.infrastructure.android.task.ApplicationLoaderActivity";


 ///////////  ORIENTATION  ///////////
 public static final String PORTRAIT_ORIENTATION = "PORTRAIT";
 public static final String LANDSCAPE_ORIENTATION = "LANDSCAPE";


 ////////////////////  Number of attempts to iterate  ////////////////////
 public static final int MIN_ATTEMPTS = 2;
 public static final int DEFAULT_ATTEMPTS = 5;
 public static final int MAX_ATTEMPTS = 8;
 public static final int DEFAULT_SCROLL_ATTEMPTS = 5;


 ///////////  Property value getters ////////////
 public static String platform = System.getProperty("platform", DEFAULT_PLATFORM);
 public static final String ANDROID_DEVICE_TYPE = System.getProperty("device_type", DEVICE_TYPE_DEFAULT);
 public static final String udid = System.getProperty("udid", DEVICE_UDID);
 public static final String WDA_LOCAL_PORT = System.getProperty("wda", WDA_LOCAL_PORT_DEFAULT);

 ///////////////  Test script execution details ///////////////
 public static String testCaseName;

 public static String UI_AUTOMATOR = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"SIGN IN\").instance(0))";

 /////////////// Edition Page ///////////
 public static final String EDITION_EVENTS_TITLE = "com.sherpa.standardcontainer:id/edition_selection_title";
 public static final String EDITION_FEATURED_EVENTS_TITLE = "com.sherpa.standardcontainer:id/edition_selection_happening_now";
 public static final String EDITION_BRAND_IMAGE = "com.sherpa.standardcontainer:id/edition_big_logo";
 public static final String EDITION_TITLE = "com.sherpa.standardcontainer:id/edition_title";
 public static final String EDITION_DATE = "com.sherpa.standardcontainer:id/edition_date";
 public static final String EDITION_LOCATION = "com.sherpa.standardcontainer:id/edition_location";
 public static final String EDITION_PAST_EVENTS = "com.sherpa.standardcontainer:id/edition_selection_other_events";
 public static final String EDITION_VIEWPAST_EVENTS = "com.sherpa.standardcontainer:id/editionRecyclerViewPast";


 /////////////// Download Page ///////////

 public static final String BRAND_TITLE_FIELD = "com.sherpa.standardcontainer:id/edition_title";
 public static final String DOWNLOAD_BUTTON = "com.sherpa.standardcontainer:id/btn_download";
 public static final String OPEN_BUTTON_FIELD = "com.sherpa.standardcontainer:id/btn_open_edition";
 public static final String OVERVIEW_FIELD = "com.sherpa.standardcontainer:id/edition_overview";
 public static final String INFORMATION_FIELD = "com.sherpa.standardcontainer:id/edition_information";
 public static final String SHOW_DATE_FIELD = "com.sherpa.standardcontainer:id/edition_show_date";
 public static final String SHOW_CITY_FIELD = "com.sherpa.standardcontainer:id/edition_city";
 public static final String BRANCH_SELECTION_FIELD = "android:id/text1";

 /////////////Download Print Labels///////
 public static final String TITLE_NAME_FIELD = "Sherpa Standard Edition Sherpa Standard Edition";
 public static final String SCREEN_DISPLAYED = "Second screen title is displayed";
 public static final String DOWNLOAD_BUTTON_DISPLAYED = "Download Button is present";
 public static final String DOWNLOAD_BUTTON_NOTDISPLAYED = "Download Button si not Displayed";
 public static final String SCREEN_NOTDISPLAYED = "Second screen title is not displayed";


 /////////////// SplashScreen Page ///////////
 public static final String SPLASHSCREEN_IMAGE = "com.sherpa.standardcontainer:id/onboarding_image";

 /////////////// Onboard Page ///////////
 public static final String NEXT_PAGE = "com.sherpa.standardcontainer:id/onboarding_activity_navigator_end_label";
 //public static final String ONBOARDING_PAGEONE ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.Tab[3]";
 // public static final String ONBOARDING_PAGETWO = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.Tab[4]";
 public static final String GET_STARTED_FIELD = "com.sherpa.standardcontainer:id/onboarding_activity_navigator";


 ///////////////  LoginPage ///////////////
 public static final String SIGNIN_BUTTON_FIELD = "com.sherpa.standardcontainer:id/bg_btn_login";
 public static final String USER_NAME_FIELD = "username";
 public static final String USER_NAME_VALUE = "testll";
 public static final String PASSWORD_FIELD = "password";
 public static final String PASSWORD_VALUE = "33556";
 public static final String SUBMIT_BUTTON_FIELD = "submitButton";
 public static final String SIGN_IN_STRING = "SIGN IN";
 public static final String BANNER_ADD_VIEW ="com.sherpa.standardcontainer:id/banner_view";

 ///////////////  HomePage ///////////////
 public static final String HAMBURGERMENU_FIELD = "android:id/up";
 public static final String EXIT_EDITION_FIELD = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/androidx.drawerlayout.widget.DrawerLayout/android.widget.ListView/android.widget.RelativeLayout[9]";
 public static final String SIGNEDIN_USER_NAME ="com.sherpa.standardcontainer:id/user";
 public static final String GUEST_FIELD = "com.sherpa.standardcontainer:id/user";

}
