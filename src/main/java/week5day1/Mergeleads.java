package week5day1;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdmethods.AnnotationsClass;


public class Mergeleads extends AnnotationsClass {
//	@Test(enabled=true)
	@Test(groups="Regression")
	//@Test//(priority=1)

public void mergeLead() {

		    WebElement LeadsLink = locateElement("link","Leads");
			click(LeadsLink);
			WebElement mergeLead=locateElement("link","Merge Leads");
			click(mergeLead);
			WebElement icon1=locateElement("xpath","//div[contains(text(),'Merge Leads')]/following::a[1]");
			click(icon1);
			switchToWindow(1);
			System.out.println("switched");
			WebElement LeadId=locateElement("xpath", "//input[@name='id']");
			type(LeadId,"10392");
			WebElement findleadssearch=locateElement("xpath","//button[contains(text(),'Find Leads')]");
			click(findleadssearch);
			WebElement firstlead=locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']");
			click(firstlead);
			switchToWindow(0);
			WebElement icon2=locateElement("xpath","//div[contains(text(),'Merge Leads')]/following::a[2]");
			click(icon2);
			switchToWindow(1);
			WebElement LeadId2=locateElement("xpath", "//input[@name='id']");
			type(LeadId2,"10392");
			WebElement findleadssearch2=locateElement("xpath","//button[contains(text(),'Find Leads')]");
			click(findleadssearch2);
			WebElement firstlead2=locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']");
			click(firstlead2);
			switchToWindow(0);
			WebElement mergebutton=locateElement("xpath","//a[@class='buttonDangerous']");
			clickwithoutsnap(mergebutton);
			acceptAlert();
			WebElement findleadclick=locateElement("xpath","//a[contains(text(),'Find Leads')]");
			click(findleadclick);
			WebElement FindLead=locateElement ("xpath","//*[contains(text(),'Lead ID:')]//following::*[@type='text' and @name='id']");
			type(FindLead,"90876");
			WebElement findleadsclick=locateElement("xpath","//button[contains(text(),'Find Leads')]");
			click(findleadsclick);
			WebElement errormessage=locateElement("xpath","//div[contains(text(),'No records to display')]");
			verifyExactText(errormessage,"No records to display");
			
			


			
			
			
			

			
			
			
			

	}

}
