package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods {

	
	FindLeads (){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (how = How.XPATH, using = "(//a [@class ='linktext'])[4]")
	private WebElement FirstLink ;
	
	public ViewLead clickFirstlink () {
		click(FirstLink);
		return  new ViewLead();
	}
	
	
}
