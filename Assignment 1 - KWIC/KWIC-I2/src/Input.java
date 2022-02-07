/*
Gavin D'mello
CIS 532-01 Assignment 1
Implementation 1 -  Keyboard Input for multiple lines 
*/

import java.text.*;
import java.util.*;

public class Input {

  public void readFile(LineStorage lineStorage) {
    new Timer()
    .scheduleAtFixedRate(
        new TimerTask() {

          @Override
          public void run() {
            Date dNow = new Date();
            SimpleDateFormat ft = new SimpleDateFormat(
              "E yyyy.MM.dd 'at' hh:mm:ss a zzz"
            );
            lineStorage.appendNewLine("line " + ft.format(dNow));
            // here goes your code to delay
          }
        },
        0,
        1000
      );
  }
}
