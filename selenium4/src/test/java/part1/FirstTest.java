package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testOnliner(){
        var catalog = driver.findElement(By.xpath("//span[@class='b-main-navigation__text' and text()='Каталог']"));
        catalog.click();
    }
}
