package tek.dragons.capston.base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import tek.capston.dragons.utilites.CommonUtility;

public class BaseUtility extends CommonUtility {

	@Before
	public void setupTests() {
		super.setupBrowser();
	}
	
	@After
	public void closeTests(Scenario scenario)  {
		//we need to write our code to check and see if scenario is failed,
		//use takeScreenShot method from commonUtility class to take a screenshot for you 
		
		//it should take a screenshot and attach it to our test report
		if(scenario.isFailed()) {
			byte[] screenshot = takeScreenShotAsBytes();
			scenario.attach(screenshot, "image/png", scenario.getName() + " scenario failed");
		}
		
		super.quitBrowser();
	}
}
