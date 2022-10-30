package com.runner;

import com.cucumber.listener.ExtentProperties;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.BeforeClass;

@RunWith(Cucumber.class)
@CucumberOptions(
      features = {"src/test/java/com/features"},
      glue= {"StepDefinition"},
      plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumberreports/WirelessOffice_UI_Report.html"},
      format = {"pretty", "html:ExtentReport/TestReport6.html"},
      monochrome=true,
      //tags={"@caLogin,@paLogin"}
      tags={"@paLogin"}
)

public class TestRunner extends AbstractTestNGCucumberTests {

    // Need to remove since we are not using this report
    @BeforeClass
    public static void writeExtentReport() {
        ExtentProperties extentProperties = ExtentProperties.INSTANCE;
        extentProperties.setReportPath("target/cucumberreports/TestReport6.html");
    }

}
