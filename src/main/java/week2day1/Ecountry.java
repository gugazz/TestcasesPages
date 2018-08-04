package week2day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ecountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver/exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
WebElement countryname=driver.findElementById("userRegistrationForm:countries");
Select selectobj=new Select(countryname);
List <WebElement> totalDDs=selectobj.getOptions();
for(WebElement eachDD:totalDDs)
{
	if(eachDD.getText().startsWith("E"));
	{
		int i=0;
		if(i<=2)
		{
		System.out.println(eachDD.getText());
		eachDD.click();
		}
	}
	
}
	}

}
