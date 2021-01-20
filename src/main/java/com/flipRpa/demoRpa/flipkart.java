package com.flipRpa.demoRpa;// Generated by Selenium IDE

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class flipkart {
  private static WebDriver driver;
  private static Map<String, Object> vars;
  static JavascriptExecutor js;

  public static void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }

  public static void tearDown() {
    driver.quit();
  }
  public static String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }



  public static void main(String[] args) {
    setUp();
    driver.get("https://vendorhub.flipkart.com/#vendor-portal/home");
    driver.manage().window().setSize(new Dimension(1853, 1053));
    driver.findElement(By.cssSelector(".summary-card:nth-child(3) > .summary-sub-text")).click();
    driver.findElement(By.cssSelector(".sc-EHOje:nth-child(3) .jaSJGV")).click();
    driver.findElement(By.cssSelector(".sc-EHOje:nth-child(1) .styles__PrimaryText-vf3eip-1")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".sc-EHOje > .active"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.cssSelector(".rt-tr-group:nth-child(1) .ActionStyles__Action-sc-1x6oi2k-0")).click();
    vars.put("win9334", waitForWindow(2000));
    vars.put("root", driver.getWindowHandle());
    driver.switchTo().window(vars.get("win9334").toString());
    driver.close();
    driver.switchTo().window(vars.get("root").toString());

    tearDown();
  }
}
