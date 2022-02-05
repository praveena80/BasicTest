package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class simpleTest {

    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prave\\IdeaProjects\\BasicSelenium\\chromedriver.exe");
        WebDriver driver;
        //create chrome instance
        driver = new ChromeDriver();
        driver.get("http://www.facebook.com/");

        WebElement element;

        element = driver.findElement(By.xpath("//input[@name='email']"));
        element.sendKeys("abc@gmail.com");
        element = driver.findElement(By.xpath("//input[@name='pass']"));
        element.sendKeys("abbaas");
        WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
        button.click();

        driver.close();
    }
}
