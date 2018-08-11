package pageswithcucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdmethods.AnnotationsClass;

public class MyLeadsPage extends AnnotationsClass {
	
	public MyLeadsPage()
	{
		
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(linkText="Create Lead")
	WebElement CreateLeadlink;
	
	@And ("click on the create lead button")
	public CreateLeadPage clickCreateLead()
	{
		click(CreateLeadlink);
		return new CreateLeadPage();
		
		
	}
	@FindBy(linkText="Find Leads")
	WebElement eleFindLeads;
	@And ("click the Findleads button")

	public FindLeadsPage  clickFindLeadLink()
	{
		click(eleFindLeads);
		return new FindLeadsPage();		
	}

	@FindBy(linkText="Merge Leads")
	WebElement eleMergeLeads;
	
	public MergeLeadsPage  clickMergeLeadLink()
	{
		click(eleFindLeads);
		return new MergeLeadsPage();
	}
		
	
	}

	
	


