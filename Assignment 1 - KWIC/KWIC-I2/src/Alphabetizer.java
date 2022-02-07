import java.util.ArrayList;
import java.util.Collections;

public class Alphabetizer {

  public ArrayList<String> alphabetize(
    ArrayList<ArrayList<String>> circularShiftsArr
  ) {
    ArrayList<String> result = new ArrayList<String>();
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
    for (int i = 0; i < circularShiftsArr.size(); i++) {
      Collections.sort(circularShiftsArr.get(i), String.CASE_INSENSITIVE_ORDER);
      for (int p = 0; p < circularShiftsArr.get(i).size(); p++) {
        result.add(circularShiftsArr.get(i).get(p));
      }
    }

    return result;
  }
}
