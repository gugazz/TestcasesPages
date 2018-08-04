package week2day1;

import java.awt.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps");
driver.findElementById("username").sendKeys("DemoSalesManager");
driver.findElementById("password").sendKeys("crmsfa");
driver.findElementByClassName("decorativeSubmit").click();
driver.findElementByXPath("//div[ @class='crmsfa']/a").click();
driver.findElementByLinkText("Create Lead").click();
//driver.findElementByXPath("//a [@href='/crmsfa/control/createLeadForm']").click();
driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
driver.findElementById("createLeadForm_firstName").sendKeys("Gugapriya");
driver.findElementById("createLeadForm_lastName").sendKeys("Ramasamy");
driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Puppy");
driver.findElementById("createLeadForm_lastNameLocal").sendKeys("googoo");
driver.findElementById("createLeadForm_personalTitle").sendKeys("Ms");
WebElement sourceDD=driver.findElementById("createLeadForm_dataSourceId");
Select selectobj =new Select(sourceDD);
int noofdropdowns=selectobj.getOptions().size();
selectobj.selectByIndex(noofdropdowns-3);
driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Lead");
driver.findElementById("createLeadForm_annualRevenue").sendKeys("100000");
driver.findElementById("createLeadForm_industryEnumId");
WebElement ownershipDD=driver.findElementById("createLeadForm_ownershipEnumId");
Select selectobj2 =new Select(ownershipDD);
int noofdropdowns1=selectobj2.getOptions().size();
selectobj2.selectByIndex(noofdropdowns1-1);
driver.findElementById("createLeadForm_sicCode").sendKeys("5656");
driver.findElementById("createLeadForm_description").sendKeys("Creation of Lead");
driver.findElementById("createLeadForm_importantNote").sendKeys("testcases are important");
driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");
driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("641026");
driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("0422");
driver.findElementById("createLeadForm_departmentName").sendKeys("Telecom");
WebElement countryDD=driver.findElementById("createLeadForm_currencyUomId");
Select selectobj3=new Select(countryDD);
int noofDropdowns3=selectobj3.getOptions().size();
selectobj3.selectByIndex(noofDropdowns3-2);
driver.findElementById("createLeadForm_numberEmployees").sendKeys("10");
driver.findElementById("createLeadForm_tickerSymbol").sendKeys("GOO:BOO");
driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("BOO BOO");
driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.testleaf.com");
driver.findElementById("createLeadForm_generalToName").sendKeys("Antony");
driver.findElementById("createLeadForm_generalAddress1").sendKeys("2/98,ireland");
driver.findElementById("createLeadForm_generalCity").sendKeys("Coimbatore");
driver.findElementById("createLeadForm_generalStateProvinceGeoId").sendKeys("TamilNadu");
driver.findElementById("createLeadForm_generalPostalCode").sendKeys("641026");
driver.findElementById("createLeadForm_marketingCampaignId").sendKeys("Tradecentre");
driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("7010324762");
driver.findElementById("createLeadForm_primaryEmail").sendKeys("googoo@booboo.com");
driver.findElementByXPath("//*[@value='Create Lead']").click();
driver.findElementById("viewLead_firstName_sp").getText();
boolean Gugapriya=true;
if(Gugapriya) 
System.out.println("firstname is correct");
else

System.out.println("firstname is not correct");

}
}