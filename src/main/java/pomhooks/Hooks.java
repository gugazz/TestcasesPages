package pomhooks;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdmethods.SeMethods;

public class Hooks  extends SeMethods{
	
	
	String url="http://leaftaps.com/opentaps";
	String uname="DemoSalesManager";
	String pwd="crmsfa";
	String assignAuthor="gugapriya";
	String assignCategory="@createlead";
	String iteration="creating a lead";
	@Before
	public void beFore(Scenario sc)
	{
		beginResult();//calling the methods to integrate with cucumber from semethods and reporter class
		startTest(sc.getId(),sc.getName());
		startTestIteration(iteration,assignAuthor,assignCategory);
	
		startApp("chrome", url);
		WebElement eleUserName = locateElement("id","username");
		type(eleUserName, uname);
		WebElement elePassword = locateElement("id","password");
		type(elePassword, pwd);
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement crmsfa = locateElement("link","CRM/SFA");
		click(crmsfa);

		
	}
	@After
	public  void afTer(Scenario sc)
	{
		endResult();
			}


}
