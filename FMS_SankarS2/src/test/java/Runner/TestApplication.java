package Runner;

import org.junit.After;
import org.junit.Before;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ExtentManager;
import utilities.ExtentTestManager;

@CucumberOptions(features = {"src/test/java/features/WIFAK_Application_608.feature"},
                glue = "stepdefinitions",
                monochrome=true, //to make steps in color
                plugin = { "pretty",
                           "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                           "rerun:ReRunScenarios/FailedReRun.txt"}
//               	,dryRun = true //to check compilation errors
				, tags= "@AT_FM_058"
//               , tags= "@582480_FMSParam or @582480_FMSCore"

)
public class TestApplication extends AbstractTestNGCucumberTests {
	/*.
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