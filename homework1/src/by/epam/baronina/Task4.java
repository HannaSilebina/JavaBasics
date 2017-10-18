package by.epam.baronina;

import java.util.Scanner;

public class Task4 {
  public static void main(String[] args) {
    double cat1;
    double cat2;
    double gip, s;

    Scanner sc = new Scanner(System.in);
    System.out.println("Введите катет 1");
    while (!sc.hasNextDouble()) {
      sc.next();
    }
    cat1 = sc.nextDouble();

    System.out.println("Введите катет 2");
    while (!sc.hasNextDouble()) {
      sc.next();
    }
    cat2 = sc.nextDouble();

    gip = Math.sqrt(cat1 * cat1 + cat2 * cat2);
    System.out.println("Гипотенуза треугольника=" + gip);

    s = cat1 * cat2 / 2;
    System.out.println("Площадь треугольника=" + s);
  }
}
