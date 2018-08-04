package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdmethods.AnnotationsClass;

public class MergeLeadsPage extends AnnotationsClass {
	
	public MergeLeadsPage()
	{
		
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	 @FindBy(xpath="//img[@alt='Lookup']")
	 WebElement MergeIcon1;
		
		public FindLeadsPopup  clickIcon1()
		{
			click(MergeIcon1);
			switchToWindow(1);
			return new FindLeadsPopup()	;
		}
	
		 @FindBy(xpath="(//img[@alt='Lookup'])[2]")
		 WebElement MergeIcon2;
			
			public FindLeadsPopup  clickIcon2()
			{
				click(MergeIcon2);
				switchToWindow(1);
				return new FindLeadsPopup()	;
			}
		@FindBy(xpath="//a[@class='buttonDangerous")
		WebElement mergebutton;
		 public MergeLeadsPage clickmergebutton()
		 {
			 click(mergebutton);
			 return this;
		 }
		 
		 public MergeLeadsPage switchtoalert() {
			 acceptAlert();
			 return this;
		 }
		 


	
	

}
