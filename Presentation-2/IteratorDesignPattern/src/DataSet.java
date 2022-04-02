import java.text.DecimalFormat;
import java.util.Random;

public class DataSet {
  private static final DecimalFormat df = new DecimalFormat("0.00");
  //static data
  public static StudentDetail[] studentDetails = {
    new StudentDetail("001", "Lora", true, 3.48),
    new StudentDetail("002", "John", true, 3.19),
    new StudentDetail("003", "Tim", false, 4.0),
    new StudentDetail("004", "Pat", true, 3.09),
    new StudentDetail("005", "Mathew", false, 4.0),
    new StudentDetail("006", "James", false, 3.36),
    new StudentDetail("007", "Richard", true, 4.0),
    new StudentDetail("008", "Jonathan", false, 3.81),
    new StudentDetail("009", "Petricia", false, 3.97),
    new StudentDetail("010", "Mystic", true, 3.55),
    new StudentDetail("011", "Atishey", true, 4.0),
    new StudentDetail("012", "Kame", true, 4.0),
    new StudentDetail("013", "Jason", true, 3.91),
    new StudentDetail("014", "Timothy", false, 3.21),
    new StudentDetail("015", "Simon", true, 3.81),
  };

  //dynamic data
  public static StudentDetail[] getStudentList() {
    int studentCount = (int) Math.floor(Math.random() * 20 + 10);

    StudentDetail[] std = new StudentDetail[studentCount];
    Random rd = new Random();
    for (int i = 0; i < studentCount; i++) {
      double gpa = Double.parseDouble(df.format(Math.random() * 5.00 + 2.00));
      if (gpa > 4.00) {
        gpa = 4.00;
      }

      std[i] =
        new StudentDetail(
          String.format("%03d", i + 1),
          "" + ((char) (i + 65) + "XXXXXXXXXX"),
          rd.nextBoolean(),
          gpa
        );
    }
    return std;
  }
}
