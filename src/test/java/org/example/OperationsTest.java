package org.example;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import org.testng.Assert.*;
import org.testng.Assert;

@Test()
public class OperationsTest {

  @DataProvider
  public Object[][] strings() {
    return new String[][] {new String[] {"hello","world"}, new String[] {"","aa"},new String[] {"hehe",""}};
  }


  @DataProvider
  public Object[][] numbers() {
    return new int[][][]{new int[][]{new int[]{12, 0}, new int[]{12, 3}, new int[]{5, 20}}};
  }

//  @Test(dataProvider = "data")
//  @Parameters({"hello","world"})
  @Test
  public void concat() {
    Operations operator = new Operations();
    Assert.assertEquals("Empty string(s) passed!",operator.concat("hi",""));
  }

  @Test
  public void divide_print() {
  }

  @Test
  public void mod_subtract() {
  }
}