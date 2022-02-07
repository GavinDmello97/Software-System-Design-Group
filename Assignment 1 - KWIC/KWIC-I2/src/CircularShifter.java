/*Kameron Jusseaume
CIS 532-01 Assignment 1
Implementation 2 - Circular Shifter
*/
import java.util.ArrayList;
import java.util.Arrays;


public class CircularShifter {

  private static ArrayList<ArrayList<String>> shiftedStrings = new ArrayList<ArrayList<String>>();

  private static ArrayList<ArrayList<String>> generateAllStrings(String[] stringArr) {
    // ArrayList to store all the circular shifter strings
    

    for (var p = 0; p < stringArr.length; p++) {
      ArrayList<String> currentStringArr = new ArrayList<String>();
      String string = stringArr[p];
      String[] input = string.split(" ");
      for (int i = 0; i < input.length; i++) {
        String[] shifted = rightShifter(input);
        System.out.println(shifted[0]);
        if(shifted[0].equalsIgnoreCase("is") || shifted[0].equalsIgnoreCase("the") 
          || shifted[0].equalsIgnoreCase("of") || shifted[0].equalsIgnoreCase("and") 
          || shifted[0].equalsIgnoreCase("as") || shifted[0].equalsIgnoreCase("a")
          || shifted[0].equalsIgnoreCase("after"))
        {
          continue;
        }
        else
        {
          currentStringArr.add(String.join(" ", shifted)); // Storing all shifted sentences of a single input line.
        }
      }
      shiftedStrings.add(currentStringArr); // store the Arraylist of one line in the main ArrayList
    }
    return shiftedStrings;
  }

  public ArrayList<String> getLine(int lineNum)
  {
    return shiftedStrings.get(0);
  }

  /* Move the first element to the last position */
  private static String[] rightShifter(String[] input) {
    String tempStr = input[0];
    for (int j = 0; j < input.length - 1; j++) {
      input[j] = input[j + 1];
    }
    input[input.length - 1] = tempStr;
    return input;
  }

  public static void main(String[] args)
  {
    ArrayList<ArrayList<String>> str = new ArrayList<ArrayList<String>>();
    
    String array[] =  {"My name is Kameron Jusseaume"};
    str = generateAllStrings(array);

    System.out.println(str.get(0));

    for (int i = 0; i < str.size(); i++) {
      for (int j = 0; j < str.get(i).size(); j++) {
          System.out.println(str.get(i).get(j) + " ");
      }
      System.out.println();
  }
  }
}
