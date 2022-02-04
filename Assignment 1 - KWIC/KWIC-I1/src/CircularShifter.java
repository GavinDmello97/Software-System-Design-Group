import java.util.ArrayList;

public class CircularShifter {

  public ArrayList<ArrayList<String>> generateAllStrings(String[] stringArr) {
    ArrayList<ArrayList<String>> shiftedStrings = new ArrayList<ArrayList<String>>();

    for (var p = 0; p < stringArr.length; p++) {
      ArrayList<String> currentStringArr = new ArrayList<String>();
      String string = stringArr[p];
      String[] input = string.split(" ");
      for (int i = 0; i < input.length; i++) {
        String[] shifted = rightShifter(input);
        currentStringArr.add(String.join(" ", shifted));
      }
      shiftedStrings.add(currentStringArr);
    }
    return shiftedStrings;
  }

  private String[] rightShifter(String[] input) {
    String[] tempArr = input;
    String tempStr = tempArr[0];
    for (int j = 0; j < tempArr.length - 1; j++) {
      tempArr[j] = tempArr[j + 1];
    }
    tempArr[tempArr.length - 1] = tempStr;
    return tempArr;
  }
}
