import java.util.ArrayList;

public class CircularShifter {
  String[] input;

  CircularShifter(String string) {
    this.input = string.split(" ");
  }

  public ArrayList<String> generateAllStrings() {
    ArrayList<String> shiftedStrings = new ArrayList<String>();
    for (int i = 0; i < this.input.length; i++) {
      shiftedStrings.add(String.join(" ", rightShifter()));
    }
    return shiftedStrings;
  }

  private String[] rightShifter() {
    String[] tempArr = this.input;
    String tempStr = tempArr[0];
    for (int j = 0; j < tempArr.length - 1; j++) {
      tempArr[j] = tempArr[j + 1];
    }
    tempArr[tempArr.length - 1] = tempStr;
    this.input = tempArr;
    return this.input;
  }
}
