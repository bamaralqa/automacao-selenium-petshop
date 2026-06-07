package br.com.minsait.tests;

import org.junit.Assert;
import org.junit.Test;

import br.com.minsait.base.BaseTest;
import br.com.minsait.pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginComSucesso() throws InterruptedException {

        LoginPage login = new LoginPage(driver);

        login.realizarLogin("admin", "123456");

        Thread.sleep(1000);

        Assert.assertTrue(driver.getPageSource().contains("Dashboard do PetShop"));
    }

    @Test
    public void loginInvalido() {

        LoginPage login = new LoginPage(driver);

        login.realizarLogin("admin", "errada");

        Assert.assertEquals("❌ Usuário ou senha inválidos. Use admin / 123456", login.obterMensagemErro());
    }
}