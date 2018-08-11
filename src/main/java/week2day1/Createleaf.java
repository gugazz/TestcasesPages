package week2day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Createleaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ChromeOptions obj2=new ChromeOptions();
obj2.setHeadless(false);
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver(obj2);
	driver.get("http://leaftaps.com/opentaps");
	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Create Lead").click();
	List <WebElement> dropdown=driver.findElementsByTagName("select");
int numberofDropdowns=dropdown.size();
System.out.println(""+numberofDropdowns);
	driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
	driver.findElementById("createLeadForm_firstName").sendKeys("Gugapriya");
	driver.findElementById("createLeadForm_lastName").sendKeys("Ramasamy");
WebElement industry=driver.findElementById("createLeadForm_industryEnumId");
Select obj=new Select(industry);//for selecting the in-build classes of drop-down
List<WebElement> variable =obj.getOptions();//List<webElement> is the type of webelement
for(WebElement list:variable)//list is the variable name to store all the values which we are entering which are stored in variable
{
	System.out.println(""+list.getText());
}
obj.selectByVisibleText("Insurance");
String selectedvalue=obj.getFirstSelectedOption().getText();

System.out.println("Running done in background");
System.out.println(selectedvalue);
driver.findElementByName("submitButton").click();

driver.findElementByXPath("//button [contains (text(),'Find Leads')]").click();
driver.findElementByXPath("//div [@class='x-grid3-cell-inner x-grid3-col-partyId/ a");
driver.findElementByXPath("//img[@alt=Lookup");	
		

}
}
