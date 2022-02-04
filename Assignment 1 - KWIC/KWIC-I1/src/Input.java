import java.util.*;

public class Input {

  public String keyboard() {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter input: ");
    String input = keyboard.nextLine();
    return input;
  }
}
