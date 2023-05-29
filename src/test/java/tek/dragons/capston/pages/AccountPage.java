package tek.dragons.capston.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capston.dragons.base.CapstonBaseSetup;

public class AccountPage extends CapstonBaseSetup {
	
	public AccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
   @FindBy(id = "profileImage")
   public WebElement profileImage;
   @FindBy(id = "nameInput")
   public WebElement nameInput;
   @FindBy(id = "personalPhoneInput")
   public WebElement personalPhoneInput;
   @FindBy(id = "personalUpdateBtn")
   public WebElement personalUpdateBtn;
   @FindBy(xpath = "//div[text() ='Personal Information Updated Successfully']")
   public WebElement personalInfoUpdatSuccessMessage;
   @FindBy(id ="accountLink")
   public WebElement accountButton;
   
   @FindBy(xpath = "//p[text()='Add a payment method']")
   public WebElement PaymentMethod;
   @FindBy(id ="cardNumberInput")
   public WebElement cardNumInput;
   @FindBy(id ="nameOnCardInput")
   public WebElement nameOnCardInput;
   @FindBy(id ="expirationMonthInput")
   public WebElement expirationMonthInput;
   @FindBy(id ="expirationYearInput")
   public WebElement expirationYearInput;
   @FindBy(id ="securityCodeInput")
   public WebElement securityCodeInput;
   @FindBy(id ="paymentSubmitBtn")
   public WebElement addYourCardBttn;
   @FindBy(xpath ="//div[text()='Payment Method added sucessfully']")
   public WebElement addingCardSuccessMes;
   
   @FindBy(id ="accountLink")
   public WebElement accountLink;
   @FindBy(xpath = "/html/body/div/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div[1]/div[2]/p[2]")
   public WebElement visaCard;
   @FindBy(xpath ="/html/body/div/div[1]/div[1]/div[3]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/button[1]")
   public WebElement editCardInfo;
   @FindBy(id ="cardNumberInput")
   public WebElement cardNumberField;
   @FindBy(id ="nameOnCardInput")
   public WebElement cardNameField;
   @FindBy(id ="securityCodeInput")
   public WebElement securityCodeField;
   @FindBy(xpath ="//select[@id='expirationMonthInput']//option[@value='10']")
   public WebElement monthField;
   @FindBy(xpath ="//select[@id='expirationYearInput']//option[@value='2028']")
   public WebElement yearInputField;
   @FindBy(xpath ="//button[text()='Update Your Card']")
   public WebElement updateYourCard;
   @FindBy(xpath ="//div[text()='Payment Method updated Successfully']")
   public WebElement updateMessageSuccessfully;
   
   @FindBy(xpath = "/html/body/div/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div[1]/div[2]/p[2]")
   public WebElement visaCredit;
   @FindBy(xpath ="//button[text()='remove']")
   public WebElement removeBtt;
   @FindBy(xpath = "/html/body/div/div[1]/div[1]/div[3]/div/div[2]/div/div[2]/div/div[2]/p")
   public WebElement addDebitorCreditCardIsDisplayed;
   @FindBy(xpath = "//div[@class='account__address-new']")
   public WebElement addAddress;
   @FindBy(xpath = "//select[@id='countryDropdown']//option[@value='United States']")
   public WebElement selectCountry;
   @FindBy(id ="fullNameInput")
   public WebElement fullNameInput;
   @FindBy(id = "phoneNumberInput")
   public WebElement phoneNumberInput;
   @FindBy(id = "streetInput")
   public WebElement streetInput;
   @FindBy(id = "apartmentInput")
   public WebElement apartmentInput;
   @FindBy(id ="cityInput")
   public WebElement cityInput;
   @FindBy(xpath = "//select[@name='state']//option[@value='California']")
   public WebElement statInput;
   @FindBy(id = "zipCodeInput")
   public WebElement zipCodeInput;
   @FindBy(id = "addressBtn")
   public WebElement addressBtn;
   @FindBy(xpath = "/html/body/div/div[2]/div/div/div[1]/div[2]")
   public WebElement addressSucessMessage;
   @FindBy(xpath = "//div[@class ='account__address-btn-wrapper']//child::button[1]")
   public WebElement addressEditOption;
   @FindBy(id = "addressBtn")
   public WebElement addressUpdateButt;
   @FindBy(xpath ="/html/body/div/div[2]/div/div/div[1]/div[2]")
   public WebElement addressUdateSucessMesg;
   @FindBy(xpath ="//button[text()='Remove']")
   public WebElement addressRemovebutton;
   
   
   
   
}
