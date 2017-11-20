package by.epam.baronina.task6;


import java.util.Arrays;

public class Student {
  private int [] arrayMarks;

  public int[] getArrayMarks() {
    return this.arrayMarks;
  }

  public void setArrayMarks(int[] arrayMarks) {
    this.arrayMarks = arrayMarks;
  }

  public boolean isStudentWeak() {
    for (int i = 0; i <arrayMarks.length; i++) {
      if(arrayMarks[i]>3){
        return false;
      }
    }
    return true;
  }

  public boolean isStudentExcellent() {
    for (int i = 0; i <arrayMarks.length; i++) {
      if(arrayMarks[i]<8){
        return false;
      }

    }
    return true;
  }

  public double calculateAverageMark() {
    int sum=0;
    for (int i = 0; i < arrayMarks.length; i++) {
      sum=sum+arrayMarks[i];
    }
    double average = sum/arrayMarks.length;
    return average;
  }

  @Override
  public String toString() {
    return "Student{" +
        "arrayMarks=" + Arrays.toString(arrayMarks) +
        '}';
  }
}
