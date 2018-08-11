package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdmethods.AnnotationsClass;

public class ViewLeadPage extends AnnotationsClass {

	public ViewLeadPage()
	{

		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="viewLead_firstName_sp")
	WebElement verifyfirstname;
	@Then("verifys the first name as (.*)")
	public  ViewLeadPage captureFirstname(String data)
	{
		verifyPartialText(verifyfirstname, data);
	String capturedname=verifyfirstname.getText();
		return this;
	}
	public ViewLeadPage verfyTitleOfPage(String data) throws InterruptedException {
		verifyTitle(data);
		Thread.sleep(3000);
		return this;
	}
	
	@FindBy(linkText="Edit")
	WebElement Editlink;
	public EditLeadPage clickedit()
	{
		click(Editlink);
		return new EditLeadPage();
	}
	@FindBy(id="viewLead_companyName_sp")
	WebElement verifycname;
	public ViewLeadPage verifyupdatedcompanyname(String datacname)
	{
		verifyPartialText(verifycname,datacname);
		return this;
	}


@FindBy(linkText="Duplicate Lead")
WebElement duplicatebutton;
@And ("click on the duplicate lead button")

public DuplicateLeadPage enterduplicatebutton()
{
	click(duplicatebutton);
	return new DuplicateLeadPage();
}
@FindBy(linkText="xpath\",\"//a[@class='subMenuButtonDangerous']")
WebElement deleteleadbutton;
public DeleteLeadPage enterdeletebutton()
{
	click(deleteleadbutton);
	return new DeleteLeadPage();
	
}
@FindBy(xpath="//span[@id='viewLead_companyName_sp']")
WebElement verifycompanynameafterduplication;
@When ("capture the first name in duplicate page")

public ViewLeadPage verifyduplicatedcompanyname(String dataupdatedcname)
{
	verifyExactText(verifycompanynameafterduplication, dataupdatedcname);
	return this;
}
public  ViewLeadPage closecurrentwindow()
{
	driver.close();
	return this;
}

}
