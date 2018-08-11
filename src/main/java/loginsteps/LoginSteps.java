package loginsteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	public RemoteWebDriver driver;
	@Given("Open the Browser")
	public void LaunchBrowser()
	{
		System.setProperty("Webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();

	}
	@And("Maximize the window")
	public void maximizeWindow()
	{
		driver.manage().window().maximize();
	}
	@And("Load the URL")
		public void loadURL()
		{
			driver.get("http://leaftaps.com/opentaps");
	}
	@And ("Set the Timeout")
	public void timeOut()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@And ("Enter the Username as (.*)")
	public void enterusername(String username)
	{
		driver.findElementById("username").sendKeys(username);
	}
	@And("Enter the password as (.*)")
	public void enterpassword(String pwd)
	{
		driver.findElementById("password").sendKeys(pwd);

	}
	@When ("Click on the Login Button")
	public void loginbutton()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@Then ("Verify the Login is successfull")
	public void successfullogin()
	{
		String title=driver.getTitle();
		if(title.equalsIgnoreCase(title))
		{
			System.out.println("Login is successfull");
		}
		else
		{
			System.out.println("Login is not successfull");
		}
	}
	@Given ("click on the crmsfa link")
	public void crmsfalink()
	{
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@And ("Click on the Leadsssss button")
	public void leadslinkclick()
	{
		driver.findElementByLinkText("Leads").click();

	}
	@And ("Click on the Create Lead buttonnnn")
	public void createleadlink()
	{
		driver.findElementByLinkText("Create Lead").click();

	}
	@And ("Enter the company nammme as (.*)")
	public void entrcompnaynme(String cnmae)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(cnmae);

	}
	@And ("Enter the first nammme as(.*)")
	public void firstname(String fname)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);

	}
	@And ("Enter the last nammme as(.*)")
	public void lastnameenter(String lname)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);

	}
	@When("clickkkk on the create lead button")
	public void createleadbutton()
	{
		driver.findElementByName("submitButton").click();

	}
	@Then ("verifyyyy the first name as(.*)")
	public void firstnameverify(String data)
	{
		String cname=driver.findElementById("viewLead_companyName_sp").getText();
		if(cname.equalsIgnoreCase(data))
		{
			System.out.println("Expected company");
		}
		else
		{
			System.out.println("Unexcepted company");
		}

	}
}




