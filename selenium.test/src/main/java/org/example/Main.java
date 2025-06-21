package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
// //tagname[@attribute= 'value']  xpath
@Test
    public static void test()
     {
       // System.setProperty("","sdsdfsdfsf");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.co.in/");
         System.out.println("heyyaa");
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Shamal");
    }
}