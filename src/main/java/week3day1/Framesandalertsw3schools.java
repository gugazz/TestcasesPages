package week3day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesandalertsw3schools {

	private static Alert alert;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver/chrome.driver","/Drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
driver.switchTo().frame("iframeResult");
driver.findElementByXPath("//button[contains(text(),'Try it')]").click();
Alert alertobj=driver.switchTo().alert();//switching to alert() using keyword
String welcome=alertobj.getText();
alertobj.sendKeys("Buddies");
alertobj.accept();
System.out.println(welcome);
WebElement welcomer=driver.findElementById("demo");
String welcometext=welcomer.getText();
if(welcometext.contains("Buddies"));
System.out.println("verified");
driver.switchTo().defaultContent();
driver.findElementByXPath("//a[@id='tryhome']").click();
Set<String> setobj=driver.getWindowHandles();//storing the webelements in the list variable
List<String>listobj=new ArrayList<String>();
listobj.addAll(setobj);
driver.switchTo().window(listobj.get(0));
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());
driver.switchTo().window(listobj.get(1));
System.out.println(driver.getTitle());
driver.quit();

	}

}
