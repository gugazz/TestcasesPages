package week3day2;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdmethods.SeMethods;
public class FrameworkCreateLead extends SeMethods {
	@Test (invocationCount=2)
	// TODO Auto-generated method stub
	public void createLead() {
	startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id","username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement crmsfa = locateElement("link","CRM/SFA");
		click(crmsfa);
		WebElement createLead = locateElement("link","Create Lead");
		click(createLead);
		WebElement company = locateElement("id","createLeadForm_companyName");
		type(company,"TCS");
		WebElement firstName = locateElement("id","createLeadForm_firstName");
		type(firstName,"Guga");
		WebElement lastName = locateElement("id","createLeadForm_lastName");
		type(lastName,"Priya");
		WebElement firstNamelocal=locateElement("id","createLeadForm_firstNameLocal");
		type(firstNamelocal,"Puppy");
		WebElement LasttNamelocal=locateElement("id","createLeadForm_lastNameLocal");
		type(LasttNamelocal,"googoo");
		WebElement salutation=locateElement("id","createLeadForm_personalTitle");
		type(salutation,"Ms");
		WebElement src = locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingText(src,"Cold Call");
		WebElement profiletitle=locateElement("id","createLeadForm_generalProfTitle");
		type(profiletitle,"ProjectCreateLead");
		WebElement annaualrevenue=locateElement("id","createLeadForm_annualRevenue");
		type(annaualrevenue,"1000000");
		WebElement industryDD = locateElement("id","createLeadForm_industryEnumId");
		selectDropDownUsingIndex(industryDD,7);
		WebElement ownershipDD = locateElement("id","createLeadForm_ownershipEnumId");
		selectDropDownUsingValue(ownershipDD,"OWN_LLC_LLP");

		WebElement sicCode=locateElement("id","createLeadForm_sicCode");
		type(sicCode,"5656");
		WebElement description=locateElement("id","createLeadForm_description");
		type(description,"Creation of Lead");
		WebElement importantNote=locateElement("id","createLeadForm_importantNote");
		type(importantNote,"testcases are important");
		WebElement PhoneCountryCode=locateElement("id","createLeadForm_primaryPhoneCountryCode");
		type(PhoneCountryCode,"91");
		WebElement AreaCode=locateElement("id","createLeadForm_primaryPhoneAreaCode");
		type(AreaCode,"641026");
		WebElement primaryPhoneExtension=locateElement("id","createLeadForm_primaryPhoneExtension");
		type(primaryPhoneExtension,"0422");
		WebElement annualrevenue=locateElement("id","createLeadForm_departmentName");
		type(annualrevenue,"Automation");
		WebElement currencyDD=locateElement("id","createLeadForm_currencyUomId");
		selectDropDownUsingIndex(currencyDD,2);	
		WebElement employeescount=locateElement("id","createLeadForm_numberEmployees");
		type(employeescount,"10");
		WebElement tickersymbol=locateElement("id","createLeadForm_tickerSymbol");
		type(tickersymbol,"GOO:BOO");
		WebElement PhoneAskForName=locateElement("id","createLeadForm_primaryPhoneAskForName");
		type(PhoneAskForName,"BOO BOO");
		WebElement primaryWebUrl=locateElement("id","createLeadForm_primaryWebUrl");
		type(primaryWebUrl,"www.testleaf.com");
		WebElement generalAddress1=locateElement("id","createLeadForm_generalAddress1");
		type(generalAddress1,"2/98,ireland");
		WebElement generalCity=locateElement("id","createLeadForm_generalCity");
		type(generalCity,"Coimbatore");
		WebElement StateProvinceGeoId=locateElement("id","createLeadForm_generalStateProvinceGeoId");
		type(StateProvinceGeoId,"TamilNadu");
		WebElement generalPostalCode=locateElement("id","createLeadForm_generalPostalCode");
		type(generalPostalCode,"641026");
		WebElement marketingCampaignId=locateElement("id","createLeadForm_marketingCampaignId");
		type(marketingCampaignId,"Tradecentre");
		WebElement primaryPhoneNumber=locateElement("id","createLeadForm_primaryPhoneNumber");
		type(primaryPhoneNumber,"7010324762");
		WebElement primaryEmail=locateElement("id","createLeadForm_primaryEmail");
		type(primaryEmail,"rgugapriya@ymail.com");
		WebElement CreateLead1=locateElement("xpath","//input[@name='submitButton']");
		click(CreateLead1);

		WebElement viewleadverification=locateElement("id","viewLead_firstName_sp");
		verifyExactText(viewleadverification,"Guga");




	}


}


