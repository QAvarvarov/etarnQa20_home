package com.tr.trelloTests.tests;

import com.tr.trelloTests.fw.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

 ApplicationManager app = new ApplicationManager();

  @BeforeMethod
  public void setUp() {
    app.init();
  }

  @AfterMethod
  public void tearDown() {
    app.stop();
  }

}
