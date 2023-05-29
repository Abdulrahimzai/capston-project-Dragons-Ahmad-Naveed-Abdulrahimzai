package tek.capston.dragons.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeBrowser implements CapstonBrowser {
	
	@Override
	public WebDriver openBrowser(String url) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get(url);
		
		return driver;

}
}