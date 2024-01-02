package com.example;

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
        
        //go to browser and open this url 
        wd.get("http://localhost:4200/");
        //supply any data
        wd.findElement(By.xpath("/html/body/app-root/a[2]")).click();
        wd.findElement(By.xpath("/html/body/app-root/app-homepage/a")).click();

        wd.findElement(By.id("username")).sendKeys("admin");
        wd.findElement(By.id("password")).sendKeys("admin");

        //nav-search-submit-button
      
        wd.findElement(By.xpath("/html/body/app-root/app-admin-login/form/button")).click();
        //close browser
        
        Thread.sleep(2000);
        wd.close();
    }
}
