package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class BrowserUtils {
    public static void sleep(int second) {

        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }
    }


    public static void switchWindowAndVerify( String expectedURL) {

        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();
        for (String each : allWindowHandles) {
            Driver.getDriver().switchTo().window(each);


            System.out.println("current URL:" + Driver.getDriver().getCurrentUrl());
            if (Driver.getDriver().getCurrentUrl().contains(expectedURL)) {
                break;

            }
        }
    }
}
