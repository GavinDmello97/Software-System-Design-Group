import java.util.ArrayList;

public class App {

  public static void main(String[] args) throws Exception {
    ArrayList<String> csResult = new CircularShifter()
    .generateAllStrings("My name is Gavin D'mello");
    System.out.println(csResult);
  }
}
