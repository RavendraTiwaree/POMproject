package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_MergeLead extends ProjectMethods {

	
	
	@BeforeTest
	public void SetData () {
		testCaseName="TC005_MergeLead";
		testDescription="Merge Lead in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Raven";
		browserName="chrome";
		dataSheetName="TC005";	
	}
	
	
	@Test (dataProvider = "fetchData")
	
	public void MergeLead (String UserName,  String psw, String Fname) throws InterruptedException
	{
		
	new LoginPage ()
	.enterUserName(UserName)
	.enterPassword(psw)
	.clickLogIn()
	.clickCRM()
	.ClickLeads()
	.clickMergeLeads ()
	.clickFromLeadButton()
	.enterFname(Fname)
	.clickFLeads()
	.clickfirstlink();
	
	
	
	
		
		
		
		
		
		
		
		
	}
}
