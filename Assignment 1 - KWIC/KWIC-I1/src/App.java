import java.util.ArrayList;

public class App {

  public static void main(String[] args) throws Exception {
    CircularShifter cs = new CircularShifter("My name is Gavin D'mello");
    ArrayList<String> csResult = cs.shift();
    System.out.println(csResult);
  }
}
