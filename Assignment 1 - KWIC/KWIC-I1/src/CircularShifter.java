import java.util.ArrayList;

public class CircularShifter {
  String[] input;

  CircularShifter(String string) {
    this.input = string.split(" ");
  }

  public ArrayList<String> shift() {
    ArrayList<String> shiftedStrings = new ArrayList<String>();
    shiftedStrings.add(String.join(" ", this.input));
    for (int i = 1; i < this.input.length; i++) {
      String[] tempArr = this.input;
      String tempStr = tempArr[0];
      for (int j = 0; j < tempArr.length - 1; j++) {
        tempArr[j] = tempArr[j + 1];
      }
      tempArr[tempArr.length - 1] = tempStr;
      this.input = tempArr;
      shiftedStrings.add(String.join(" ", this.input));
    }
    return shiftedStrings;
  }
}
