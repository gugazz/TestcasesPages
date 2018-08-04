package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.MyHomePage;
import pages.ViewLeadPage;
import wdmethods.AnnotationsClass;

public class TC_002_EditLead extends AnnotationsClass {
	@BeforeTest
	public void setValue()
	{
		excelFileName = "EditLead_1";
		testCasesName = "TC_002_EditLead";
		testCasesDesc = "Edit existing lead";
		category = "sanity";
		authorname="laks";
		iteration = "Leads";
	}

	@Test(dataProvider="fetchdata")
	public void editLead(String fname, String verifyTitle, String editname ) throws InterruptedException {
		new MyHomePage()
		.clickLeads()
		.clickFindLeadLink()
		.enterFirstName(fname)
		.clickfindleadsButton()
		.firstresultantleadlink()
		.verfyTitleOfPage(verifyTitle)
		.clickedit()
		.editcompanyname(editname)
		.clickupdatebutton()
		.verifyupdatedcompanyname(editname);





	}
}
