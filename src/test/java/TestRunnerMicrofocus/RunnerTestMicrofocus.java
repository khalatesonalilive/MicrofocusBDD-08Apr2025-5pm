package TestRunnerMicrofocus;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = { "AllFeatureFiles" }, glue = { "MicrofocusSteps" }, dryRun = false, monochrome = true, plugin = {
				"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }

)

public class RunnerTestMicrofocus extends AbstractTestNGCucumberTests {

}
