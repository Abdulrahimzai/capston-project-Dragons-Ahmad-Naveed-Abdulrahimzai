package tek.dragons.capston.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.dragons.capston.pages.POMFactory;

public class HomeSteps extends tek.capston.dragons.utilites.CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	@Then("User verify retail website title")
	public void userVerifyRetailWebsiteTitle() {
		String expectedTitle = "React App";
		String actualTitle = getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		logger.info("Expected and Actual Page Title are same" + actualTitle);
	    
	}
	@Given("User is on retail website home page")
	public void userIsOnRetailWebsiteHomePage() {
	    Assert.assertTrue(factory.getHomePage().tekLogo.isDisplayed());
	    logger.info("Tekschool logo is present");
	}

	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String emailValue, String passwordValue) {
	   sendText(factory.getLoginPage().emailInput, emailValue);
	 logger.info("email was sent successfully");
	   sendText(factory.getLoginPage().passwordInput, passwordValue);
	   logger.info("password was sent successfully");
	}
	@When("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.getLoginPage().loginBtn);
		logger.info("login button was clicked successfully");
	  
	}
	@Then("user should be logged into Account")
	public void userShouldBeLoggedIntoAccount() {
		waitTillPresence(factory.getLoginPage().logoutBtn);
		Assert.assertTrue(isElementDisplayed(factory.getLoginPage().accountLink));
		Assert.assertTrue(isElementDisplayed(factory.getLoginPage().orderLink));
		logger.info("user logged in into account");
	   
}
	
	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.getHomePage().allDepartment);
		logger.info("user clicked on all Department");
	}
	@Then("below options are present in Shop by Department sidebar {string},{string},{string},{string},{string}")
	public void belowOptionsArePresentInShopByDepartmentSidebar(String electronics, String computer, String smarthome, String sport, String automotive) {
		waitTillPresence(factory.getHomePage().electroincDepartment);
		Assert.assertEquals(electronics, factory.getHomePage().electroincDepartment.getText());
		logger.info("electonic department is validated");
		waitTillPresence(factory.getHomePage().computerDepartment);
		Assert.assertEquals(computer, factory.getHomePage().computerDepartment.getText());
		logger.info("computer department is validated");
		waitTillPresence(factory.getHomePage().smartHomeDepartment);
		Assert.assertEquals(smarthome, factory.getHomePage().smartHomeDepartment.getText());
		logger.info("smart home department is validated");
		waitTillPresence(factory.getHomePage().sportDepartment);
		Assert.assertEquals(sport, factory.getHomePage().sportDepartment.getText());
		logger.info("sport department is validated");
		waitTillPresence(factory.getHomePage().automativeDepartment);
		Assert.assertEquals(automotive, factory.getHomePage().automativeDepartment.getText());
		logger.info("automotive department is validated");
	}
	@When("User on {string}")
	public void userOn(String department) {
	List<WebElement> sideBarOptions = factory.getHomePage().sideBarElements;
	for (WebElement option : sideBarOptions) {
//Temporary solution
		String el = option.getText();
		if (el.equals(department)) {
			click(option);
			try {
				logger.info("User clicked on " + el + " sidebar option");
			} catch (StaleElementReferenceException e) {

			}
			break;
		}
	}

}

@Then("below options are present in department")
public void belowOptionsArePresentInDepartment(DataTable dataTable) {
	List<List<String>> expectedDepartmentOptions = dataTable.asLists(String.class);
	List<WebElement> actualDepartmentOptions = factory.getHomePage().sideBarOptionElements;

	for (int i = 0; i < expectedDepartmentOptions.get(0).size(); i++) {
		for (WebElement dept : actualDepartmentOptions) {
			if (dept.getText().equals(expectedDepartmentOptions.get(0).get(i))) {
				Assert.assertTrue(isElementDisplayed(dept));
				logger.info("Department " + dept.getText() + " is present");
			}

		}
	}
}
}