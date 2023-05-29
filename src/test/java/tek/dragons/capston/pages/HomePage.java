package tek.dragons.capston.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capston.dragons.base.CapstonBaseSetup;

public class HomePage extends CapstonBaseSetup {
	
	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	@FindBy(linkText ="TEKSCHOOL")
	public WebElement tekLogo;
	@FindBy(id ="signinLink")
	public WebElement signinBttn;
	@FindBy(id = "newAccountBtn")
	public WebElement newAccountBtn;
	@FindBy(id = "nameInput")
	public WebElement nameField;
	@FindBy(id = "emailInput")
	public WebElement emailInput;
	@FindBy(id = "passwordInput")
	public WebElement passwordInput;
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPasswordInput;
	@FindBy(id = "signupBtn")
	public WebElement signupBtn;
	@FindBy(xpath = "//*[@id=\"accountInformation\"]/div[2]/h1")
	public WebElement yourProfile;
	
	@FindBy(xpath ="//span[text()='All']")
	public WebElement allDepartment;
	@FindBy(xpath ="//span[text()='Electronics']")
	public WebElement electroincDepartment;
	@FindBy(xpath ="//span[text()='Computers']")
	public WebElement computerDepartment;
	@FindBy(xpath= "//span[text()='Smart Home']")
	public WebElement smartHomeDepartment;
	@FindBy(xpath= "//span[text()='Sports']")
	public WebElement sportDepartment;
	@FindBy(xpath= "//span[text()='Automative']")
	public WebElement automativeDepartment;
    
	@FindBy(xpath = "//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBarElements;
	@FindBy(xpath = "//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBarOptionElements;
}
