package google;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreatingListOfElement {

 
		WebDriver driver;
	    String Url;
	    @BeforeMethod
	    public void setUp() {


	        driver = new FirefoxDriver();
	        driver.navigate().to("http://www.google.com/");
	    }
	    @Test
	    public void capturingLink() throws Exception {


	        List<WebElement> list = driver.findElements(By.tagName("a"));
	        int mylist = list.size();
	        System.out.println("number of list " + mylist);
	        for(int i = 0; i<mylist; i++)
	        {
	            //System.out.println(i);
	            if(!list.get(i).getText().equals(""))
	            {	System.out.println("List text is "+list.get(i).getText());
	                System.out.print("........");
	                System.out.print("URL is "+ list.get(i).getAttribute("href"));
	                System.out.println("");
	            }
	        }
	        File myImg = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        String path = "C://Selenium/test.jpg";
	        FileUtils.copyFile(myImg, new File(path));
	        Thread.sleep(2000);
	        driver.close();
	        driver.close();
	    }

	}


