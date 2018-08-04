package week4day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver/chrome/driver","/Driver.chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com");
		driver.findElementByXPath("//a[contains(text(),'Selectable')]").click();
		WebElement dragframe = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(dragframe);
		WebElement element1=driver.findElementByXPath("//li[contains(text(),'Item 1')]");
		WebElement element4=driver.findElementByXPath("//li[contains(text(),'Item 4')]");
		Actions builder=new Actions(driver);
builder.clickAndHold(element1).release(element4).perform();

		

	}

}
