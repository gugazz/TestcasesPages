package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdmethods.AnnotationsClass;


public class CreateLeadPage extends AnnotationsClass
{
	public CreateLeadPage()

	{
		PageFactory.initElements(driver,this);
}

@FindBy(id="createLeadForm_companyName")
WebElement cName ;

@FindBy(id="createLeadForm_firstName")
WebElement fName ;	

@FindBy(id="createLeadForm_lastName")
WebElement lName ;

@FindBy(id="createLeadForm_primaryPhoneNumber")
WebElement phnumber ;

@FindBy(id="createLeadForm_primaryEmail")
WebElement email ;

@FindBy(xpath = "//ul[@class='errorList']")
WebElement eleerrmsg ;


@FindBy(className="smallSubmit")
WebElement eleSubmit;


public CreateLeadPage enterCompanyName(String CompanyName)
{
	type(cName,CompanyName);
	return this;
}


public CreateLeadPage enterFirstName(String FirstName)
{
	type(fName,FirstName);
	return this;
}
public CreateLeadPage enterLastName(String LastName)
{
	type(lName, LastName);
	return this;
}
public CreateLeadPage enterPhoneNumber(String PhoneNumber)
{
	type(phnumber, PhoneNumber);
	return this;
}

public CreateLeadPage enterMailID(String MailID)
{
	type(email, MailID);
	return this;
}
public ViewLeadPage clickSubmit()
{
	click(eleSubmit);
	return new ViewLeadPage();
}



public CreateLeadPage verifyErrMsg(String errmsg)
{
	verifyExactText(eleerrmsg, errmsg);
	return this;
}

public CreateLeadPage verifyfname(String Firstname)
{
	verifyExactText(fName, Firstname);
	return this;
}


}
	
	
	