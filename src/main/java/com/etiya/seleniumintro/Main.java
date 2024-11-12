package com.etiya.seleniumintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
  public static void main(String[] args) {
    FirefoxDriver driver = new FirefoxDriver();
    driver.get("https://www.etiya.com/tr");

    WebElement acceptBtn = driver.findElement(By.xpath("/html/body/div[4]/div[2]/button[3]"));
    acceptBtn.click();

    WebElement searchBtn = driver.findElement(By.id("search-btn"));
    searchBtn.click();

    WebElement searchInput = driver.findElement(By.id("search-input"));
    searchInput.sendKeys("türk telekom");

    WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"search-box\"]/form/div/button"));
    searchButton.click();
  }
}


// /html/body/div[4]/div[2]/button[3]
// /html/body/div[4]/div[2]/button[3]
// //button[text()=' Hepsini Kabul Et ']
// body > div.lcc-modal.lcc-modal--alert.js-lcc-modal.js-lcc-modal-alert > div.lcc-modal__actions > button.lcc-button.js-lcc-accept