package week3day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver/chrome/Driver","./Drivers/webdriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");  
		int count=0;

int parentframes=driver.findElements(By.tagName("iframe")).size();
System.out.println("total parents frame is"+parentframes);
	List<WebElement> iframescount=driver.findElementsByTagName("iframe");
			for(WebElement children:iframescount)
		{
			driver.switchTo().frame(children);
			List <WebElement>childinnerframe=driver.findElements(By.tagName("iframe"));
		
				for(WebElement innerframe:childinnerframe)
						
					{

int Total = count+parentframes;
System.out.println("total frames together"+Total);
						
					}
			}
		
		}

					

	}


