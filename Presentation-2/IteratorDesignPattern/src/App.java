import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean graduated = true, fourPointer = true;
    System.out.println(
      "\n\n******** Iterator Pattern for Student Information ********"
    );

    System.out.println(
      "We have added a few filters show limited data from bulk datasets."
    );
    System.out.println(
      "Kindly type 'Y' and hit 'Enter' to select the filter\n" +
      String.format("%-16s", "") +
      "OR\nHit 'Enter' to skip the below filters"
    );

    System.out.print("Graduated: ");
    String temp1 = sc.nextLine();

    while (temp1.length() == 0 || temp1.charAt(0) != 'Y') {
      if (temp1.length() == 0) {
        graduated = false;
        break;
      } else {
        System.out.print("\nInvalid input! \nGraduated: ");
        temp1 = sc.nextLine();
      }
    }

    System.out.print("Four Pointer: ");
    String temp2 = sc.nextLine();

    while (temp2.length() == 0 || temp2.charAt(0) != 'Y') {
      if (temp2.length() == 0) {
        fourPointer = false;
        break;
      } else {
        System.out.print("\nInvalid input!\nGraduated: ");
        temp2 = sc.nextLine();
      }
    }
    System.out.println();

    // String sc.next();
    StudentDetailRepository studentDetailRepository = new StudentDetailRepository();

    for (
      Iterator iter = studentDetailRepository.getIterator(
        graduated,
        fourPointer
      );
      iter.hasNext();
    ) {
      iter.next();
    }
  }
}
