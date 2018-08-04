package myprogram.bin;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();
		dr.get("http://leaftaps.com/opentaps");

	}

}
