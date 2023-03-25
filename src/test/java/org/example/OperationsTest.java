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
    Assert.assertEquals("hello world",operator.concat("hello","world"));
  }

  @Test
  public void divide_print() {
    Operations operator = new Operations();
    Assert.assertEquals(15,operator.divide_print(45,3));
    Assert.assertEquals(1,operator.divide_print(3,3));
  }
  @Test(expectedExceptions = { java.lang.ArithmeticException.class})      //Fails
  public void exceptionTest_Divide() throws Exception {
    Operations operator = new Operations();
    operator.divide_print(20,0);
  }

  @Test
  public void equal(){
    Operations op = new Operations();
    Assert.assertEquals(true,op.equal("aaa","aaa"));
    Assert.assertEquals( false,op.equal("aba","aaa"));
  }
  @Test
  public void mod_subtract() {
    Operations op = new Operations();
    Assert.assertEquals(5,op.mod_subtract(20,15));
    Assert.assertEquals(3,op.mod_subtract(5,8));
  }
}