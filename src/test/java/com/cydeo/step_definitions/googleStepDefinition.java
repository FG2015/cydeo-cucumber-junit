package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class googleStepDefinition {

    @When("user is on Google search page")
    public void user_is_on_google_search_page() {

        Driver.getDriver().navigate().to("https://www.google.com");
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String expectedTitle= "Google";
        String actualTitle=  Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
