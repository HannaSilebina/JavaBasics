package by.epam.baronina;


import java.util.Scanner;

public class Task5 {

  public static void main(String[] args) {
    double sum = 0;

    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 4; i++) {
      System.out.println("Введите переменную " + (i + 1));
      while (!sc.hasNextDouble()) {
        sc.next();
      }
      double a = sc.nextDouble();
      sum = sum + a;

    }

    System.out.println("Сумма переменных=" + sum);

  }
}
