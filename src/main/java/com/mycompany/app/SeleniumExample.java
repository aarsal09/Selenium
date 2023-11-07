package com.mycompany.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "//Users//mohammedarsal//Downloads//chromedriver_mac64//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com%22/");
        // Add your test logic here
        driver.quit();
    }
}
