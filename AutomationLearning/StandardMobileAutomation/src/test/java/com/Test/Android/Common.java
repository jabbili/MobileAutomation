package com.Test.Android;

import io.appium.java_client.MobileBy;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.Test.Android.Base.driver;

public class Common {

    /**
     * Verify Element By Id
     * @param parsingElement
     * @return
     */
    public static boolean isElementIsDisplayedById(String parsingElement){
        Logger.logAction("Checking is element displayed by ID:- "+parsingElement);
        try
        {
           WebElement parsingElementName =driver.findElementById(parsingElement);
            if (parsingElementName.isDisplayed()){
                Logger.logStep("Element is displayed by ID:-"+ parsingElementName.getText());
                return true;
            }else {
                Logger.logError("Element is not displayed by Name");
            }
        }catch (Exception exception){
            exception.printStackTrace();
            Logger.logError("Element is not displayed by Name");
        }
        return false;
    }



    /**
     * Tap on element by ID
     * @param parsingElement
     */
    public static void tapOnElementById(String parsingElement){
        Logger.logAction("Tap on Element by Id :-"+parsingElement);
        try {
            WebElement parsingElementName = driver.findElementById(parsingElement);
            Logger.logStep("Element is displayed by Id" + parsingElementName.getText());
            if (parsingElementName.isDisplayed()){
                parsingElementName.click();
            }else {
                Logger.logError("Element is not displayed by ID :- "+parsingElement);
            }
        }catch (Exception exception){
            exception.printStackTrace();
            Logger.logError("Encountered Error:- Unable to do the Action");
        }
    }

    /**
     * Tap on element by Name
     * @param parsingElement
     */
    public static void tapOnElementByName(String parsingElement){
        WebElement parsingElementName = driver.findElementByName(parsingElement);
        if (parsingElementName.isDisplayed()){
            parsingElementName.click();
        }else {
            Assert.fail("Element is not displayed by Name");
        }
    }


    /**
     * Tap on element by Name
     * @param parsingElement
     */
    public static void tapOnElementByXpath(String parsingElement){
        WebElement parsingElementName = driver.findElementByName(parsingElement);
        if (parsingElementName.isDisplayed()){
            parsingElementName.click();
        }else {
            Assert.fail("Element is not displayed by Name");
        }
    }

    /**
     * Scroll to text
     * @param textToScroll
     */
    public static WebElement scrollToText(String textToScroll){
        try{
            String UI_AUTOMATOR_WITHOUT_PARSING_STRING = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"";
            String UI_AUTOMATOR_TAIL_PART = "\").instance(0))";
            WebElement scrolledTestWebElement = driver.findElement(MobileBy.AndroidUIAutomator(UI_AUTOMATOR_WITHOUT_PARSING_STRING+textToScroll+UI_AUTOMATOR_TAIL_PART));
            System.out.println("Scrolled to the text :- "+textToScroll);
            return scrolledTestWebElement;
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return null;
    }

    /**
     * Scroll to text
     * @param compareText and Locator
     */
    public static WebElement compareTheStringById(String compareText, String locator){
        try{
            String TextIsDisplaying = driver.findElement(By.id(locator)).getText();
 //          String TextIsDisplaying = driver.findElement(By.id(locator)).getAttribute("");
            if (TextIsDisplaying.matches(compareText)) {
                System.out.println("Given text Matches");
            }
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return null;
    }



    /**
     * Scroll to text and tap on it

     */
    public static void scrollToTextAndTap(String textToScroll){
        try{
           WebElement tapOnTextWebElement =  scrollToText(textToScroll);
           tapOnTextWebElement.click();
            System.out.println("Scrolled to the text :- "+textToScroll);
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }

    /**
     * This method will check is element displayed
     * @param parsingString
     * @return
     */
    public boolean isElementDisplayedById(String parsingString){
        WebElement elementName = driver.findElementById(parsingString);
        try{
            if (elementName.isDisplayed()){
                return true;
            }else {
                return false;
            }
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return false;
    }



}
