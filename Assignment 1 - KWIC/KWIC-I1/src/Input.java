import java.util.*;

public class Input {

  public String[] keyboard() {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter the number of lines:  ");
    int length = keyboard.nextInt();
    String[] inputArray = new String[length];
    keyboard.nextLine();
    for ( var i = 0; i < length; i++) {
      inputArray[i] = keyboard.nextLine();
    }
    return inputArray;
  }
}
