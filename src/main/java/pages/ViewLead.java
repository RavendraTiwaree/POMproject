package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{

	ViewLead (){
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "viewLead_firstName_sp")
	private WebElement eleFname ;
	
	public ViewLead verifyFname (String data) {
		
		verifyExactText(eleFname, data);
		return this;
	}

	@FindBy(how = How.XPATH, using = "(//span[@class ='requiredField'])[1]")
	private WebElement eleCompany ;
	
	public ViewLead verifyCompanyName (String data) {
		verifyPartialText(eleCompany, data);
		return this;
		
		
	}
	@FindBy (how = How.XPATH, using = "//a [text () ='Edit']")
	private WebElement eleedit;
	
	public Opentaps clickEdit () {
		
		click(eleedit);
		return  new Opentaps ();
	}
	
	
}
