package pageswithcucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdmethods.AnnotationsClass;

public class FindLeadsPage extends AnnotationsClass {

	public FindLeadsPage()
	{

		PageFactory.initElements(driver,this);

	}
	@FindBy(xpath="//input[@name='id']")
	WebElement firstnameenter;
	
	@FindBy(xpath="(//input[@name='firstName'])[3]")
	WebElement idnameenter;
	
	@FindBy(xpath="//button[text()='Find Leads']")
	WebElement Findleadslink;
	
	@FindBy(xpath="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	WebElement firstresultantlead;

	@And ("Enter the first name as (.*)")
	public FindLeadsPage enterFirstLeadID(String data)
	{
		type(idnameenter,data);
		return this;
	}
	public FindLeadsPage enterFirstName(String data)
	{
		type(firstnameenter, data);
		return this;
	}
	@FindBy(xpath="//span[contains(text(),'Email')]")
	WebElement EnteremailID;
	@And ("Enter the Email ID as (.*)")
	public FindLeadsPage EnteremailID(String data)
	{
		type(EnteremailID,data);
		return this;

	}
	@FindBy(xpath="")
	WebElement enterphonenum;
	public FindLeadsPage enterphonenumber(String data)
	{
		type(enterphonenum,data);
		return this;
	}
	
	@And ("Click the Findleads button")
	public FindLeadsPage clickfindleadsButton() throws InterruptedException
	{
		click(Findleadslink);
		Thread.sleep(2000);
		return this;
	}
	public ViewLeadPage firstresultantleadlink()
	{
		click(firstresultantlead);
		return new ViewLeadPage();
	}
	@And ("Click on the first resultant lead")
	public FindLeadsPage FLfirstresultantlead()
	{
		click(firstresultantlead);
		return new FindLeadsPage();
	}

	public FindLeadsPage FLfirstresultantleadlinktext()
	{
		text = firstresultantlead.getText();
		System.out.println(text);
		return this;
	}
	public FindLeadsPage entercapturedFLid()
	{
		type(firstresultantlead, text);
		return this;
	}
	@FindBy(xpath="//div[contains(text(),'No records to display')]")
	WebElement norecordmsg;
	public FindLeadsPage verifyerrmessage(String errmessage)
	{
		verifyPartialText(norecordmsg, errmessage);
		return this;
	}
	public void enterdeletebutton() {
		// TODO Auto-generated method stub

	}
}

