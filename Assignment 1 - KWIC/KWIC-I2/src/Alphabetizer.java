import java.util.ArrayList;
import java.util.Arrays;

//https://www.programcreek.com/2010/10/sort-content-in-a-file/

// import java.util.Collections;

public class Alphabetizer {

  public ArrayList<String> alphabetize(ArrayList<String> circularShifts) {
    //Create a new arraylist to hold the alphabetized list
    ArrayList<String> result = new ArrayList<String>(); //Atefeh - result instead circularShifts

    // sorting each element of the array list using merge sort = Arrays.sort()
    for (int i = 0; i < circularShifts.size(); i++) {
      Arrays.sort(circularShifts.get(i), String.CASE_INSENSITIVE_ORDER);
      for (int p = 0; p < circularShifts.get(i).size(); p++) {
        result.add(circularShifts.get(i).get(p));
      }
    }

    //return the ordered list to be stored and output by the main module
    return result; //Atefeh - result instead circularShifts
  }
}
