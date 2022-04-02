class StudentDetail {
  String id;
  String name;
  boolean isGraduated;
  double GPA;

  StudentDetail(String id, String name, boolean isGraduated, double GPA) {
    this.id = id;
    this.name = name;
    this.isGraduated = isGraduated;
    this.GPA = GPA;
  }
}

public class StudentDetailRepository implements Container {
  private boolean hasAtleastOneElement = false;
  public StudentDetail[] studentDetails = DataSet.getStudentList();

  //   public StudentDetail[] studentDetails = DataSet.studentDetails;

  @Override
  public Iterator getIterator(boolean isGraduated, boolean isFourPointer) {
    return new NameIterator(isGraduated, isFourPointer);
  }

  private class NameIterator implements Iterator {
    int index;
    boolean isGraduated, isFourPointer;

    NameIterator(boolean isGraduated, boolean isFourPointer) {
      this.isGraduated = isGraduated;
      this.isFourPointer = isFourPointer;
    }

    @Override
    public boolean hasNext() {
      if (index < studentDetails.length) {
        if (
          studentDetails[index].isGraduated == isGraduated &&
          !hasAtleastOneElement
        ) {
          System.out.println("ID          Name                    GPA");
          hasAtleastOneElement = true;
        } else if (
          index == studentDetails.length - 1 && !hasAtleastOneElement
        ) {
          System.out.println("No students found");
          hasAtleastOneElement = true;
        }
        return true;
      }
      return false;
    }

    @Override
    public void next() {
      if (this.hasNext()) {
        if (isGraduated || isFourPointer) {
          if (
            isGraduated &&
            isFourPointer &&
            studentDetails[index].isGraduated == true &&
            studentDetails[index].GPA == 4.0
          ) {
            print(index);
          } else if (
            !isGraduated && isFourPointer && studentDetails[index].GPA == 4.0
          ) {
            print(index);
          } else if (
            isGraduated &&
            !isFourPointer &&
            studentDetails[index].isGraduated == true
          ) {
            print(index);
          }
        } else {
          print(index);
        }
        index++;
      }
    }
  }

  private void print(int index) {
    System.out.println(
      String.format("%-12s", studentDetails[index].id) +
      "" +
      String.format("%-24s", studentDetails[index].name) +
      "" +
      String.format("%-5s", studentDetails[index].GPA)
    );
  }
}
