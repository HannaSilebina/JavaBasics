package by.epam.baronina.task6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task6 {

  public static void main(String[] args) {
    int studentNumber = readKFromConsole();

    Student[] studentsArray = createAndFillStudentsArray(studentNumber);
    System.out.println(Arrays.toString(studentsArray));

    calculateAverage(studentsArray);
    calculateExcellentStudents(studentsArray);
    calculateWeakStudents(studentsArray);
    calculateGroupAverage(studentsArray);
  }

  private static void calculateGroupAverage(Student[] studentsArray) {
    Group group = new Group(studentsArray);
    double averageMark = group.getAverageMark();
    System.out.println("Средний балл группы " + averageMark);
  }

  private static void calculateWeakStudents(Student[] studentsArray) {
    int counter=0;
    for (int i = 0; i < studentsArray.length ; i++) {
      Student student = studentsArray[i];
      if (student.isStudentWeak()) {
        counter++;
      }
    }
    System.out.println("Количество двоечников " + counter);
  }



  private static void calculateExcellentStudents(Student[] studentsArray) {
    int counter=0;
    for (int i = 0; i < studentsArray.length ; i++) {
      Student student = studentsArray[i];
      if (student.isStudentExcellent()) {
        counter++;
      }
    }
    System.out.println("Количество отличников " + counter);
  }

  private static void calculateAverage(Student[] studentsArray) {
    for (int i = 0; i < studentsArray.length ; i++) {
      Student student= studentsArray[i];
      double averageMark = student.calculateAverageMark();
      System.out.println("Средний балл "+ averageMark);
    }
  }

  private static Student[] createAndFillStudentsArray(int studentNumber) {
    Student[] studentsArray = new Student[studentNumber];
    for (int i = 0; i < studentNumber; i++){
      Student student = createAndFillStudent();
      studentsArray[i] = student;
    }
    return studentsArray;
  }

  private static int readKFromConsole() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите число ячеек в массиве ");
    while (!sc.hasNextInt()){
      sc.next();
    }
    return sc.nextInt();
  }

  private static Student createAndFillStudent(){
    Student student = new Student();
    int [] arrayMarks = createAndFillMarksArray(5);
    student.setArrayMarks(arrayMarks);
    return student;
  }

  private static int[] createAndFillMarksArray(int n) {
    int [] arrayMarks = new int[n];

    Random rand = new Random();
    for (int i = 0; i < arrayMarks.length; i++) {
      arrayMarks[i] = 1 + rand.nextInt(9);
    }

    return arrayMarks;
  }

}