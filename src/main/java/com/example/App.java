package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();

        // 🔥 REQUIRED for Jenkins / Linux
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--window-size=1920,1080"); // replaces maximize()

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://automationexercise.com/products");

        // Add Product 4
        driver.findElement(By.cssSelector("[data-product-id='4']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".btn.btn-success.close-modal.btn-block")).click();

        // Add Product 5
        driver.findElement(By.cssSelector("[data-product-id='5']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".btn.btn-success.close-modal.btn-block")).click();

        // Add Product 6
        driver.findElement(By.cssSelector("[data-product-id='6']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".btn.btn-success.close-modal.btn-block")).click();

        // Go to Cart
        driver.get("https://automationexercise.com/view_cart");

        driver.navigate().refresh();

        Thread.sleep(5000);

        driver.quit();
    }
}
