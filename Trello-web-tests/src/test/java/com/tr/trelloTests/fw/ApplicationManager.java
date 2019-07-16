package com.tr.trelloTests.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  WebDriver wd;
  SessionHelper session;
  BoardHelper board;
  TeamHelper team;

  public void init() {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    openSite("https://trello.com/");
    session = new SessionHelper(wd);
    session.login("elena.telran@yahoo.com", "12345.com");
    board = new BoardHelper(wd);
    team = new TeamHelper(wd);
  }

  public void stop() {
    wd.quit();
  }

  public void openSite(String url) {
    wd.get(url);
  }

  public void clickOnPlusButton() {
    click(By.cssSelector("[id=header] button [name=add]"));
  }




  public void returnToHomePage() {
    click(By.cssSelector("#header [name=home]"));
  }

  public void click(By locator) {
    wd.findElement(locator).click();
  }

  public SessionHelper getSession() {
    return session;
  }

  public BoardHelper getBoard() {
    return board;
  }

  public TeamHelper getTeam() {
    return team;
  }

}
