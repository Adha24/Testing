package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


@SuppressWarnings("unused")
public class AppTest 
{
    
    public static void main(String[]args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.shoppersstop.com/");
        driver.manage().window().maximize();
        String title=driver.getTitle();
        driver.findElement(By.xpath("//*[@id='profileImage']/a/i")).click();;
        String url=driver.getCurrentUrl();
        String pagesource=driver.getPageSource();
        int l=pagesource.length();
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(1000);
        driver.navigate().back();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Title : "+title);
        // System.out.println("Page Source : "+pagesource);
        if(driver.getCurrentUrl().equals(url)){
            System.out.print("Valid");
            
        }
        else{
            System.out.print("Invalid");
        }
        System.out.println();
        System.out.println();
        System.out.println();
        driver.close();
    }
}
