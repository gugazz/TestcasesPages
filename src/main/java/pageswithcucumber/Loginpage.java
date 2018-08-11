package pageswithcucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import wdmethods.SeMethods;

public class Loginpage extends SeMethods {
	public Loginpage()
	{
		PageFactory.initElements(driver, this);

	}

	@Given ("Opens the Browser")
	public Loginpage launchhhbrowser (String url)
	{

		startApp("http://leaftaps.com/opentap");
		return this;
	}
	
	private void startApp(String string) {
		// TODO Auto-generated method stub
		
	}

	@FindBy (id="username")
	WebElement uname;

	@And ("Enters the Username as(.*)")
	public Loginpage enterrusername(String username)
	{
		type(uname,username);
		return this;
	}
	@FindBy (id="password")
	WebElement password;
	@And ("Enters the password as(.*)")
	public Loginpage enterrrrpassword(String pwd)
	{
		type(password,pwd);
		return this;
	}
	@FindBy(className="decorativeSubmit")
	WebElement submit;
	@And ("Clicks on the Login Button")
	public Loginpage loginnnbutton()
	{
		click(submit);
		return new Loginpage();
	}

	@And ("Verifys the Login is successfull")
	public void successfullogggin(String title)
	{
		verifyTitle(title);
	}
	@FindBy (linkText="CRM/SFA")
	WebElement crmlink;
	@When ("clicks on the crmsfa link")
	public MyHomePage crmmmsfalink()
	{
		click(crmlink);
		return new MyHomePage();
	}

}
