package by.epam.baronina;


import java.util.Scanner;

public class Task16 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите радиус");
    while (!sc.hasNextDouble()) {
      sc.next();
    }
    double r = sc.nextDouble();
    double l = 2*Math.PI*r;
    double s = Math.PI*Math.pow(r,2);
    System.out.println("Длинна окружности "+l);
    System.out.println("Площадь круга "+s);
  }

}
