package tek.dragons.capston.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capston.dragons.base.CapstonBaseSetup;

public class LoginPage extends CapstonBaseSetup {
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(xpath = "//input[@id='email']")
	public WebElement emailInput;
	@FindBy(id = "password")
	public WebElement passwordInput;
	@FindBy(id ="loginBtn")
	public WebElement loginBtn;
	@FindBy(id = "logoutBtn")
	public WebElement logoutBtn;
	@FindBy(id = "orderLink")	
	public WebElement orderLink;
	@FindBy(id = "accountLink")
	public WebElement accountLink;
	

}
