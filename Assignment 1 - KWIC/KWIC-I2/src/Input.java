/*
Gavin D'mello
CIS 532-01 Assignment 1
Implementation 1 -  Keyboard Input for multiple lines 
*/

import java.util.*;

public class Input {

  public String[] getInputStrings() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of lines:  ");
    String[] inputArray = new String[sc.nextInt()];
    sc.nextLine();
    for (var i = 0; i < inputArray.length; i++) {
      System.out.print("Enter line " + (i + 1) + ": ");
      inputArray[i] = sc.nextLine();
    }
    return inputArray;
  }
}
