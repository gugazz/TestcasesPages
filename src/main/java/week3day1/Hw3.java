package week3day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw3 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver/chrome/Driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html" );
		
int  totaliframes=driver.findElements(By.tagName("iframe")).size();
System.out.println("Total iframes in the center"+totaliframes);

WebElement eastframe=driver.findElementByXPath("//div[@class='ui-layout-east ui-layout-pane ui-layout-pane-east']");
driver.findElementByXPath("//button[contains(text(),'Close Me')]").click();
System.out.println("switched");

WebElement westframe=driver.findElementByXPath("//div[@class='ui-layout-west ui-layout-pane ui-layout-pane-west']");
driver.findElementByXPath("//button[contains(text(),'Close Me')]").click();
System.out.println("switched");

WebElement centreframes=driver.findElement(By.xpath("//iframe[@id='childIframe']"));
driver.switchTo().frame(centreframes);	
driver.findElementByXPath("//button[contains(text(),'Close Me')]").click();
driver.switchTo().defaultContent();
System.out.println("switched");

}
}

