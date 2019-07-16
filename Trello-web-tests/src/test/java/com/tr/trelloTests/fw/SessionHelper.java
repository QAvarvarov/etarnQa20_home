package com.tr.trelloTests.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {

  public SessionHelper(WebDriver wd) {
    super(wd);
  }

  public void login(String email, String pwd) {
    initLogin();
    fillLoginForm(email, pwd);
    confirmLogin();
  }

  public void confirmLogin() {
    click(By.cssSelector("#login[type=submit]"));
  }

  public void fillLoginForm(String email, String password) {
    type(By.xpath("//*[@id='user']"), email);
    type(By.id("password"), password);
  }

  public void initLogin() {
    click(By.xpath("//*[@href='/login']"));
  }

  public boolean isUserLoggedIn() {
    return isElementPresent(By.cssSelector(".js-open-header-member-menu"));
  }
}
