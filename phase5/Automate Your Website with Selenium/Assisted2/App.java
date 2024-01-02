////demo1
//package com.example;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
///**
// * Hello world!
// *
// */
//public class App 
//{
//    public static void main( String[] args )
//    {
//    	//register the web driver =>browser vendor 
//        WebDriverManager.chromedriver().setup();
//        //creating an object to the object
//        WebDriver wd=new ChromeDriver();
//        //maximize the browser
//        wd.manage().window().maximize();
//        
//        //go to browser and open this url 
//        wd.get("https://www.amazon.in/");
//        //close browser
//        wd.close();
//    }
//}

// demo2 below 
package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
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
        wd.get("https://www.amazon.in/");
        //supply any data
       wd.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung");

        //nav-search-submit-button
        wd.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        
        //close browser
        
//        Thread.sleep(2000);
//        wd.close();
    }
}

