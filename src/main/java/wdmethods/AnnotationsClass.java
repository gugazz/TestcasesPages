package wdmethods;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import util.ReadExcel;

public class AnnotationsClass extends SeMethods {
	public String testCasesName, testCasesDesc, iteration, excelFileName;
	public static String text;
	@BeforeSuite
	public void beforeSuite()
	{
		beginResult();
	}
	@BeforeClass
	public void beforeTest() 
	{
		
		startTest(testCasesName,testCasesDesc);
		
	}
	
	
	@Parameters({"url","uname","pwd"})
	@BeforeMethod()
	public void beforeMethod(String url,String uname, String pwd)
	
	{
		startTestIteration(iteration);

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
	
	@DataProvider(name="fetchdata")	
	public Object[][] getData() throws IOException
	{
			ReadExcel excel=new ReadExcel();
			
			return excel.readExcel(excelFileName);
			
		
	}

@AfterMethod//(groups={"smoke","Regression","Sanity"})

public void afterMethod()
{
	closeBrowser();
	endResult();
}
}
