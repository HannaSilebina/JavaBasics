package by.epam.baronina;


import java.util.Scanner;

public class Task7 {
  public static void main(String[]args){

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

    if(a>b){
      System.out.println("Введите c");
      while (!sc.hasNextDouble()) {
        sc.next();
      }
      double c = sc.nextDouble();
      double sum=b+c;
      System.out.println(sum);
    }

    if(a==b){
      System.out.println("Конец");
    }

    if(a<b){
      System.out.println("Введите c");
      while (!sc.hasNextDouble()) {
        sc.next();
      }
      double c = sc.nextDouble();
      double sum=a+b+c;
      System.out.println(sum);
      System.out.println("Новый год!");
    }
  }
}
