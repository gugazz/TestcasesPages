package week5day1;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdmethods.AnnotationsClass;

public class Frameworkduplicatelead extends AnnotationsClass{
	//@Test(dependsOnMethods= {"week5day1.FrameworkCreateLead.createLead"})//depends on create lead method
	//@Test
	@Test//(groups="Regression")

	public  void duplicatelead() {
		// TODO Auto-generated method stub
	WebElement crmsfa = locateElement("link","CRM/SFA");
    click(crmsfa);
    WebElement Leadlink=locateElement("link","Leads");
    click(Leadlink);
    WebElement FindLeadlink=locateElement("link","Find Leads");
    click(FindLeadlink);
    WebElement emaillink=locateElement("xpath","//span[contains(text(),'Email')]");
    click(emaillink);
    WebElement emailenter=locateElement("xpath","//input[@name='emailAddress']");
    type(emailenter,"rgugapriya@ymail.com");
    
    WebElement findleadslink=locateElement("xpath","//span[contains(text(),'Email')]/following::button[1]");
    click(findleadslink);
    WebElement firstlead = locateElement("xpath","//a[contains(text(),'11544')]");
	click(firstlead);
	WebElement duplicate=locateElement("link","Duplicate Lead");
    click(duplicate);
    verifyTitle("Duplicate Lead");
	WebElement CreateLead1=locateElement("xpath","//*[@value='Create Lead']");
	click(CreateLead1);
	WebElement companycheck = locateElement("xpath", "//span[@id='viewLead_companyName_sp']");
	verifyExactText(companycheck,"TCS");


	}

}
