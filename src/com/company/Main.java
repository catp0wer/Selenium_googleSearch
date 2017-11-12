package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Main {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("weather in Chisinau");

        driver.findElement(By.name("btnK")).click();
        driver.close();
    }
}
