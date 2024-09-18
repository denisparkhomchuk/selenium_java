package part2;

import org.example.pages.BasePage;
import org.example.pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseTest {
    private static String URL = "https://www.onliner.by/";
    protected WebDriver driver;
    protected BasePage basePage;
    protected MainPage mainPage;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        mainPage = new MainPage();
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
