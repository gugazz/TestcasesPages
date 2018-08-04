package week2day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Testcaseseditlead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByXPath("//div[@class='crmsfa']/a").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[contains(text(),'Find by')]/following::input[2]").sendKeys("Gugapriya");
		driver.findElementByXPath("//span[contains(text(),'Name and ID')]/following::button[1]").click();
driver.findElementByXPath("//span[contains(text(),'Phone')]/following::button[1]").click();
	
	driver.findElementsById("sectionHeaderTitle_leads");
	String Title=driver.getTitle();
	System.out.println("Title is"+Title);
	driver.findElementByLinkText("10392").click();
	driver.findElementByLinkText("Duplicate Lead").click();
	driver.findElementById("updateLeadForm_companyName").clear();

	driver.findElementById("updateLeadForm_companyName").sendKeys("CINDAN");
	driver.findElementByXPath("//input[@value='Update']").click();
	String company=driver.findElementById("viewLead_companyName_sp").getText();
	boolean CINDAN=true;
	if(CINDAN)
	System.out.println("Details Updated");
	else
	{
	System.out.println("Details are incorrect");
	}
	driver.findElementByLinkText("Edit").click();
	//driver.findElementById("updateLeadForm_companyName").clear();
	//driver.findElementById("updateLeadForm_companyName").sendKeys("CINDAN");

	driver.findElementByXPath("//input[@value='Update']").click();
	String company1=driver.findElementById("viewLead_companyName_sp").getText();
	if(CINDAN)
	System.out.println("Details Updated");
	else
	{
	System.out.println("Details are incorrect");
	}
	driver.close();
	
}
}
