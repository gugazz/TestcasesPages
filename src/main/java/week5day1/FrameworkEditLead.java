package week5day1;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdmethods.AnnotationsClass;


public class FrameworkEditLead  extends AnnotationsClass {
	//@Test(enabled=true)//to disable the TC from running
	//@Test(dependsOnMethods={"week5day1.FrameworkCreateLead.createLead"})//depends on create lead method
@Test//(groups="Sanity" ,dependsOnGroups="smoke")
	//@Test(priority=1)
	//@Test
	public void EditLeads() {
	WebElement Leadslink = locateElement("link","Leads");
	click(Leadslink);
	WebElement FindLeads = locateElement("link","Find Leads");
	click(FindLeads);
	WebElement firstname = locateElement("xpath","//span[contains(text(),'Find by')]/following::input[2]");
	type(firstname,"gugapriya");
	WebElement FindLeadsbutton = locateElement("xpath","//span[contains(text(),'Name and ID')]//following::button[1]");
	click(FindLeadsbutton);
	WebElement firstlead = locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
	click(firstlead);
	//WebElement phonenumber = locateElement("xpath","//input[@name='phoneNumber']");
	//click(phonenumber);
	//span[contains(text(),"Phone")]/following::button[1]
	//WebElement findleads = locateElement("xpath","//span[contains(text(),'Phone')]/following::button[1]");
	//click(findleads);
	WebElement resultingfirstlead = locateElement("xpath","//span[contains(text(),'Phone')]/following::button[1]");
	click(resultingfirstlead);
	verifyTitle("View Lead");
	 WebElement EditLeadslink = locateElement("link","Edit");
		click(EditLeadslink);
		WebElement updatecompanyname = locateElement("id", "updateLeadForm_companyName");
		type(updatecompanyname, "CINDAN");
		WebElement update = locateElement("xpath","//input[@value='Update']");
		click(update);
		WebElement companycheck = locateElement("xpath", "//span[@id='viewLead_companyName_sp']");
		verifyExactText(companycheck,"CINDAN");
		
	}


	
}


