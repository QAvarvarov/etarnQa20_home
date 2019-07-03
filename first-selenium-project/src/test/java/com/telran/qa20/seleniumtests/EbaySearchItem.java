package com.telran.qa20.seleniumtests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EbaySearchItem extends TestBase {


  @Test
  public void testEbaySearchItem() {
    //open site
    wd.get("https://www.ebay.com");
    //click on search bar
    wd.findElement(By.xpath("//*[@name='_nkw']")).click();
    //type Text
    wd.findElement(By.id("gh-ac")).click();
    wd.findElement(By.id("gh-ac")).clear();
    wd.findElement(By.id("gh-ac")).sendKeys("umbrella");
    //click on search button
    wd.findElement(By.id("gh-btn")).click();
  }


}
