package wdmethods;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import util.Reporter;

public  class SeMethods extends Reporter implements WdMethods{
	//private static final String value = null;
	int i = 1;
	public static RemoteWebDriver driver;
	public void startApp(String browser, String url) {
		try {
			if(browser.equals("chrome")) {
				
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get(url);
			reportStep("The browser"+browser+"is launched successfully","pass");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reportStep("The browser"+browser+"couldnt be launched successfully","failed");

		}
			}

	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case "id": 	  return driver.findElementById(locValue);
			case "class": return driver.findElementByClassName(locValue);
			case "xpath": return driver.findElementByXPath(locValue);	
			case "link":return driver.findElementByLinkText(locValue);
			}
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("No Such Element has occurred","fail");

			throw  new RuntimeException();
			
		}
		catch(Exception e)
		{
			reportStep("Run Time Exception","fail");
			throw  new RuntimeException();

		}
		

		return null;
	}

	public WebElement locateElement(String locValue) {

		try {
			reportStep("Located the Exact Element","pass");
			return driver.findElementById(locValue);


		} catch (Exception e) {
			reportStep("unable to locate the Exact Element","fail");

			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void type(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			System.out.println("The Data "+data+" is Entered Successfully");
			//reportStep("The Data "+data+" is Entered Successfully","pass");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Exception occurred");
			reportStep("The Data "+data+" is not Entered Successfully","fail");

			throw new NoSuchElementException("Element doesnt exists");

		}
		finally
		{
		}
		takeSnap();

	}

	public void click(WebElement ele) {
		try {
			ele.click();
			System.out.println("The Element "+ele+" is clicked Successfully");
			takeSnap();
			reportStep("The Data "+ele+" is clicked Successfully","pass");

		} catch (Exception e) {
			// TODO Auto-generated catch block
		reportStep("The Data "+ele+" is not  clicked Successfully","fail");

			e.printStackTrace();
		}		
	}

	public void clickwithoutsnap(WebElement ele) {
		
		try {
			ele.click();
			System.out.println("The Element "+ele+" is not clicked Successfully");
			reportStep("The Data "+ele+" is clicked Successfully","pass");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("The Data "+ele+" is not  clicked Successfully","fail");

			e.printStackTrace();
		}
	}
	public String getText(WebElement ele) {
		try {
			reportStep("The Data"+ele+"is located successfully","pass");

			return ele.getText();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("NoSuchElementException","fail");

throw new  NoSuchElementException("Element doesnt exists");
		}
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		try{
			// TODO Auto-generated method stub
		Select objname=new Select(ele);
		objname.selectByVisibleText(value);		
		reportStep("The Data"+ele+"is located successfully and the"+value+"is entered successfully","pass");
		}
		catch (Exception e) {
			// TODO: handle exception
			reportStep("The Data"+ele+"is not located successfully and the"+value+"is not entered successfully","fail");

			throw new NoSuchElementException("Value doesnt exists");
		}
		

	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		try {
			// TODO Auto-generated method stub
			Select objname=new Select(ele);
			objname.selectByIndex(index);
			reportStep("The Data"+ele+"is located successfully and the"+index+"is entered successfully","pass");

		} 
		catch (NoSuchElementException e) {
			reportStep("The Data"+ele+"is  not located successfully and the"+index+"is not entered successfully","fail");

			// TODO Auto-generated catch block
		}
	}
	public void selectDropDownUsingValue(WebElement ele,String value) {
		try {
			Select objname=new Select(ele);
			objname.selectByValue(value);
			reportStep("The Data"+ele+"is located successfully and the"+value+"is entered successfully","pass");

		} catch (Exception e) {
			reportStep("The Data"+ele+"is  not located successfully and the"+value+"is not entered successfully","fail");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean verifyTitle(String expectedTitle) {
		try {
			String title=driver.getTitle();
			
			if(title.contains(expectedTitle)) {
				System.out.println("Title is "+title);
				reportStep("The Data"+expectedTitle+"is located successfully","pass");

              return true;
			}
			else
			{
				System.out.println("Title is not correct");
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Exception occurred");	
			reportStep("The Data"+expectedTitle+"is located successfully","fail");
}
		// TODO Auto-generated method stub
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) 

	{

		if(ele.getText().equalsIgnoreCase(expectedText))
		{
			try {
				System.out.println("Matching");
				reportStep("The Data"+ele+"is  matched successfully","pass");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				reportStep("The Data"+ele+"is not located successfully","fail");

				e.printStackTrace();
			}

		}
		else
		{
			System.out.println("Not Matching");
		}
	}


	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		if(ele.getText().contains(expectedText))
		{
			try {
				System.out.println("Matching");
				reportStep("The "+expectedText+"is  matched successfully","pass");

			} catch (Exception e) {
				// TODO Auto-generated catch block
				reportStep("The "+expectedText+"is not  matched successfully","fail");

				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("Not Matching");
		}
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void acceptAlert() {
		try {
			Alert alertobj=driver.switchTo().alert();
			alertobj.accept();
			reportStep("Cannot be switched to Alert","pass");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Cannot be switched to Alert","fail");

			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

	public void dismissAlert() {
		try {
			Alert alertobj=driver.switchTo().alert();
			alertobj.dismiss();
			reportStep("Cannot be switched to Alert","pass");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Cannot be switched to Alert","fail");

			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		try {
			Alert alertobj=driver.switchTo().alert();
			String alertrespond=alertobj.getText();
			reportStep("Cannot be switched to Alert","pass");

			return alertrespond;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Cannot be switched to Alert","fail");

			e.printStackTrace();
		}
		return null;
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
			reportStep("file cannot be copied","pass");

		} catch (IOException e) {
			reportStep("file cannot be copied","fail");

			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			reportStep("Browser cannot be closed","pass");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Browser cannot be closed","fail");
		}
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub

	}

	
	
	public void mouseover(WebElement ele1,WebElement ele2)
	{
		try {
			Actions builder = new Actions(driver);
			builder.moveToElement(ele1).pause(3000).click(ele2).perform();
			reportStep("Element"+ele1+"cannot be mouse over","pass");

		} catch (Exception e) {
			reportStep("Element"+ele1+"cannot be mouse over","pass");

			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		try {
			Set<String>window=driver.getWindowHandles();
			List<String>listofwindow=new ArrayList<String>();
			listofwindow.addAll(window);
			driver.switchTo().window(listofwindow.get(index));
			reportStep("window"+index+"cannot be switched","pass");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("window"+index+"cannot be switched","fail");

			e.printStackTrace();
		}
		
		
	}

	public boolean retry(ITestResult iresult) {
		// TODO Auto-generated method stub
		
		
		return false;
		
	}

	@Override
	public void transform(ITestAnnotation Annotation, Class Listenerclass, Constructor Listenerconstructor,
			Method Listenermethod) {
		// TODO Auto-generated method stub
		
	}
	
		}
	
	


