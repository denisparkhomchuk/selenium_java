package org.example.pages;

import org.openqa.selenium.By;

public class MainPage extends BasePage{
    private By locatorCatalog = By.xpath("//span[@class='b-main-navigation__text' and text()='Каталог']");

    public void navigateToCatalog(){
        find(locatorCatalog).click();
    }

}
