package by.epam.baronina;


import java.util.Scanner;

public class Task13 {

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

    System.out.println("Введите c");
    while (!sc.hasNextDouble()) {
      sc.next();
    }
    double c = sc.nextDouble();

    System.out.println("Введите d");
    while (!sc.hasNextDouble()) {
      sc.next();
    }
    double d = sc.nextDouble();

    double value1 = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c +b;
    double value2 = (a/c)*(b/d)-(a*b-c)/(c*d);

    System.out.println("Первое выражение "+value1);
    System.out.println("Второе выражение "+value1);

  }
}
