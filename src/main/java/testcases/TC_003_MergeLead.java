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
		excelFileName = "MergeLead_1";
		testCasesName = "TC_003_MergeLead";
		testCasesDesc = "New lead Creation";
		category = "smoke";
		authorname="laks";
		iteration = "Leads";
	}

	@Test(dataProvider="fetchdata")
	public void mergeLead(String fromName, String toName ) throws InterruptedException {
		
	
			new MyHomePage()
			.clickLeads()
			.clickMergeLeadLink()
			.clickIcon1()
			.enterFirstName("a")
			.clickfindleadsButton()
			.firstresultantleadlinktext()
			.firstresultantleadlink()
			.clickIcon2()
			.enterFirstName("b")
			.clickfindleadsButton()
			.firstresultantleadlink();
		
		new MergeLeadsPage()
		.clickmergebutton()
		.switchtoalert();
		new FindLeadsPage();
	
		
			
		
		
		
		
	}
}
