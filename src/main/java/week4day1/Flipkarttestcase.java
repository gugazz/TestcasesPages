package week4day1;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Flipkarttestcase extends wdmethods.SeMethods {
	@Test
	public void flipkart(){
		startApp("chrome","https://www.flipkart.com/");
		WebElement close=locateElement("xpath","//button[contains(text(),'✕')]");
		click(close);
		WebElement electronics=locateElement("xpath","//*[contains(text(),'TVs & Appliances')]");
		WebElement samsung=locateElement("xpath","//*[@title='Samsung']//following::*[@title='Samsung']");
		mouseover(electronics,samsung);
		WebElement minimum=locateElement("xpath","//div[@id='container']//select[@class='fPjUPw']");
		selectDropDownUsingText(minimum,"25000");
		WebElement maximum=locateElement("xpath","//select[@class='fPjUPw'][2]");
		selectDropDownUsingText(maximum,"60000");
		WebElement screensize = locateElement("xpath", "//*[contains(text(),'Screen Size')]");
		click(screensize);
		WebElement screensize1=locateElement("xpath","//div[contains(text(),'48 - 55')]");
		click(screensize1);
		WebElement firstproduct=locateElement("xpath","	//div[@class='_3wU53n'][1]");
		click(firstproduct);
		switchToWindow(1);
		WebElement compare1=locateElement("xpath","//div[@class='_1p7h2j']");
		click(compare1);
		closeBrowser();
		switchToWindow(0);
		WebElement secondproduct=locateElement("xpath","//div[@class='_3wU53n']//following::div[@class='_3wU53n'][1]");
		click(secondproduct);
		switchToWindow(1);
		WebElement compare2=locateElement("xpath","//div[@class='_3wU53n'][1]");
		click(compare2);
		WebElement comparebutton=locateElement("xpath","//span[contains(text(),'COMPARE')]");
		click(comparebutton);
		WebElement getprice=locateElement("xpath","//div[@class='_1vC4OE'][1]");
		String firstprice = getText(getprice);
		String price1 = firstprice.replace("₹","").replace("", "");
		int value1=Integer.parseInt(price1);
		WebElement getprice2=locateElement("xpath","//div[@class='_1vC4OE'][2]");
		String secondprice = getText(getprice2);
		String price2 = secondprice.replace(",","").replace("", "");
		int value2=Integer.parseInt(price2);

		if(value1<value2)
		{
			System.out.println("the highest value is "+value1);
		}
		else
		{
			System.out.println("the highest value is "+value2);
		}


	}

}


// TODO Auto-generated method stub




