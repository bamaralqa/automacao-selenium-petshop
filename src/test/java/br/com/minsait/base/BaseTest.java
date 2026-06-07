package br.com.minsait.base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;

    @Before
    public void setup() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("file:///C:/tools/SELENIUM/Desafio_Final/DesafioFinal/desafio_final_selenium_java.html");
    }

    @After
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}