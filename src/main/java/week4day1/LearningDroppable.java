package week4day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningDroppable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver/chrome/driver","/Driver.chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com");
		driver.findElementByXPath("//a[contains(text(),'Droppable')]").click();
		WebElement dragframe = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(dragframe);
		WebElement draggingobj=driver.findElementById("draggable");
		WebElement dropppingobj=driver.findElementById("draggable");
		Actions builder=new Actions(driver);
		builder.dragAndDrop(draggingobj,dropppingobj ).perform();
		
		
	
	}

}
