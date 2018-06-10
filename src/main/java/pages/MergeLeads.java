package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeads extends ProjectMethods{
	
		MergeLeads (){
			PageFactory.initElements(driver, this);
		}
	
		@FindBy (how = How.XPATH, using = "(//img[@alt='Lookup'])[1]")
		private WebElement eleFromLead ;
		
		public LookUpWindowFromLead clickFromLeadButton () {
			click(eleFromLead);
			switchToWindow(1);
			return  new LookUpWindowFromLead ();
		}
		
		/*@FindBy (how = How.XPATH, using = "//button[contains(text(),'Find Leads')]")
		private WebElement eleFindLeads ;*/
		
		@FindBy (how = How.XPATH, using = "(//img[@alt='Lookup'])[2]")
		private WebElement eleToLead ;
		
		public LookUpWindowToLead clickToLeadButton () {
			click(eleFromLead);
			switchToWindow(1);
			return  new LookUpWindowToLead ();
		}
		
		
}
