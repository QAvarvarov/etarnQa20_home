package com.tr.trelloTests.tests;

import org.testng.annotations.Test;

public class TeamCreationTests extends TestBase{
  @Test
  public void testTeamCreation(){
    app.clickOnPlusButton();
    app.getTeam().selectCreateTeamFromDropDown();
    app.getTeam().fillTeamCreationForm();
   // selectCreateTeamFromDropDown();
   // fillTeamCreationForm();
    //
  }
}
