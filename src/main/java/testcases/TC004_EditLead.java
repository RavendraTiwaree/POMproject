package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods {

	
	@BeforeTest
	public void SetData () {
		testCaseName="TC004_EditLead";
		testDescription="Edit Lead in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Raven";
		browserName="chrome";
		dataSheetName="TC004";	
	}
	
	
	
	@Test (dataProvider = "fetchData")
	public void EditLead ( String UserName, String psw, String Wipro, String Company) {
		
		new LoginPage ()
		.enterUserName(UserName)
		.enterPassword(psw)
		.clickLogIn()
		.clickCRM()
		.ClickLeads()
		.clickFindLeads ()
		.clickFirstlink()
		.clickEdit()
		.EditCompany(Wipro)
		.clickUpdateButton()
		.verifyCompanyName(Company); //Verify Text Issue
		
		
		
	}
		
		
		
		
		
	
}
