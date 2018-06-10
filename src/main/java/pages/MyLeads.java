package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods {

	
	MyLeads (){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//a [text() ='Create Lead']")
	private WebElement clickCreateLead ;
	
	public CreateLead ClickCreateLead () {
		click (clickCreateLead);
		return new CreateLead () ;
	}
	
	
	
	@FindBy (how = How.XPATH, using = "//a [text () ='Find Leads']")
	private WebElement FindLeads ;
	
	public FindLeads clickFindLeads () {
		click(FindLeads);
		return  new FindLeads();
	}
	
	
	@FindBy (how = How.LINK_TEXT, using = "Merge Leads")
	private WebElement eleMergeLeads ;
	
	public MergeLeads clickMergeLeads () {
		
		click(eleMergeLeads);
		return new MergeLeads ();
	}
	
	
	
	
	
	
	
	
	
}
