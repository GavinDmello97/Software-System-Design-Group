/*
Gavin D'mello
CIS 532-01 Assignment 1
Implementation 1 -  Line Storage  
*/

public class LineStorage {
  private String[] lines = new String[] {};

  public String[] getLines() {
    return lines;
  }

  public void appendNewLine(String line) {
    System.out.println(line);
    String newArray[] = new String[lines.length + 1];
    //copy original array into new array
    for (int i = 0; i < lines.length; i++) newArray[i] = lines[i];

    //add element to the new array
    newArray[newArray.length - 1] = line;
    lines = newArray;
  }
}
