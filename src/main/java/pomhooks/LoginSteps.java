package pomhooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	public RemoteWebDriver driver;
	@Given("Opens the Browser")
	public void LaunchBrowser()
	{
		System.setProperty("Webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();

	}
	@And("Maximizes the window")
	public void maximizeWindow()
	{
		driver.manage().window().maximize();
	}
	
	@And ("Enters the Username as (.*)")
	public void enterusername(String username)
	{
		driver.findElementById("username").sendKeys(username);
	}
	@And("Enters the password as (.*)")
	public void enterpassword(String pwd)
	{
		driver.findElementById("password").sendKeys(pwd);

	}
	@When ("Clicks on the Login Button")
	public void loginbutton()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@Then ("Verifys the Login is successfull")
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
	@Given ("clicks on the crmsfa link")
	public void crmsfalink()
	{
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@And ("Clickss on the Leads button")
	public void leadslinkclick()
	{
		driver.findElementByLinkText("Leads").click();

	}
	@And ("Clicks on the Create Lead button")
	public void createleadlink()
	{
		driver.findElementByLinkText("Create Lead").click();

	}
	@And ("Enters the company name as (.*)")
	public void entrcompnaynme(String cnmae)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(cnmae);

	}
	@And ("Enters the first name as (.*)")
	public void firstname(String fname)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);

	}
	@And ("Enters the last name as (.*)")
	public void lastnameenter(String lname)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);

	}
	@When("clicks on the create lead button")
	public void createleadbutton()
	{
		driver.findElementByName("submitButton").click();

	}
	@Then ("verifys the first name as (.*)")
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




