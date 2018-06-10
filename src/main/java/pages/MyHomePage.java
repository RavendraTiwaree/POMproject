package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyHomePage  extends ProjectMethods {


	//Constructor for the class
	MyHomePage (){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (how = How.XPATH, using = "(//a [text () = 'Leads'])[1]")
	private WebElement eleClickLeads ;

	
	public MyLeads ClickLeads  (){
		click (eleClickLeads);
		return new MyLeads ();
	}
}
