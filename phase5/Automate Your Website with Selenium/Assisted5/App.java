
package com.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) throws InterruptedException
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
		wd.get("http://127.0.0.1:5500/demo5-alert/alert.html");
        wd.findElement(By.xpath("/html/body/button")).click();

		Alert alert=wd.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		System.out.println(alert.getText());
		alert.accept();

		//Thread.sleep(2000);

		//wd.close();
	}



}
