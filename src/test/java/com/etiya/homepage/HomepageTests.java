package com.etiya.homepage;

import com.etiya.login.LoginPage;
import com.etiya.utils.ConfigReader;
import com.etiya.utils.DriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomepageTests
{
  FirefoxDriver driver;

  @BeforeEach
  public void beforeEach() {
    driver = DriverManager.getDriver();
    driver.get(ConfigReader.getProperty("baseUrl"));
  }
  @AfterEach
  public void afterEach() {
    driver.quit();
  }

  @Test
  public void hambugerMenuShouldOpen() {
    // Login
    LoginPage loginPage = new LoginPage(driver);
    loginPage.loginWithValidCredentials();

    HomepagePage homepagePage = new HomepagePage(driver);

    homepagePage.clickHamburgerMenuButton();

    Assertions.assertTrue(homepagePage.getHamburgerMenu().isDisplayed());
  }
}
