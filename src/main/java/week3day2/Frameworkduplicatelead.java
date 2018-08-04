package week3day2;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdmethods.SeMethods;

public class Frameworkduplicatelead extends SeMethods{
@Test
	public  void duplicatelead() {
		// TODO Auto-generated method stub
	startApp("chrome","http://leaftaps.com/opentaps");
	WebElement eleUserName = locateElement("id", "username");
	type(eleUserName, "DemoSalesManager");
	WebElement elePassword = locateElement("id","password");
	type(elePassword, "crmsfa");
	WebElement eleLogin = locateElement("class","decorativeSubmit");
	click(eleLogin);
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
	closeBrowser();

	}

}
