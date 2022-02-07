/*
Gavin D'mello
CIS 532-01 Assignment 1
Implementation 1 -  Keyboard Input for multiple lines 
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Input {

  public void readFile(LineStorage lineStorage) {
    BufferedReader bReader = null;
    try {
      String currentLine;
      bReader = new BufferedReader(new FileReader("Input.txt"));
      int i = 1;
      while ((currentLine = bReader.readLine()) != null) {
        if (currentLine.length() > 0) {
          lineStorage.appendNewLine(currentLine, i);
          i++;
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (bReader != null) bReader.close();
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }
  }
}
