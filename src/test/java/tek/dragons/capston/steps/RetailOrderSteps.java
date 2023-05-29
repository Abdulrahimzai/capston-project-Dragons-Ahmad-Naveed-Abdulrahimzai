package tek.dragons.capston.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;

import tek.capston.dragons.utilites.CommonUtility;
import tek.dragons.capston.pages.POMFactory;

public class RetailOrderSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	

	@Then("User click on item Apex Legends")
	public void userClickOnItemApexLegends() {
		click(factory.orderPage().itemApexLegends);
		logger.info("user clicked on item");
		slowDown();
	}

	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.orderPage().cartOption);
		logger.info("user clicked on cart option");
		slowDown();
	}

	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.orderPage().proceedButton);
		logger.info("user clicked on proced button");
		slowDown();
	}

	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		waitTillPresence(factory.orderPage().placeOrderButton);
		click(factory.orderPage().placeOrderButton);

	}

	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String string) {
		waitTillPresence(factory.orderPage().orderPlacedSuccessMesg);
		Assert.assertTrue(factory.orderPage().orderPlacedSuccessMesg.isDisplayed());
		logger.info("order placed success massage displayed ");
		slowDown();
	}
	@Then("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.orderPage().orderLink);
		logger.info("user clicked on order section");
	}


	@Then("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		waitTillPresence(factory.orderPage().returnButton);
		click(factory.orderPage().returnButton);
		
	}
	
	@Then("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String itemDamaged) {
		selectByVisibleText(factory.orderPage().reasonInput, itemDamaged);
		logger.info("user select return reason");
	}

	@Then("User select the drop off service {string}")
	public void userSelectTheDropOffService(String FedixService) {
		selectByVisibleText(factory.orderPage().dropOffInput, FedixService);
		logger.info("user select the Fedix as return service");
	}

	@Then("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().returnSubmitBtt);
		
	}

	@Then("a return message should be displayed {string}")
	public void aReturnMessageShouldBeDisplayed(String returnSuccessMessg) {
		waitTillPresence(factory.orderPage().returnSuccessMesg);
		Assert.assertEquals(returnSuccessMessg, factory.orderPage().returnSuccessMesg.getText());
		logger.info("order return success massage displayed ");
	}
	@Then("User change the category to {string}")
	public void userChangeTheCategoryTo(String smartHome) {
		selectByVisibleText(factory.orderPage().allDepartmentDropdown, smartHome);
		logger.info(smartHome + "smart home option is selected");

	}

	@Then("User search for an item {string}")
	public void userSearchForAnItem(String kasaOutdoorSmartPlug) {
		sendText(factory.orderPage().searchInput, kasaOutdoorSmartPlug);
		logger.info(kasaOutdoorSmartPlug + " item name was entered");
	}

	@Then("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.orderPage().searchButton);
		logger.info("user clicked on search button");
	}

	@Then("User click on item")
	public void userClickOnItem() {

		click(factory.orderPage().KasaOutdoorSmartPlugItem);
		logger.info("user click on item");
	}

	@Then("User select quantity")
	public void userSelectQuantity() {

		click(factory.orderPage().productQuantity);
		logger.info("user change the product quantity");
	}

	@Then("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.orderPage().addToCartButton);
	}

	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String itemQuantity) {
		Assert.assertEquals(itemQuantity, factory.orderPage().cartQuantityField.getText());
		logger.info(itemQuantity + "quantity was displayed in the cart");
		slowDown();
	}
	

	@Then("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		waitTillPresence(factory.orderPage().cancelOrder);
		click(factory.orderPage().cancelOrder);
		logger.info("user clicked on cancel order");
	}

	@Then("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String wrongItem) {
		selectByVisibleText(factory.orderPage().cancelReasonInput, wrongItem);
		logger.info("user select the reson for cancel ");
	}

	@Then("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().cancelSubmitButt);
		logger.info("user click on cancel submit button");
	}

	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String cancelSuccessMessg) {
		waitTillPresence(factory.orderPage().orderCancelMessg);
		Assert.assertEquals(cancelSuccessMessg, factory.orderPage().orderCancelMessg.getText());
		logger.info("order cancel success massage displayed ");
	}

	@Then("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.orderPage().reviewButton);
		logger.info("user click on review button");
	}

	@Then("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String headline, String discription) {
		sendText(factory.orderPage().headlineInput, headline);
		sendText(factory.orderPage().descriptionInput, discription);
		logger.info("user enter review");
		slowDown();
	}

	@Then("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderPage().reviewSubmitButton);
		logger.info("user click on review submit button");
	}

	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String reviewsuSuccessMesg) {
		waitTillPresence(factory.orderPage().reviewSuccessMassg);
		Assert.assertEquals(reviewsuSuccessMesg, factory.orderPage().reviewSuccessMassg.getText());
		logger.info("order cancel success massage displayed ");
	}
}
