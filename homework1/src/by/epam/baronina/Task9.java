package by.epam.baronina;


import java.util.Scanner;

public class Task9 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Введите количество чисел");
    while (!sc.hasNextInt()) {
      sc.next();
    }
    int n = sc.nextInt();

    int parity = 0;
    int sum = 0;
    int number = 0;

    for (int i = 0; i < n; i++) {
      System.out.println("Введите число");
      while (!sc.hasNextInt()) {
        sc.next();
      }
      int a = sc.nextInt();

      if (a % 2 == 0) {
        parity = parity + 1;
      }

      if (a % 3 == 0) {
        sum = sum + a;
      }
      if (Math.abs(a) < 3) {
        number = number + 1;
      }

    }

    System.out.println("Четные " + parity);
    System.out.println("Сумма кратных трем " + sum);
    System.out.println("Модуль меньше 3 " + number);

  }
}
