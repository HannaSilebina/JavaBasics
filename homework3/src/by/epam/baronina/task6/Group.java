package by.epam.baronina.task6;

public class Group {

  private Student[] students;

  public Group(Student[] students) {
    this.students = students;
  }

  public double getAverageMark() {
    double average = 0;
    for (int i = 0; i < students.length; i++) {
      Student student = students[i];
      double studentAverage = student.calculateAverageMark();
      average = average + studentAverage;
    }
    double groupAverage = average / students.length;

    return groupAverage;
  }
}
