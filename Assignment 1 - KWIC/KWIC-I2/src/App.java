/*
Gavin D'mello
CIS 532-01 Assignment 1
Implementation 1 -  Master Control  
*/

import java.util.ArrayList;

public class App {

  public static void displayOutput(ArrayList<String> resultArray) {
    // resultArray.forEach(elem -> System.out.println(new String(elem)));
  }

  public static void main(String[] args) throws Exception {
    LineStorage lineStore = new LineStorage(); // Initialized LineStorage for Global use
    new Input().readFile(lineStore); // Initialized Input and called readFile function
    ArrayList<ArrayList<String>> circularShiftResult = new CircularShifter()
      .shiftLines(lineStore)
      .getAllLines();
    System.out.println(circularShiftResult);
  }
}
