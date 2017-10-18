package by.epam.baronina;


import java.util.Scanner;

public class Task8 {
  public static void main(String[]args) {

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

    if(a==b){
      System.out.println("Скоро Новый год!");
    }
    else{
      System.out.println("Введите c");
      while (!sc.hasNextDouble()) {
        sc.next();
      }
      double c = sc.nextDouble();
      double sum=a+b+c;
      double sum2=(a*a+b*b);
      System.out.println(sum);
      System.out.println(sum2);
      System.out.println("моя любимая футбольная команда");
    }
    }
  }

