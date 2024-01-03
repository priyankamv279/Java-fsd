package com.example;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) throws InterruptedException, IOException
	{
		//register the webdriver =>browser vendor 
		WebDriverManager.chromedriver().setup();
		//creating an object to the object
		WebDriver wd=new ChromeDriver();
		//maximize the browser
		wd.manage().window().maximize();

		//webpage timebound 

		// wd.manage().timeouts().pageLoadTimeout(1,TimeUnit.MILLISECONDS);

		//go to browser and open this url 
		wd.get("https://www.amazon.in/");
		takeScreenShot(wd,"abc");
		
		JavascriptExecutor js=(JavascriptExecutor) wd;
		//no of pixels move down
		
	//	js.executeScript("window.scrollBy(0,100)");
		
		//till we get the element 
//		WebElement we=wd.findElement(By.linkText("Help"));
//		js.executeScript("arguments[0].scrollIntoView();",we);
//		we.click();
		
		//scroll down last of the page 
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		takeScreenShot(wd,"def");
		//file+i->increment i
		wd.close();
		
	}

// ss process
	public static void takeScreenShot(WebDriver wd,String fileName) throws IOException {
		//take the screenshot and store it as a file format 
		File file=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		//copy the screen shot to the specified location
		FileUtils.copyFile(file,new File("F:\\"+fileName+".png") );
		
		
	}
	

}


