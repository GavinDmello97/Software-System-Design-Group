/*Kameron Jusseaume
CIS 532-01 Assignment 1
Implementation 2 - Circular Shifter
*/
import java.util.ArrayList;
import java.util.HashMap;


public class CircularShifter {

  private static ArrayList<ArrayList<String>> shiftedStrings = new ArrayList<ArrayList<String>>();

  private static void generateAllStrings(HashMap str) {
    // ArrayList to store all the circular shifter strings
    
    for (int p = 0; p < str.size(); p++) {
      ArrayList<String> currentStringArr = new ArrayList<String>();
      String[] input = (String[]) str.get("words");
      for (int i = 0; i < input.length; i++) {
        String[] shifted = rightShifter(input);
        System.out.println("Shifted Lines:" + shifted);

        /*Ignore the circular shifted string if it is not "interesting"*/
        if(shifted[0].equalsIgnoreCase("is") || shifted[0].equalsIgnoreCase("the") 
          || shifted[0].equalsIgnoreCase("of") || shifted[0].equalsIgnoreCase("and") 
          || shifted[0].equalsIgnoreCase("as") || shifted[0].equalsIgnoreCase("a")
          || shifted[0].equalsIgnoreCase("after") || shifted[0].equalsIgnoreCase("are"))
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
  }

  /*Used to get a specified line from the list of circular shifted inputs*/
  public ArrayList<ArrayList<String>> getLine(LineStorage lineStorage)
  {
    ArrayList<HashMap> str = lineStorage.getLines();
    for(int i = 0; i < str.size(); i++)
    {
      generateAllStrings(str.get(i));
    }
    return (shiftedStrings);
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

  /* This was used for testing the implementation 
  public static void main(String[] args)
  {
    
    String array[] =  {"My name is Kameron Jusseaume", "we are code busters"};
    ArrayList<HashMap> str = new ArrayList<HashMap>();
    str = LineStorage.getLines();
    System.out.println(str.get(0));

    System.out.println(str);

    
    for (int i = 0; i < str.size(); i++) {
      for (int j = 0; j < str.get(i).size(); j++) {
          System.out.println(str.get(i).get(j) + " ");
      }
      System.out.println();
    
  }
}
*/
}
