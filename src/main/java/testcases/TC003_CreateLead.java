package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods {


	@BeforeTest
	public void SetData () {
		testCaseName="TC003_CreateLead";
		testDescription="Create Lead and verify the First Name in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Raven";
		browserName="chrome";
		dataSheetName="TC003";	
	}


	@Test (dataProvider="fetchData")
	public void CreateLead (String uName,String pwd, 
			String Company, String Fname, String Lname, String VFname) {

		new LoginPage()
		
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRM()
		.ClickLeads()
		.ClickCreateLead()
		.EnterCompany(Company)
		.EnterFname(Fname)
		.EnterLname(Lname)
		.clickCreateLaedButton()
		.verifyFname(VFname);


	}





}
