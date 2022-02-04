import java.io.*;
import java.text.*;
import java.util.*;

public class Input {

  public void readFile(LineStorage lineStorage) {
    BufferedReader reader;
    try {
      reader = new BufferedReader(new FileReader("Input.txt"));
      String line = reader.readLine();
      while (line != null) {
        // read next line
        lineStorage.appendNewLine("line " + line);
        line = reader.readLine();
      }
      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
