package by.epam.baronina;


import java.util.Scanner;

public class Task11 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Введите количество чисел");
    while (!sc.hasNextInt()) {
      sc.next();
    }
    int n = sc.nextInt();

    int counter = 0;
    int sum = 0;
    int number = 0;

    for (int i = 0; i < n; i++) {
      System.out.println("Введите число");
      while (!sc.hasNextInt()) {
        sc.next();
      }
      int a = sc.nextInt();

      if (a>15||a<2) {
        counter = counter + 1;
      }
      if(a % 5 == 4){
        sum=sum+a;
      }
    }
    System.out.println("Числи >15 или <2 "+counter);
    System.out.println("Сумма чисел подходящих под условие "+sum);
  }
}