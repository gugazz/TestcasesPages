package week3day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.jcommander.Strings;

public class Hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("Webdriver/chrome/driver","/Driver.chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
//String windowhandle=driver.getWindowHandle();
//System.out.println(driver.getCurrentUrl());
 driver.findElementByXPath("//a[contains(text(),'Contact Us')]").click();
 driver.findElementByXPath("//a[contains(text(),'Compatible Browser')]").click();
Set<String> setobj=driver.getWindowHandles();//accessing and getting the window handler(32 digit alphanumeric)
List<String>listobj=new ArrayList<String>();//creating list since the get methods are missing in the Set method
listobj.addAll(setobj);//adding all the elements to listobj from setobj 
driver.switchTo().window(listobj.get(0));
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());
driver.close();
//Set setobj1=driver.getWindowHandles();//accessing and getting the window handler(32 digit alphanumeric)
//List<String>listobj1=new ArrayList<String>();//creating list since the get methods are missing in the Set method
//listobj.addAll(setobj1);//adding all the elements to listobj from setobj 
driver.switchTo().window(listobj.get(1));
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());
driver.close();

driver.switchTo().window(listobj.get(2));
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());

//river.switchTo().window(listobj.get(3));
//System.out.println(driver.getCurrentUrl());
	//driver.switchTo().window(windowhandle);
	//System.out.println(driver.getCurrentUrl());

	}
//
}
