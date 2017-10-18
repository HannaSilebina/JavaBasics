package by.epam.baronina;


import java.util.Scanner;

public class Task10 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Введите количество чисел");
    while (!sc.hasNextInt()) {
      sc.next();
    }
    int n = sc.nextInt();

    int parity=0;
    int counter=0;

    for (int i = 0; i < n; i++) {
      System.out.println("Введите число");
      while (!sc.hasNextDouble()) {
        sc.next();
      }
      double a = sc.nextDouble();
      int aCutted = (int) a;

      if(aCutted%2==0){
       parity=parity+1;
      }

      if(aCutted<15){
        counter=counter+1;
      }
    }

    System.out.println("Четные "+parity);
    System.out.println("Меньше 15 "+counter);
  }
}
