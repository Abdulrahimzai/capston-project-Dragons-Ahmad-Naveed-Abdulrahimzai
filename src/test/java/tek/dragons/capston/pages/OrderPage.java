package tek.dragons.capston.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capston.dragons.base.CapstonBaseSetup;

public class OrderPage extends CapstonBaseSetup {
	
	public OrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
   @FindBy(id = "search")
   public WebElement allDepartmentDropdown;
   
   @FindBy(id ="searchInput")
   public WebElement searchInput;
   
   @FindBy(id = "searchBtn")
   public WebElement searchButton;
   
   @FindBy(xpath = "//img[@alt='Kasa Outdoor Smart Plug']")
   public WebElement KasaOutdoorSmartPlugItem;
   
   @FindBy(xpath = "//select[@class='product__select']//option[@value='5']")
   public WebElement productQuantity;
   
   @FindBy(xpath = "//span[text()='Add to Cart']")
   public WebElement addToCartButton;
   
   @FindBy(xpath = "//span[@id='cartQuantity']")
   public WebElement cartQuantityField;
   
   @FindBy(xpath = "//p[@class='products__name']")
   public WebElement itemApexLegends;
   
   @FindBy(id = "cartQuantity")
   public WebElement cartOption;
   
   @FindBy(id = "proceedBtn")
   public WebElement proceedButton;
   @FindBy(id = "placeOrderBtn")
   public WebElement placeOrderButton;
   @FindBy(xpath = "//p[text()='Order Placed, Thanks']")
   public WebElement orderPlacedSuccessMesg;
   
   @FindBy(id = "orderLink")
   public WebElement orderLink;
   @FindBy(xpath = "/html/body/div/div[1]/div[1]/div[3]/div/div/div[2]/div/div[2]/div/p[2]")
   public WebElement firstOrder;
   @FindBy(xpath = "//button[text()='Return Items']")
   public WebElement returnButton;
   @FindBy(id = "reasonInput")
   public WebElement reasonInput;
   @FindBy(id = "dropOffInput")
   public WebElement dropOffInput;
   @FindBy(xpath = "//button[@id='orderSubmitBtn']")
   public WebElement returnSubmitBtt;
   @FindBy(xpath = "//p[text()='Return was successfull']")
   public WebElement returnSuccessMesg;
   
   @FindBy(id ="cancelBtn")
   public WebElement cancelOrder;
   @FindBy(id = "reasonInput")
   public WebElement cancelReasonInput;
   @FindBy(id ="orderSubmitBtn")
   public WebElement cancelSubmitButt;
   @FindBy(xpath = "//p[text()='Your Order Has Been Cancelled']")
   public WebElement orderCancelMessg;
   
   @FindBy(id = "reviewBtn")
   public WebElement reviewButton;
   @FindBy(id = "headlineInput")
   public WebElement headlineInput;
   @FindBy(id = "descriptionInput")
   public WebElement descriptionInput;
   @FindBy(id = "reviewSubmitBtn")
   public WebElement reviewSubmitButton;
   @FindBy(xpath = "//div[text()='Your review was added successfully']")
   public WebElement reviewSuccessMassg;
   
   
   
   
}
