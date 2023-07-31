package Runner;

import org.junit.After;
import org.junit.Before;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ExtentManager;
import utilities.ExtentTestManager;

@CucumberOptions(features = { "src/test/java/iis_features/AccuralDeal_609.feature" }, 
				dryRun = !true,// dryRun = false //to check compilation errors
				glue = "stepdefinitions",
				// monochrome=false, //to make steps in color
				plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
							"rerun:ReRunScenarios/FailedReRun.txt" }
				,tags = "@128348"
				

)
public class TestApplication extends AbstractTestNGCucumberTests {
	/*
	 * .
	 * 
	 * @Override
	 *
	 * @DataProvider(parallel = true) public Object[][] scenarios() { return
	 * super.scenarios(); }
	 */

	@Before
	public void beforeExecution() {
		System.out.println("*** Test Execution started ***");
	}

	@After
	public void afterExecution() {
		System.out.println("*** Test Execution Finished ***");
		ExtentTestManager.endTest();
		ExtentManager.getInstance().flush();
	}

}