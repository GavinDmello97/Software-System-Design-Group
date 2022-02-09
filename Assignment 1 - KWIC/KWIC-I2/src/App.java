/*
Gavin D'mello
CIS 532-01 Assignment 1
Implementation 1 -  Master Control  
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

  public static void displayOutput(ArrayList<String> resultArray)
    throws IOException {
    // resultArray.forEach(elem -> System.out.println(new String(elem)));
    // Creat output file
    String fileName = "Output.txt";
    FileWriter outputFile = new FileWriter(fileName);
    for (String str : resultArray) {
      outputFile.write(str + "\n");
    }
    outputFile.close();

    //save results inside the output file
    //outputFile.write(alphabetizerResult);

    //Read from the file
    readFile(fileName);
  }

  public static void readFile(String fileName) {
    BufferedReader bReader1 = null;
    try {
      String currentLine;
      bReader1 = new BufferedReader(new FileReader(fileName));
      while ((currentLine = bReader1.readLine()) != null) {
        if (currentLine.length() > 0) {
          System.out.println(currentLine);
        }
      }
    } catch (IOException e1) {
      e1.printStackTrace();
    } finally {
      try {
        if (bReader1 != null) bReader1.close();
      } catch (IOException ex1) {
        ex1.printStackTrace();
      }
    }
  }

  public static void main(String[] args) throws Exception {
    LineStorage lineStore = new LineStorage(); // Initialized LineStorage for Global use
    new Input().readFile(lineStore); // Initialized Input and called readFile function
    ArrayList<ArrayList<String>> circularShiftResult = new CircularShifter()
      .shiftLines(lineStore)
      .getAllLines();

    ArrayList<String> alphabetizerResult = new Alphabetizer()
    .alphabetize(circularShiftResult);

    displayOutput(alphabetizerResult);
  }
}
