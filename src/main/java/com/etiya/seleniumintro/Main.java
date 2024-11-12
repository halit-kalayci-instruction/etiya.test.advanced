package com.etiya.seleniumintro;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
  public static void main(String[] args) {
    FirefoxDriver driver = new FirefoxDriver();
    driver.get("https://www.etiya.com/tr");
  }
}
