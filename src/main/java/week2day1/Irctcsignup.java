package week2day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Irctcsignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions obj=new ChromeOptions();
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");		
//driver.findElementByXPath("//div[@class='h_menu_drop_button hidden-xs']").click();
		//	driver.findElementByXPath("//span[text()='AGENT LOGIN']");
		//				driver.findElementByXPath("//span[@class='ng-star-inserted']");
		driver.findElementById("userRegistrationForm:userName").sendKeys("babydoll");
		driver.findElementById("userRegistrationForm:password").sendKeys("babe1208");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("babe1208");
		WebElement securityDropdown=driver.findElementById("userRegistrationForm:securityQ");//for selecting the drop down
				Select selectingObject=new Select(securityDropdown);//default class for selecting the dropdown invoking
				selectingObject.selectByVisibleText("What is your pet name?");//selecting the preferred value
				driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("puppy");
				driver.findElementById("userRegistrationForm:firstName").sendKeys("Subbulakshmi");
				driver.findElementById("userRegistrationForm:middleName").sendKeys("kavitha");
				driver.findElementById("userRegistrationForm:lastName").sendKeys("Kailash");
				driver.findElementById("userRegistrationForm:gender:1").click();
				driver.findElementById("userRegistrationForm:maritalStatus:0");
				driver.findElementById("userRegistrationForm:dobDay").sendKeys("29");
				
				driver.findElementById("userRegistrationForm:dobMonth").sendKeys("NOV");
				driver.findElementById("userRegistrationForm:dateOfBirth").sendKeys("1993");
				WebElement occupationDD=driver.findElementById("userRegistrationForm:occupation");
				Select selectingObject2=new Select(occupationDD);
				selectingObject2.selectByVisibleText("Others");
				
				WebElement countryDD=driver.findElementById("userRegistrationForm:countries");
				Select selectingObject3=new Select(countryDD);
				selectingObject3.selectByValue("94");
				driver.findElementById("userRegistrationForm:email").sendKeys("updatesnmails@gmal.com");
				driver.findElementById("userRegistrationForm:mobile").sendKeys("7010324762");
WebElement nationalityDD =driver.findElementById("userRegistrationForm:nationalityId");		
Select selectingObject4=new Select(nationalityDD);
selectingObject4.selectByValue("94");
driver.findElementById("userRegistrationForm:address").sendKeys("2");
driver.findElementById("userRegistrationForm:pincode").sendKeys("641026",Keys.TAB);
Thread.sleep(10000);
//driver.findElementById("userRegistrationForm:statesName").sendKeys("TamilNadu");

WebElement cityDD=driver.findElementById("userRegistrationForm:cityName");
Select selectingObject5=new Select(cityDD);
selectingObject5.selectByValue("Coimbatore");
Thread.sleep(10000);

WebElement postofficeDD=driver.findElementById("userRegistrationForm:postofficeName");

Select selectingObject6=new Select(postofficeDD);
selectingObject6.selectByVisibleText("Selvapuram B.O");
driver.findElementById("userRegistrationForm:landline").sendKeys("0422-2345982");

		//driver.findElementById("userRegistrationForm:securityQ").click();
		
	}

}
