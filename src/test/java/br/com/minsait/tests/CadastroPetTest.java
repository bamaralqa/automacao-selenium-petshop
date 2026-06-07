package br.com.minsait.tests;

import org.junit.Assert;
import org.junit.Test;

import br.com.minsait.base.BaseTest;
import br.com.minsait.pages.CadastroPage;
import br.com.minsait.pages.HomePage;
import br.com.minsait.pages.LoginPage;

public class CadastroPetTest extends BaseTest {

    @Test
    public void exibirPromocao() throws InterruptedException {

        LoginPage login = new LoginPage(driver);
        HomePage home = new HomePage(driver);

        login.realizarLogin("admin", "123456");

        Thread.sleep(1000);

        home.clicarPromocao();

        home.aceitarAlerta();

        Assert.assertTrue(home.promocaoExibida());
    }

    @Test
    public void cadastrarPetComSucesso() throws InterruptedException {

        LoginPage login = new LoginPage(driver);
        CadastroPage cadastro = new CadastroPage(driver);

        login.realizarLogin("admin", "123456");

        Thread.sleep(1000);

        cadastro.abrirCadastro();

        cadastro.cadastrarPet();

        Assert.assertTrue(cadastro.cadastroRealizado());
    }

    @Test
    public void validarCamposObrigatorios() throws InterruptedException {

        LoginPage login = new LoginPage(driver);
        CadastroPage cadastro = new CadastroPage(driver);

        login.realizarLogin("admin", "123456");

        Thread.sleep(1000);

        cadastro.abrirCadastro();

        driver.findElement(org.openqa.selenium.By.id("save-pet-button")).click();

        org.openqa.selenium.Alert alert = driver.switchTo().alert();

        Assert.assertTrue(alert.getText().contains("Preencha"));

        alert.accept();
    }
}