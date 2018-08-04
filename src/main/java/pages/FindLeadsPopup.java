package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdmethods.AnnotationsClass;

public class FindLeadsPopup extends AnnotationsClass {
	
	public FindLeadsPopup()
	{
		
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//input[@name='firstName']")
	WebElement firstnameenter;
	@FindBy(xpath="//button[text()='Find Leads']")
	WebElement Findleadslink;
	@FindBy(xpath="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	WebElement firstresultantlead;
	public FindLeadsPopup enterFirstName(String data)
	{
		type(firstnameenter, data);
		return this;
	}


	public FindLeadsPopup clickfindleadsButton() throws InterruptedException
	{
		click(Findleadslink);
		Thread.sleep(2000);
		return this;
	}
	public FindLeadsPopup firstresultantleadlinktext()
	{
		text = firstresultantlead.getText();
		System.out.println(text);
		return this;
	}
	public MergeLeadsPage firstresultantleadlink()
	{
		click(firstresultantlead);
		switchToWindow(0);
		return new MergeLeadsPage();
	}
	
	

}
