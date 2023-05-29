package tek.dragons.capston.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capston.dragons.utilites.CommonUtility;
import tek.dragons.capston.pages.POMFactory;

public class LoginSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	
	
	@Then("User click on sign in option")
	public void userClickOnSignInOption() {
		click(factory.getHomePage().signinBttn);
		logger.info("User clicked on signin button successfully");
	}
	@Then("User click on create new account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.getHomePage().newAccountBtn);
		logger.info("User clicked on create new button successfully");
	}
	@Then("User enter {string} and {string} and {string} and {string}")
	public void userEnterAndAndAnd(String name, String email, String password, String confirmpassword) {
			sendText(factory.getHomePage().nameField, name);
			logger.info(name +" user name was entered successfully");
			sendText(factory.getHomePage().emailInput, email);
			logger.info(email + "email entered successfully");
			sendText(factory.getHomePage().passwordInput, password);
			logger.info("password entered successfully");
			sendText(factory.getHomePage().confirmPasswordInput, confirmpassword);
			logger.info(confirmpassword + " password entered successfully for confirmation");
		}
		@Then("User click on signup button")
		public void userClickOnSignupButton() {
		   	    click(factory.getHomePage().signupBtn);
		   	    logger.info("Signup button was clicked succesfully");
}
		@Then("User see his profile page")
		public void userSeeHisProfilePage() {
		 Assert.assertTrue(factory.getHomePage().yourProfile.isDisplayed());
		  
		}
	}
