package cucumberProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadSteps {
	
	public static RemoteWebDriver driver;
	
	@Given("Launch browser")
	public void LaunchBrowser () {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps");
	}
	
	@And("enter the username as (.*)")
	public void username(String uname) {
	driver.findElementById("username").sendKeys(uname);
	}
	
	@And("enter the password as (.*)")
	public void password(String pwd) {
	driver.findElementById("password").sendKeys(pwd);
	driver.findElementByClassName("decorativeSubmit").click();
	}
    
	@And("Click on Crmsfa link")
	public void LeadsPage() {
		driver.findElementByLinkText("CRM/SFA").click();
	    driver.findElementByLinkText("Create Lead").click();
		
	}
   
	@And("enter the CompanyName (.*)")
   public void CompanyName (String Cname) {
    driver.findElementById("createLeadForm_companyName").sendKeys(Cname);
	}
	
	@And ("Enter the FirstName (.*)")
	public void FirstName (String FName) {
    driver.findElementById("createLeadForm_firstName").sendKeys("FName");
	}
	
	@And ("Enter the LastName (.*)")
	public void LastName (String LName) {
    driver.findElementById("createLeadForm_lastName").sendKeys("LName");
   }
   
	@When("Click on createlead button")
   public void CreateLeadButton() {
	   driver.findElementByClassName("smallSubmit").click();
	}
	   @Then("Verify createlead page")
	   public void VerifyCreateLead() {
		   System.out.println("Lead created");
	   }
	   
}
