package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Opentaps  extends ProjectMethods{

	
	Opentaps (){
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (how = How.ID, using ="updateLeadForm_companyName")
	private WebElement elemCompanyName ;

	public Opentaps  EditCompany (String data) {
		elemCompanyName.clear();
		type(elemCompanyName, data);
		return this;
	}
	
	@FindBy (how = How.XPATH, using = "(//input[@name = 'submitButton'])[1]")
	private WebElement eleUpdateButton;
	
	public ViewLead clickUpdateButton () {
		
		click(eleUpdateButton);
		return new ViewLead ();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
