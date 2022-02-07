import java.util.ArrayList;
import java.util.Arrays;

//https://www.programcreek.com/2010/10/sort-content-in-a-file/

// import java.util.Collections;

public class Alphabetizer {

  private ArrayList<String> circularShifts;

  public ArrayList<String> alphabetize(ArrayList<String> circularShifts) {
    //Create a new arraylist to hold the alphabetized list
    ArrayList<String> result = new ArrayList<String>(); 

    // sorting each element of the array list using merge sort = Arrays.sort()
    for (int i = 0; i < circularShifts.size(); i++) {
      this.circularShifts = circularShifts;
      Arrays.sort(this.circularShifts.getLine(i), String.CASE_INSENSITIVE_ORDER);
      for (int p = 0; p < circularShifts.getLine(i).size(); p++) {
        result.add(circularShifts.getLine(i).getLine(p));
      }
    }

    //return the ordered list to be stored and output by the main module
    return result; 
  }
}
