package tek.dragons.capston.steps;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capston.dragons.utilites.CommonUtility;
import tek.dragons.capston.pages.POMFactory;

public class RetailAccountSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.getLoginPage().accountLink);
		logger.info("user clicked on AccountOption ");
	}
	@When("User update Name {string} and Phon {string}")
	public void userUpdateNameAndPhon(String nameValue, String phoneValue) {
		clearTextUsingSendKeys(factory.getAccountPage().nameInput);
		sendText(factory.getAccountPage().nameInput,nameValue);
		clearTextUsingSendKeys(factory.getAccountPage().personalPhoneInput);
		sendText(factory.getAccountPage().personalPhoneInput, phoneValue);
		logger.info("user updated the name and the phone value");
		
	}
	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.getAccountPage().personalUpdateBtn);
		logger.info("user clicked on update button");
	    
	}
	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
	    waitTillPresence(factory.getAccountPage().personalInfoUpdatSuccessMessage);
	    Assert.assertTrue(factory.getAccountPage().personalInfoUpdatSuccessMessage.isDisplayed());
	    logger.info("user profile information is updated ");
	}
	
	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.getAccountPage().PaymentMethod);
		logger.info("user clicked on payment method link");
	    
	}
	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<Map<String, String>> paymentInfo = dataTable.asMaps(String.class, String.class);
	   sendText(factory.getAccountPage().cardNumberField, paymentInfo.get(0).get("cardNumber"));
	   sendText(factory.getAccountPage().nameOnCardInput, paymentInfo.get(0).get("nameOnCard"));
	   selectByVisibleText(factory.getAccountPage().expirationMonthInput, paymentInfo.get(0).get("expirationMonth"));
	   selectByVisibleText(factory.getAccountPage().expirationYearInput, paymentInfo.get(0).get("expirationYear"));
	   sendText(factory.getAccountPage().securityCodeField, paymentInfo.get(0).get("securityCode"));
	   logger.info("user inter payment information");
	}
	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.getAccountPage().addYourCardBttn);
		logger.info("user click on add card Button");
	}
	@Then("a success message should be displayed {string}")
	public void aSuccessMessageShouldBeDisplayed(String addingCardSuccessMesg) {
		waitTillPresence(factory.getAccountPage().addingCardSuccessMes);
		Assert.assertTrue(addingCardSuccessMesg, factory.getAccountPage().addingCardSuccessMes.isDisplayed());
		logger.info("user add payment method");
	}

	@When("User click on visa card")
	public void userClickOnVisaCard() {
		click(factory.getAccountPage().visaCard);
	   logger.info("user click on visa card");
	}
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		slowDown();
		click(factory.getAccountPage().editCardInfo);
		logger.info("user clicke on edit button");
	}
	@When("user edit card number {string} name {string} security code {string}")
	public void userEditCardNumberNameSecurityCode(String cardNum, String nameOnCard, String securityCode) {
		clearTextUsingSendKeys(factory.getAccountPage().cardNumberField);
		logger.info("data cleared successfully");
		sendText(factory.getAccountPage().cardNumberField, cardNum);
		logger.info("user enter the card number");
		clearTextUsingSendKeys(factory.getAccountPage().cardNameField);
		logger.info("user enter the card number");
		sendText(factory.getAccountPage().cardNameField, nameOnCard);
		logger.info("user enter name");
		clearTextUsingSendKeys(factory.getAccountPage().securityCodeField);
		logger.info("data cleared successfully");
		sendText(factory.getAccountPage().securityCodeField, securityCode);
		logger.info("user enter security code");
	}
	@When("user edit month and year")
	public void userEditMonthAndYear() {
		click(factory.getAccountPage().monthField);
		logger.info("user changed the card expiration month");
		click(factory.getAccountPage().yearInputField);
		logger.info("user changed the card expiration year");
	 
	}
	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.getAccountPage().updateYourCard);
		logger.info("user clicked on add your card button");
	    
	}
	@Then("an update message should be displayed {string}")
	public void anUpdateMessageShouldBeDisplayed(String cardUpdateMesg) {
		waitTillPresence(factory.getAccountPage().updateMessageSuccessfully);
		Assert.assertTrue(cardUpdateMesg, factory.getAccountPage().updateMessageSuccessfully.isDisplayed());
		logger.info("user Bank information is updated");
	}
	@When("User click on visa or credit card")
	public void userClickOnVisaOrCreditCard() {
		click(factory.getAccountPage().visaCredit);
		   logger.info("user click on visa card");
		   takeScreenShotAsBytes();
	}
	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.getAccountPage().removeBtt);
	    logger.info("user clicked on remove btt");
	    takeScreenShotAsBytes();
	}
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		waitTillPresence(factory.getAccountPage().addDebitorCreditCardIsDisplayed);
		Assert.assertTrue(factory.getAccountPage().addDebitorCreditCardIsDisplayed.isDisplayed());
		logger.info(" add Debit or credit card ia Displayed");
		takeScreenShotAsBytes();
	}
	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
	    click(factory.getAccountPage().addAddress);
	    logger.info("user clicked on add address option");
	}
	@When("user fill new address form with below information {string} and {string} and {string} and {string} and {string} and {string}")
	public void userFillNewAddressFormWithBelowInformationAndAndAndAndAnd(String fullName, String PhoneNumber, String street, String apt, String city, String zipcode) {
	    click(factory.getAccountPage().selectCountry);
	    logger.info("user select country");
	    sendText(factory.getAccountPage().fullNameInput, fullName);
	    logger.info("user enter fullname");
	    sendText(factory.getAccountPage().phoneNumberInput, PhoneNumber);
	    logger.info("user enter phone number");
	    sendText(factory.getAccountPage().streetInput, street);
	    logger.info("user enter street address");
	    sendText(factory.getAccountPage().apartmentInput, apt);
	    logger.info("user aprtment number");
	    sendText(factory.getAccountPage().cityInput, city);
	    logger.info("user enter city");
	    click(factory.getAccountPage().statInput);
	    logger.info("user select state");
	    sendText(factory.getAccountPage().zipCodeInput, zipcode);
	    logger.info("user enter zipcode");
	}
	@When("User click on Add Your Address button")
	public void userClickOnAddYourAddressButton() {
		click(factory.getAccountPage().addressBtn);
		logger.info("user click on add address button ");
	    
	}
	@Then("a message should be displayed ‘Address Added Successfully’")
	public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
		waitTillPresence(factory.getAccountPage().addressSucessMessage);
		Assert.assertTrue(factory.getAccountPage().addressSucessMessage.isDisplayed());
		logger.info("address successfully message is displayed");
		takeScreenShotAsBytes();
	}
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.getAccountPage().addressEditOption);
	}
	@When("user fill new address form with below information fullname {string} phone {string} street {string} apt {string} city {string} and {string}")
	public void userFillNewAddressFormWithBelowInformationFullnamePhoneStreetAptCityAnd(String Name, String phone, String street, String apartment, String city, String zipcode) {
		clearTextUsingSendKeys(factory.getAccountPage().fullNameInput);
		logger.info("data cleared successfully");
		sendText(factory.getAccountPage().fullNameInput,Name);
		logger.info("user enter name");
		clearTextUsingSendKeys(factory.getAccountPage().phoneNumberInput);
		logger.info("data cleared successfully");
		sendText(factory.getAccountPage().phoneNumberInput, phone);
		logger.info("user enter phone number");
		clearTextUsingSendKeys(factory.getAccountPage().streetInput);
		logger.info("data cleared successfully");
		sendText(factory.getAccountPage().streetInput, street);
	    logger.info("user enter street address");
	    clearTextUsingSendKeys(factory.getAccountPage().apartmentInput);
		logger.info("data cleared successfully");
		sendText(factory.getAccountPage().apartmentInput, apartment);
	    logger.info("user enter apprtment number");
	    clearTextUsingSendKeys(factory.getAccountPage().cityInput);
		logger.info("data cleared successfully");
		sendText(factory.getAccountPage().cityInput, city);
	    logger.info("user enter city");
	    clearTextUsingSendKeys(factory.getAccountPage().zipCodeInput);
		logger.info("data cleared successfully");
		sendText(factory.getAccountPage().zipCodeInput, zipcode);
	    logger.info("user enter zipcode address");
		
	}
	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
	    click(factory.getAccountPage().addressUpdateButt);
	    logger.info("user clicked on addess udate button");
	}
	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
		waitTillPresence(factory.getAccountPage().addressUdateSucessMesg);
		Assert.assertTrue(factory.getAccountPage().addressUdateSucessMesg.isDisplayed());
		logger.info("address update successfully message is displayed");
		
	}
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
	    click(factory.getAccountPage().addressRemovebutton);
	    logger.info("user clicked on address remove button");
	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
	    logger.info("address removed successfully");
	}
}