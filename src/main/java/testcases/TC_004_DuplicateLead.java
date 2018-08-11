package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdmethods.AnnotationsClass;

public class TC_004_DuplicateLead extends AnnotationsClass {
	@BeforeTest
	public void setValue()
	{
		excelFileName = "DuplicateLead_1";
		testCasesName = "TC_004_DuplicateLead";
		testCasesDesc = "DuplicationofLead";
		category = "smoke";
		authorname="laks";
		iteration = "Leads";
	}

	@Test(dataProvider="fetchdata")
	public void duplicateLead(String email,String data,String title,String updatedcname) throws InterruptedException {

		new MyHomePage()
		.clickLeads()
		.clickFindLeadLink()
		.EnteremailID(email)
		.clickfindleadsButton()
		.firstresultantleadlink()
		.captureFirstname(data)
		.enterduplicatebutton()
		.duplicatettitleverify(title)
		.createleadbutton()
		.verifyduplicatedcompanyname(updatedcname)
		.closecurrentwindow();
	}









}

