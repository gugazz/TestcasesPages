package week4day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver/chrome/driver","/Driver.chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//button[contains(text(),'✕')]").click();
		WebElement element = driver.findElementByXPath("//span[contains(text(),'Electronics')]");
		WebElement subelement = driver.findElementByXPath("//span[contains(text(),'OPPO')]");
		Actions builder= new Actions(driver);
		builder.moveToElement(element).pause(4000).click(subelement).build().perform();
		builder.moveToElement(element).perform();


	}

}
