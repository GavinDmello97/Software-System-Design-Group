import java.util.ArrayList;
import java.util.HashMap;

/*
Gavin D'mello
CIS 532-01 Assignment 1
Implementation 1 -  Line Storage  
*/

public class LineStorage {
  private ArrayList<HashMap> lines = new ArrayList<HashMap>();

  public ArrayList<HashMap> getLines() {
    return lines;
  }

  public void appendNewLine(String line, int index) {
    ArrayList<HashMap> tempArrayList = new ArrayList<HashMap>();
    //copy original array into new array
    for (int i = 1; i < lines.size() - 1; i++) tempArrayList.add(
      lines.get(i + 1)
    );
    //add element to the new array
    // tempArrayList.add(stringToObjectConverter(line, index));
    System.out.println(stringToObjectConverter(line, index));
    lines = tempArrayList;
  }

  private HashMap stringToObjectConverter(String input, int index) {
    HashMap lineDictionary = new HashMap<>();
    lineDictionary.put("id", String.valueOf(index));
    lineDictionary.put("text", input);
    lineDictionary.put("word_count", getWordCount(input));
    lineDictionary.put("words", getWordList(input, index));

    return lineDictionary;
  }

  private int getWordCount(String input) {
    return input.split(" ").length;
  }

  private ArrayList<HashMap> getWordList(String input, int index) {
    ArrayList<HashMap> result = new ArrayList<HashMap>();
    String[] wordArray = input.split(" ");
    for (int i = 0; i < wordArray.length; i++) {
      HashMap wordDictionary = new HashMap<>();
      wordDictionary.put("id", String.valueOf(i));
      wordDictionary.put("line_id", String.valueOf(index));
      wordDictionary.put("text", wordArray[i]);

      result.add(wordDictionary);
    }

    return result;
  }
}
