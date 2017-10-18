package by.epam.baronina;

import java.util.Scanner;

public class Task15 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Введите a");
    while (!sc.hasNextDouble()) {
      sc.next();
    }
    double a = sc.nextDouble();

    System.out.println("Введите b");
    while (!sc.hasNextDouble()) {
      sc.next();
    }
    double b = sc.nextDouble();

    System.out.println("Введите h");
    while (!sc.hasNextDouble()) {
      sc.next();
    }
    double h = sc.nextDouble();

    System.out.println("-----");
    System.out.println("|x|y|");
    for (double x = a; x <= b; x = x + h) {
      double y = 2 * Math.tan(x/2) + 1;
      System.out.println("|" + x + "|" + y +"|");
    }
    System.out.println("-----");

  }

}
