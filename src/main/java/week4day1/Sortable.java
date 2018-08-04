package week4day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/");
		driver.findElementByXPath("//a[contains(text(),'Sortable')]").click();
		WebElement eleframe  = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(eleframe);
		WebElement item1 = driver.findElementByXPath("//ul[@id='sortable']//li[1]");
       WebElement item2 = driver.findElementByXPath("//ul[@id='sortable']//li[4]");
       int y = item2.getLocation().getY();
        Actions builder = new Actions(driver);
        builder.dragAndDropBy(item1, 0, y).perform();

	}

}
