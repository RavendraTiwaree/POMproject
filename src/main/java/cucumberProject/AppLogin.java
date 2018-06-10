package cucumberProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppLogin {

	
	public RemoteWebDriver driver  ;
	
	@Given ("Launch the Browser")
	public void LaunchBrowser () {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
	}
	
	@And ("Enter the Login Id (.*)")
	public void username(String uname) {
		driver.findElementById("username").sendKeys(uname);
		}
	
	@And ("Enter the Password (.*)")
	public void password(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
	}
	
	@When ("Click on Login Button")
	public void LoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
		}
	@Then ("Landing page successfully")
	public void LandinPage() {
		System.out.println("User Logged in Successfully");
		}	
	
}
