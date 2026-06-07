package br.com.minsait.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By usuario = By.id("login-username");
    By senha = By.id("login-password");
    By botaoEntrar = By.id("login-submit");
    By mensagemErro = By.id("login-error");

    public void realizarLogin(String user, String pass) {
        driver.findElement(usuario).clear();
        driver.findElement(usuario).sendKeys(user);

        driver.findElement(senha).clear();
        driver.findElement(senha).sendKeys(pass);

        driver.findElement(botaoEntrar).click();
    }

    public String obterMensagemErro() {
        return driver.findElement(mensagemErro).getText();
    }
}