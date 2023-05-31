@Regression
Feature: account

  Background: 
    Given User is on retail website home page
    Then User verify retail website title
    And User click on sign in option
    When User enter email 'Dragonsjoh@gmail.com' and password 'Dragonsakm2e@'
    And User click on login button
    Then user should be logged into Account
    When User click on Account option

 # @updateProfile
  Scenario: Verify User can update Profile Information
    And User update Name 'jamil' and Phon '2214209033'
    And User click on Update button
    Then user profile information should be updated

  #@addpaymentmethod
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 4677562232233717 | john       |              10 |           2027 |          564 |
    And User click on Add your card button
    Then a success message should be displayed 'Payment Method added successfully'

  #@editepaymentmethod
  Scenario: Verify User can edit Debit or Credit card
    And User click on visa card
    And User click on Edit option of card section
    And user edit card number '4477113006438833' name 'Abdula' security code '380'
    And user edit month and year
    And user click on Update Your Card button
    Then an update message should be displayed 'Payment Method updated Successfully'

  #@removePaymentmethod
  Scenario: Verify User can remove Debit or Credit card
    And User click on visa or credit card
    And User click on remove option of card section
    Then payment details should be removed

 # @address
  Scenario: Verify User can add an Address
    And User click on Add address option
    And user fill new address form with below information 'Pull' and '7689604344' and '8188 Edison Ave' and '09' and 'sacramento' and '95842'
    And User click on Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’

  #@editAddress
  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And user fill new address form with below information fullname 'Jeff' phone '9165771845' street '2381 some street' apt '02' city 'San francisco' and '34532'
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’

  #@removeAddress
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
