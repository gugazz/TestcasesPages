package week3day1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shanmuga {
	
	

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty ("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
			driver.findElementByXPath("//div[@class='ui-layout-west ui-layout-pane ui-layout-pane-west']//p[1]").click();		
			WebElement frameEle = driver.findElementById("childIframe");
			driver.switchTo().frame(frameEle);
			driver.findElementByXPath("//div[@class='ui-layout-west ui-layout-pane ui-layout-pane-west']//p").click();
			driver.findElementByXPath("//div[@class='ui-layout-east ui-layout-pane ui-layout-pane-east']/p").click();
			driver.switchTo().defaultContent();
			driver.findElementByXPath("//div[@class='ui-layout-east ui-layout-pane ui-layout-pane-east']/p").click();
			//driver.close();
			
			
		}

	
	
	
}
