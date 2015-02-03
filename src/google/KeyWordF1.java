package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class KeyWordF1 {

	public static void main(String[] args) throws Exception {
		String vBrowser, vURL, vText,vGetText,vAttribute;
		String eXPath;
		int vSleep;
		WebDriver driver = new FirefoxDriver();
		vBrowser ="IE";
		vURL= "http://www.google.com/";
		eXPath = "//*[@id='hplogo']";
		vText= "";
		vSleep = 1000;
		//Navigat to a specific URL
		driver.navigate().to(vURL);
		Thread.sleep(vSleep);
		//Find an element and send a text into it
		eXPath = "//input[@id='gbqfq' and @name='q']";
		vText="selenium webdriver";
		driver.findElement(By.xpath(eXPath)).sendKeys(vText);
		Thread.sleep(vSleep);
		//Find an element and clik
		eXPath = "//*[@id='gbqfb'and @name='btnG']";
		driver.findElement(By.xpath(eXPath)).click();
		Thread.sleep(vSleep);
		//Find an element and get Text out of it
		eXPath = "//a[@id='hdtb_tls' and @class='hdtb-tl']";
		vText="selenium webdriver";
		vGetText =driver.findElement(By.xpath(eXPath)).getText();
		System.out.println("Text 1 is "+ vGetText);
		Thread.sleep(vSleep);
		
		eXPath = "//*[@id='resultStats']";
		vText="selenium webdriver";
		vAttribute = "value";
		vGetText =driver.findElement(By.xpath(eXPath)).getText();
		System.out.println("Text 2 is "+ vGetText);
		Thread.sleep(vSleep);
		//Find an element and get a value of a certain attribute out of this.
		eXPath = "//input[@id='gbqfq' and @class='gbqfif']";
		vText="selenium webdriver";
		vAttribute = "value";
		vGetText =driver.findElement(By.xpath(eXPath)).getAttribute(vAttribute);
		System.out.println("Text 3 is "+ vGetText);
		Thread.sleep(vSleep);
		//close the WD or the browser
		driver.close();
		

	}

}
