package pageswithcucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdmethods.AnnotationsClass;

public class EditLeadPage extends AnnotationsClass {
	public EditLeadPage()

	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="updateLeadForm_companyName")
	WebElement updatecompanyname;
	@FindBy(xpath="//input[@value='Update']")
	WebElement updatebutton;
	
	@And ("update the company name as (.*)")
	public EditLeadPage editcompanyname(String editcompanyname)
	{
		type(updatecompanyname,editcompanyname);
		return this;
	}
	@And ("click on the update button")
public ViewLeadPage clickupdatebutton()
{
	click(updatebutton);
	return new ViewLeadPage();
}




}



