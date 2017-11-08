package by.baronina;

import java.util.Scanner;

public class Task4 {

  public static void main(String[] args) {
    int[] mas = new int[10];
    enterArrayFromConsole(mas);
    findMaxElementAndIndex(mas);
    findMinElementAndIndex(mas);
  }

  public static void enterArrayFromConsole(int[] mas) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < mas.length; i++) {
      System.out.print("ar[" + i + "]=>");
      mas[i] = sc.nextInt();
    }
  }

  public static void findMaxElementAndIndex(int[] mas) {
    if (mas.length == 0) {
      return;
    }
    int max; int index;
    max = mas[0];
    index = 0;
    for (int i = 1; i < mas.length; i++) {
      if (max < mas[i]) {
        max = mas[i];
        index = i;
      }
    }
    System.out.println("Максимальный элемент " + max + " расположен на позиции " + index + ".");
  }

  public static void findMinElementAndIndex(int[] mas) {
    if (mas.length == 0) {
    return;
    }
    int min; int index;
    min = mas[0];
    index = 0;

    for (int i = 1; i < mas.length; i++) {
      if (min > mas[i]) {
        min = mas[i];
        index = i;
      }
    }
    System.out.println("Минимальный элемент " + min + " расположен на позиции " + index + ".");
  }
}
