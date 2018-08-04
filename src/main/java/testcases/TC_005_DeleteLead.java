package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.MyHomePage;
import wdmethods.AnnotationsClass;

public class TC_005_DeleteLead extends AnnotationsClass {
	@BeforeTest
	public void setValue()
	{
		excelFileName = "DuplicateLead_1";
		testCasesName = "TC_005_DeleteLead";
		testCasesDesc = "DeletionofLead";
		category = "smoke";
		authorname="laks";
		iteration = "Leads";
	}

	@Test(dataProvider="fetchdata")
	public void duplicateLead(String phone,String errormsg) throws InterruptedException {
		
		new MyHomePage()
		.clickLeads()
		.clickFindLeadLink()
		.clickfindleadsButton()
		.FLfirstresultantleadlinktext()
		.firstresultantleadlink()
		.enterdeletebutton();
        new MyHomePage()
        .clickLeads()
        .clickFindLeadLink()
        .entercapturedFLid()
        .clickfindleadsButton()
.verifyerrmessage(errormsg)   ;
	}
        
        



	}
		
		
		
		
		
		
		
		


