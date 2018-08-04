package week2day1;

import java.awt.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testleaflastdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://leafground.com/pages/Dropdown.html");
WebElement DDvalue=driver.findElementById("dropdown3");
Select anyDD=new Select(DDvalue);
int  lastDD=anyDD.getOptions().size();
anyDD.selectByIndex(lastDD-2);
	}

}
