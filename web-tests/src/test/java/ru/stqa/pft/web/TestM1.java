package ru.stqa.pft.web;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.OutputType.*;

/**
 * Created by marina.peunkova on 16/04/2016.
 */
public class TestM1 {
        FirefoxDriver wd;

        @BeforeMethod
        public void setUp() throws Exception {
            wd = new FirefoxDriver();
            wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        }

        @Test
        public void testM111 () {
            wd.get("srv2-sbms-web01:10074/ps/sbms/shell.html?shell_no_start_window=1&shell_login=vclir&shell_password=1111");
            wd.findElement(By.linkText("Клиенты")).click();
            wd.findElement(By.linkText("Поиск / выбор клиента")).click();
            wd.findElement(By.linkText("Карточка клиента")).click();
            wd.findElement(By.linkText("Фин. карточка клиента")).click();
        }

        @AfterMethod
        public void tearDown() {
            wd.quit();
        }

    public  boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

}
