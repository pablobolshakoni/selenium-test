package ru.stqa.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://localhost:8080/litecart/en/");
        driver.findElement(By.name("email")).sendKeys("nlcng.vsn@gmail.com");
        driver.findElement(By.name("password")).sendKeys("qwerty");
        driver.findElement(By.name("login")).click();
        Thread.sleep(5000);
        driver.quit();

    }
}

