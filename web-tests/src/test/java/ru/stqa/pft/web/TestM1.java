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
        public void testM1Step1 () {
            wd.get("https://www.billing.ru/");
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
