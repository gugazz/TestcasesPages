package pageswithcucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdmethods.AnnotationsClass;


public class MyHomePage extends AnnotationsClass {


	public MyHomePage()
	{
		
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(linkText="Leads")
	WebElement Leadslink;
	
	@And ("Clickss on the Leads button")
	public MyLeadsPage  clickLeads()
	{
		click(Leadslink);
		return new MyLeadsPage();
		
		
	}
	
	

}
