import java.util.ArrayList;

public class CircularShifter {

  public ArrayList<String> generateAllStrings(String string) {
    String[] input = string.split(" ");
    ArrayList<String> shiftedStrings = new ArrayList<String>();
    for (int i = 0; i < input.length; i++) {
      String[] shifted = rightShifter(input);
      shiftedStrings.add(String.join(" ", shifted));
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
