package tek.dragons.capston.pages;

public class POMFactory {
	
	private HomePage homePage;
	private LoginPage loginPage;
	private AccountPage accountPage;
	private OrderPage orderPage;
	public POMFactory() {
		this.homePage = new HomePage();
		this.loginPage = new LoginPage();
		this.accountPage = new AccountPage();
		this.orderPage = new OrderPage();
	}
	public HomePage getHomePage() {
		return this.homePage;
		
	}
	public LoginPage getLoginPage() {
		return this.loginPage;
	}
	public AccountPage getAccountPage() {
		return this.accountPage;
	}
	public OrderPage orderPage() {
		return this.orderPage;
	}
}
