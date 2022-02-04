import java.util.ArrayList;

public class App {

  public static void displayOutput(ArrayList<String> resultArray) {
    resultArray.forEach(elem -> System.out.println(new String(elem)));
  }

  public static void main(String[] args) throws Exception {
    ArrayList<String> circularShiftResult = new CircularShifter()
    .generateAllStrings("My name is Gavin D'mello");
    // System.out.println(circularShiftResult);

    ArrayList<String> alphabetizerResult = new Alphabetizer()
    .alphabetize(circularShiftResult);
    System.out.println("\n\n");

    //Output
    displayOutput(alphabetizerResult);
  }
}
