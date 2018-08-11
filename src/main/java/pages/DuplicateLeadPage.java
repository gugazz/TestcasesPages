package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdmethods.AnnotationsClass;


public class DuplicateLeadPage extends AnnotationsClass
{
	public DuplicateLeadPage()

	{
		PageFactory.initElements(driver,this);
}

public DuplicateLeadPage duplicatettitleverify(String title)
{
	verifyTitle(title);
	return this;
}
@FindBy(xpath="//*[@value='Create Lead']")
WebElement Createleadbuttoninduplicatepage;
@And("click on the createleadbutton in the duplicate page")

public ViewLeadPage createleadbutton()
{
	click(Createleadbuttoninduplicatepage);
	return new ViewLeadPage();
	
}






}
	
	
	