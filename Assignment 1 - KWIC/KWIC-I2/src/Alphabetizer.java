/*
Atefeh Rahmani
CIS 532-01 Assignment 1
Implementation 1 -  Keyboard Input for multiple lines 
*/

import java.util.ArrayList;
import java.util.Collections;

public class Alphabetizer {

  public ArrayList<String> alphabetize(
    ArrayList<ArrayList<String>> listOfLinesList
  ) {
    //Create a new arraylist to hold the alphabetized list

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

    //Sort each element of the arraylist while also accounting for multiple different input strings
    // for (int i = 0; i < circularShiftsArr.size(); i++) {
    //   Collections.sort(circularShiftsArr.get(i), String.CASE_INSENSITIVE_ORDER);
    //   for (int p = 0; p < circularShiftsArr.get(i).size(); p++) {
    //     result.add(circularShiftsArr.get(i).get(p));
    //   }
    // }
    ArrayList<String> result = new ArrayList<String>();
    for (int p = 0; p < listOfLinesList.size(); p++) {
      ArrayList load = listOfLinesList.get(p);
      for (int q = 0; q < load.size(); q++) {
        for (int r = q + 1; r < load.size(); r++) {
          // Compare strings to eachother in order to alphabetize, also taking into account the case
          if (
            load
              .get(q)
              .toString()
              .toLowerCase()
              .compareTo(load.get(r).toString().toLowerCase()) >
            0
          ) {
            String temp = (String) load.get(q);
            load.set(q, load.get(r));
            load.set(r, temp);
          }
        }
      }

      //Add the alphabetized strings to the result
      for (int s = 0; s < load.size(); s++) {
        result.add((String) load.get(s));
      }
    }

    //return the ordered list to be stored and output by the main module
    return result;
  }
}
