package web_tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiscountTest {
    @Test
    public void testDiscount() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://tavriav.ua/");
        driver.manage().window().maximize();

        driver.get("https://tavriav.ua/catalog/discount/");
        driver.get("https://tavriav.ua/catalog/discount/?price=asc");
    }
}
