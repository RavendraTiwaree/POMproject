package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{

	CreateLead (){
		PageFactory.initElements(driver, this);
	}


	@FindBy (how = How.ID, using ="createLeadForm_companyName")
	private WebElement eleCompanyName ;

	public CreateLead EnterCompany (String data) {
		type(eleCompanyName, data);
		return this;
	}


	@FindBy (how = How.ID, using = "createLeadForm_firstName")
	private WebElement eleFname ;

	public CreateLead EnterFname (String data) {
		type(eleFname, data);
		return this;

	}

	@FindBy (how = How.ID, using = "createLeadForm_lastName")
	private WebElement eleLname ;

	public CreateLead EnterLname (String data) {
		type(eleLname, data);
		return this;

	}

	//click on create lead Button
	@FindBy(how= How.CLASS_NAME, using = "smallSubmit")
	private WebElement elebutton;
	
	public ViewLead clickCreateLaedButton () {
		click(elebutton);
		return new ViewLead ();
	}






}
