package com.etiya.homepage;

import com.etiya.login.LoginPage;
import com.etiya.utils.ConfigReader;
import com.etiya.utils.DriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomepageTests
{
  static FirefoxDriver driver;

  @BeforeAll // Bütün testlerden önce 1 kere çalış.
  public static void beforeAll() {
    driver = DriverManager.getDriver();
    driver.get(ConfigReader.getProperty("baseUrl"));

    LoginPage loginPage = new LoginPage(driver);
    loginPage.loginWithValidCredentials();
  }

  @BeforeEach
  public void beforeEach() {
    driver.get(ConfigReader.getProperty("homepageUrl"));
  }


  @Test
  public void hambugerMenuShouldOpen() {
    HomepagePage homepagePage = new HomepagePage(driver);

    homepagePage.clickHamburgerMenuButton();

    Assertions.assertTrue(homepagePage.getHamburgerMenu().isDisplayed());
    Assertions.assertTrue(homepagePage.getHamburgerMenuCloseButton().isEnabled());
  }

  @Test
  public void hambugerMenuShouldClose() {
    HomepagePage homepagePage = new HomepagePage(driver);

    Assertions.assertFalse(homepagePage.getHamburgerMenuCloseButton().isDisplayed());
  }
}
