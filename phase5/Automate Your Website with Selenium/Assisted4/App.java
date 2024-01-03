package com.example;

import java.util.concurrent.TimeUnit;

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
        
    //    wd.manage().timeouts().pageLoadTimeout(2000,TimeUnit.MILLISECONDS);
        
        //go to browser and open this url 
        wd.get("https://www.amazon.in/");
       
        wd.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
        wd.close();
    }
}
