package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class LookUpWindowFromLead extends ProjectMethods {

	
	LookUpWindowFromLead (){
		PageFactory.initElements(driver, this);
	}
	

	@FindBy (how = How.NAME, using = "firstName")
	private WebElement eleFname ;
	
	public LookUpWindowFromLead enterFname (String data) {
		type(eleFname, data);
		return this;
	}

	@FindBy (how = How.XPATH, using = "//button[contains(text(),'Find Leads')]")
	private WebElement eleFindLeads ;
	
	public LookUpWindowFromLead clickFLeads () {
		click(eleFindLeads);
		return this;
	}
	
	@FindBy (how = How.XPATH, using = "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement elefirstlink ;
	
	public MergeLeads clickfirstlink () throws InterruptedException {
		Thread.sleep(2000);
		click(elefirstlink);
		switchToWindow(0);
		return new MergeLeads ();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
