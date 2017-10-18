package by.epam.baronina;


import java.util.Scanner;

public class Task6 {

  public static void main(String[] args) {
    double a, b, c;
    double result;

    Scanner sc = new Scanner(System.in);
    System.out.println("Введите переменную a");
    while (!sc.hasNextDouble()) {
      sc.next();
    }
    a = sc.nextDouble();

    System.out.println("Введите переменную b");
    while (!sc.hasNextDouble()) {
      sc.next();
    }
    b = sc.nextDouble();

    System.out.println("Введите переменную c");
    while (!sc.hasNextDouble()) {
      sc.next();
    }
    c = sc.nextDouble();

    result = Math.pow(a, 2) - Math.pow((b - c), 2) + Math.log(Math.pow(b, 2) + 1);
    System.out.println("Result=" + result);
  }
}