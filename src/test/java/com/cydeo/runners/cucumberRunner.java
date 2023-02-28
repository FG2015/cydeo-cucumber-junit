package com.cydeo.runners;


import com.cydeo.utilities.BrowserUtils;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.support.ui.Wait;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = "html:target/cucumber_report.html",

        features = "src/test/resources/features",

        glue="com/cydeo/step_definitions",
        dryRun = false
        
)
public class cucumberRunner {


}
