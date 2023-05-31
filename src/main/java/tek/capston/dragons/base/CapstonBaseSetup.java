package tek.capston.dragons.base;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import tek.capston.dragons.config.CapstonBrowser;
import tek.capston.dragons.config.ChromeBrowser;
import tek.capston.dragons.config.ChromeHeadless;
import tek.capston.dragons.config.EdgeBrowser;
import tek.capston.dragons.config.FireFoxBrowser;
import tek.capston.dragons.utilites.ReadYamlFiles;


public class CapstonBaseSetup{
private static WebDriver WebDriver;
private final ReadYamlFiles environmentVariables;
public static Logger logger;

public CapstonBaseSetup(){
	
	String filePath =System.getProperty("user.dir")+"/src/main/resources/env_config.yml";
	String log4jPath = System.getProperty("user.dir")+"/src/main/resources/log4j.properties";
	
	try {
		environmentVariables =ReadYamlFiles.getInstance(filePath);
	} catch (Exception e) {
		System.out.println("Failed to load enf_config property. Check your filePath:");
		throw new RuntimeException("failed to load env_dpmfog fo;e: "+ e.getMessage());
	}
	logger = logger.getLogger("logger file");
	PropertyConfigurator.configure(log4jPath);
	
}
public WebDriver getDriver() {
	
	return WebDriver;
	
}
public void setupBrowser() {
	HashMap uiProperty = environmentVariables.getYamlProperty("ui");
	String url = uiProperty.get("url").toString().toLowerCase();
	CapstonBrowser browser;
	switch(uiProperty.get("browser").toString().toLowerCase()) {
	case "chrome":
		if((boolean) uiProperty.get("headless")) {
			browser = new ChromeHeadless();
		}else {
			browser = new ChromeBrowser();
		}
		WebDriver = browser.openBrowser(url);
		break;
	case "firefox":
		browser = new FireFoxBrowser();
		WebDriver = browser.openBrowser(url);
		break;
	case "edge":
		browser = new EdgeBrowser();
		WebDriver = browser.openBrowser(url);
		break;
	default:
		throw new RuntimeException("Browser name in config file does not match any of the cases");
	}
	WebDriver.manage().deleteAllCookies();
	WebDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	WebDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
}

public void quitBrowser() {
	if(WebDriver != null)
	WebDriver.quit();
}

}

