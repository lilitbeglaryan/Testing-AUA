package org.example;

import static java.lang.Math.abs;

public class Operations{

  public String concat(String s1, String s2){
    if(s1=="" || s2=="")
      return "Empty string(s) passed!";
    String result = s1+" "+s2;
    System.out.print(result);
    System.out.print("\n");
    return result;
  }
  public int divide_print(int a, int b){

    if (b == 0){
        throw new ArithmeticException();
//        System.out.print("Division By Zero!");
//        return -1;
    }
    int result =a/b;
    System.out.println(result);
    System.out.print("\n");
    return result;
  }

  public boolean equal(String s1, String s2){
    int i =0;
    while(i<s2.length()){
      for(char ch:s1.toCharArray()){
        if(ch != s2.charAt(i)){
          return false;
        }
        i++;
      }
      break;
    }
    return true;
  }

  public static float mod_subtract(float a, float b){
    if(a>b)
      return a - b;
    return b - a;
  }

//  public static void main(String[] args){
//    System.out.println("hada");
//  }

}



