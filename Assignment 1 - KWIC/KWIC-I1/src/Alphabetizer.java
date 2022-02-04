import java.util.ArrayList;
import java.util.Collections;

public class Alphabetizer {

  public ArrayList<String> alphabetize(ArrayList<String> circularShifts) {
    /* This was used for testing
        String array[] =  {"My name is Gavin D'mello", 
        "name is Gavin D'mello My", 
        "is Gavin D'mello My name", 
        "Gavin D'mello My name is", 
        "D'mello My name is Gavin"};
        Arrays.sort(array);
        System.out.printf("Modified arr[] : \n%s\n\n",
                          Arrays.toString(array));
        */

    Collections.sort(circularShifts, String.CASE_INSENSITIVE_ORDER);
    return circularShifts;
  }
}
