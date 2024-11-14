package com.etiya.login;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;

public class LoginTests
{
  FirefoxDriver driver;

  @BeforeEach // -> Her test öncesi bu fonksiyonu 1 kere çalıştır.
  public void startUp() {
    driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("https://www.saucedemo.com/");
  }

  @AfterEach // -> Her test sonrası bu fonksiyonu 1 kere çalıştır.
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void loginSuccessfull()
  {
    LoginPage loginPage = new LoginPage(driver);

    loginPage.enterUsername("standard_user");
    loginPage.enterPassword("secret_sauce");
    loginPage.clickLogin();

    assert driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html");
  }

  @Test
  public void loginWithWrongPassword()
  {
    LoginPage loginPage = new LoginPage(driver);

    loginPage.enterUsername("standard_user");
    loginPage.enterPassword("secret_sauce1");
    loginPage.clickLogin();

    Assert.assertTrue(loginPage.getErrorHeading().isDisplayed());
    Assert.assertEquals(
            loginPage.getErrorHeading().getText(),
            "Epic sadface: Username and password do not match any user in this service");
  }
}
