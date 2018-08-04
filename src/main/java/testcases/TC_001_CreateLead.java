package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdmethods.AnnotationsClass;

public class TC_001_CreateLead extends AnnotationsClass {
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
	public void createLead(String cname, String fname, String lname, String phn, String email ) {
		
		new MyHomePage()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(cname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.enterPhoneNumber(phn)
		.enterMailID(email)
		.clickSubmit()
		.verifyFirstname(fname);
		
	}
}
