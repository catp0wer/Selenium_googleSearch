package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Main {

    public static void main(String[] args) {
        //creating and instantiating a Firefox Driver object;
        WebDriver driver = new FirefoxDriver();
        //opening the browser and navigating to google.com
        driver.get("http://www.google.com");
        //finding Search field and entering the text
        driver.findElement(By.name("q")).sendKeys("weather in Chisinau");
        //finding Search button and click on it
        driver.findElement(By.name("btnK")).click();
        //closing the browser
        driver.close();
    }
}
