/*
Gavin D'mello
CIS 532-01 Assignment 1
Implementation 1 -  Master Control  
*/

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

public class App {

  public static void displayOutput(ArrayList<String> resultArray) {
    // resultArray.forEach(elem -> System.out.println(new String(elem)));
  }

  public static void main(String[] args) throws Exception {
    LineStorage lineStore = new LineStorage(); // Initialized LineStorage for Global use
    new Input().readFile(lineStore); // Initialized Input and called readFile function
     
    
    //passing input from circular shifter to Alphabetizer()
    ArrayList<String> circularShiftResult = new CircularShifter().getLine();
    // System.out.println(circularShiftResult);

    ArrayList<String> alphabetizerResult = new Alphabetizer().alphabetize(circularShiftResult);
    //System.out.println("\n\n");

    // Creat output file
    File outputFile = new File("output.txt");
    if (outputFile.createNewFile()){
      System.out.println("Output File Created: "+ outputFile.getName());
    }else{
      System.out.println("Output File exists: "+ outputFile.getName());
    }

    // write string to a file, use DataOutputStream
    FileOutputStream fos = new FileOutputStream(outputFile);
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
    bw.write(alphabetizerResult);
    bw.close();
    
    //save results inside the output file
    //outputFile.write(alphabetizerResult);

    //Read from the file
    Scanner myReader = new Scanner("output.txt");
    while (myReader.hasNextLine()){
      String reader = myReader.nextLine();
      System.out.println(reader);
    }
    //outputFile.close();
    myReader.close();


    //displayOutput(alphabetizerResult);
  }
}
