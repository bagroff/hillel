package web_tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTestTavriav {

    @Test
    public void searchTest()  {
            System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://tavriav.ua/");
            driver.manage().window().maximize();

            driver.findElement(By.className("input-group-field")).clear();
            driver.findElement(By.className("input-group-field")).sendKeys("Jameson");
            driver.findElement(By.className("input-group-field")).sendKeys(Keys.ENTER);

//            driver.quit();

    }
}
