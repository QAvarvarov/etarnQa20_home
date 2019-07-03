package com.telran.qa20.seleniumtests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class OpenTelRanSite extends TestBase {

  @Test
  public void testOpeningTelRanSite() {
    wd.get("https://www.tel-ran.com/");
    String url = wd.getCurrentUrl();

    Assert.assertEquals(url, "https://www.tel-ran.com/");
  }

  @Test
  public void elementsTest() {
    String elementName = wd.findElement(By.id("comp-jgxqwu2binlineContent-gridContainer")).getText();
    System.out.println(elementName);
    String elementNameBycssSelector = wd.findElement(By.cssSelector("#comp-jgxqwu2binlineContent-gridContainer")).getText();
    String elementNameByXPath = wd.findElement(By.xpath("//*[@id='comp-jgxqwu2binlineContent-gridContainer']")).getText();

    Assert.assertEquals(elementName, elementNameByXPath);
  }

}
