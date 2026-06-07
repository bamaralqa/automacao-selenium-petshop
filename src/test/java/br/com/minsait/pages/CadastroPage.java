package br.com.minsait.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CadastroPage {

    WebDriver driver;

    public CadastroPage(WebDriver driver) {
        this.driver = driver;
    }

    By menuCadastro = By.id("open-register-page");

    By nomePet = By.id("pet-name");
    By dono = By.id("pet-owner");
    By especie = By.id("pet-species");
    By idade = By.id("pet-age");
    By vacinado = By.id("pet-vaccinated");
    By foto = By.id("pet-photo");
    By salvar = By.id("save-pet-button");
    By sucesso = By.id("pet-success");

    public void abrirCadastro() {
        driver.findElement(menuCadastro).click();
    }

    public void cadastrarPet() {

        driver.findElement(nomePet).sendKeys("Thor");
        driver.findElement(dono).sendKeys("Bruna");

        Select select = new Select(driver.findElement(especie));
        select.selectByVisibleText("Cachorro 🐕");

        driver.findElement(idade).sendKeys("5 anos");

        driver.findElement(vacinado).click();

        driver.findElement(foto).sendKeys("C:\\tools\\SELENIUM\\Desafio_Final\\DesafioFinal\\gato.jpg");

        driver.findElement(salvar).click();
    }

    public boolean cadastroRealizado() {
        return driver.findElement(sucesso).isDisplayed();
    }
}