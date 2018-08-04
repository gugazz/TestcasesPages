package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.MergeLeadsPage;
import pages.MyHomePage;
import wdmethods.AnnotationsClass;

public class TC_003_MergeLead extends AnnotationsClass {
	@BeforeTest
	public void setValue()
	{
		excelFileName = "CreateLead_1";
		testCasesName = "TC_001_CreateLead";
		testCasesDesc = "New lead Creation";
		category = "smoke";
		authorname="laks";
		iteration = "Leads";
	}

	@Test(dataProvider="fetchdata")
	public void createLead(String fromName, String toName, String lname, String phn, String email ) {
		
		try {
			new MyHomePage()
			.clickLeads()
			.clickMergeLeadLink()
			.clickIcon1()
			.enterFirstName(fromName)
			.clickfindleadsButton()
			.firstresultantleadlinktext()
			.firstresultantleadlink()
			.clickIcon2()
			.enterFirstName(toName)
			.clickfindleadsButton()
			.firstresultantleadlink();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new MergeLeadsPage()
		.clickmergebutton()
		.switchtoalert();
		new FindLeadsPage();
	
		
			
		
		
		
		
	}
}
