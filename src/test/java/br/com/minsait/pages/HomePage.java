package br.com.minsait.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By promotionButton = By.id("promotion-button");
    By promotionMessage = By.id("promotion-message");
    By logoutButton = By.id("logout-button");

    public void clicarPromocao() {
        driver.findElement(promotionButton).click();
    }

    public void aceitarAlerta() {
        Alert alerta = driver.switchTo().alert();
        alerta.accept();
    }

    public boolean promocaoExibida() {
        return driver.findElement(promotionMessage).isDisplayed();
    }

    public void logout() {
        driver.findElement(logoutButton).click();
    }
}