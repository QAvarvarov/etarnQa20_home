package com.tr.trelloTests.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeamHelper extends HelperBase {
  public TeamHelper(WebDriver wd) {
    super(wd);
  }

  public void selectCreateTeamFromDropDown() {
    click(By.cssSelector("[data-test-id='header-create-team-button']"));

  }
// To do
  public void fillTeamCreationForm() {


  }
}
