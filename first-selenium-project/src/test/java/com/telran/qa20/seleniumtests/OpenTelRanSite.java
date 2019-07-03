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

}
