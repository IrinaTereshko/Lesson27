package by.itstep.tia.controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class main {

    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = new ChromeDriver();
//        driver = new  FirefoxDriver;
//        driver = new EdgeDriver();
//        driver = new SafariDriver();
//

        runTest(driver);
    }
    public static void runTest(WebDriver driver) throws InterruptedException {
        driver.get("https://www.google.com/");
//        driver.navigate().to("https://www.google.com/");

        TimeUnit.SECONDS.sleep(5);
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Selenium");
        element.submit();

        System.out.println(driver.getTitle());


        TimeUnit.SECONDS.sleep(5);

        driver.quit();

        // если несколько страниц, то можно так
//        driver.close();
//

    }
}
