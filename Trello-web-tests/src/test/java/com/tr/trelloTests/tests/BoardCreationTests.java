package com.tr.trelloTests.tests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardCreationTests extends  TestBase {
  @Test
          public void testBoardCreation(){
    int before = app.getBoard().getPrivateBoardsCount();
    app.clickOnPlusButton();
    app.getBoard().selectCreateBoardFromDropDown();
    app.getBoard().fillBoardCreationForm("qa20");
    app.getBoard().submitBoardCreation();
    app.returnToHomePage();
    int after = app.getBoard().getPrivateBoardsCount();

    Assert.assertEquals(after, before + 1);

  }

  @Test
  public void testBoardCreationLongName(){
    app.clickOnPlusButton();
    app.getBoard().selectCreateBoardFromDropDown();
    app.getBoard().fillBoardCreationForm("qa20 with Veery Long Name Ha Ho");
    app.getBoard().submitBoardCreation();
  }


}
