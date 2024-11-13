package com.etiya.login;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTests
{
  @Test
  public void loginSuccessfull()
  {
    // 3A Kuralı - 3A Prensipi - 3A Principle
    // Arrange -> Test için hazırlık ( driverin tanımlanması, urllerin hazırlanması, parametrelerin hazırlanması )
    FirefoxDriver driver = new FirefoxDriver();
    driver.get("https://www.saucedemo.com/");

    String username = "standard_user";
    String password = "secret_sauce";

    WebElement usernameInput = driver.findElement(By.cssSelector("[data-test='username']"));
    WebElement passwordInput = driver.findElement(By.cssSelector("[data-test='password']"));
    WebElement loginBtn = driver.findElement(By.cssSelector("[data-test='login-button']"));
    // ***

    // Act -> (Action) Testin aksiyona alınması ( inputların doldurulması, butona tıklanması )
    usernameInput.sendKeys(username);
    passwordInput.sendKeys(password);
    loginBtn.click();
    // ***

    // Assert -> (Doğrulama) Expected result ile actual resultın karşılaştırıldığı aşamadır.
    assert driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html1");
    driver.quit();
    // ***
  }

  @Test
  public void loginWithWrongPassword()
  {
    // yapmak istediğimiz test
  }
}
