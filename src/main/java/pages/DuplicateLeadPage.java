package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdmethods.AnnotationsClass;


public class DuplicateLeadPage extends AnnotationsClass
{
	public DuplicateLeadPage()

	{
		PageFactory.initElements(driver,this);
}

public DuplicateLeadPage duplicatettitleverify(String data)
{
	verifyTitle(data);
	return this;
}
@FindBy(xpath="//*[@value='Create Lead']")
WebElement Createleadbuttoninduplicatepage;
public ViewLeadPage createleadbutton()
{
	click(Createleadbuttoninduplicatepage);
	return new ViewLeadPage();
	
}






}
	
	
	