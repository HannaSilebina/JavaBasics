package by.epam.baronina;


import java.util.Scanner;

public class Task14 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
      System.out.println("Введите число");
      while (!sc.hasNextDouble()) {
        sc.next();
      }
      double a = sc.nextDouble();

      if (a >=0) {
        a = Math.pow(a,2);
        System.out.println(a);
      }
      else{
        a=Math.pow(a,4);
        System.out.println(a);
      }

    }

  }

}
