package pageswithcucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdmethods.AnnotationsClass;

public class ViewLeadPage extends AnnotationsClass {

	public ViewLeadPage()
	{

		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="viewLead_firstName_sp")
	WebElement CreateLeadlink;

	public CreateLeadPage verifyFirstname(String data)
	{
		verifyPartialText(CreateLeadlink, data);
		return new CreateLeadPage();
	}
	@And ("verify the title of the page")
	public ViewLeadPage verfyTitleOfPage() throws InterruptedException {
		verifyTitle(null);
		Thread.sleep(3000);
		return this;
	}

	@FindBy(linkText="Edit")
	WebElement Editlink;
	@And("click on the edit butotn")
	public EditLeadPage clickedit()
	{
		click(Editlink);
		return new EditLeadPage();
	}

	@FindBy(id="viewLead_companyName_sp")
	WebElement verifycname;

	@And ("verify the updated company name as (.*)")
	public ViewLeadPage verifyupdatedcompanyname(String datacname)
	{
		verifyPartialText(verifycname,datacname);
		return this;
	}
	@FindBy(linkText="Duplicate Lead")
	WebElement duplicatebutton;
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
	public ViewLeadPage verifyduplicatedcompanyname(String dataupdatedcname)
	{
		verifyExactText(verifycompanynameafterduplication, dataupdatedcname);
		return this;
	}
	@And("close the browser")
	public  ViewLeadPage closecurrentwindow()
	{
		driver.close();
		return this;
	}

}
