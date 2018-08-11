package pageswithcucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdmethods.AnnotationsClass;


public class DeleteLeadPage extends AnnotationsClass
{
	public DeleteLeadPage()

	{
		PageFactory.initElements(driver,this);
}

public DeleteLeadPage duplicatettitleverify(String data)
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
	
	
	