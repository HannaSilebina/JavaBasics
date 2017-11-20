package by.epam.baronina;


import java.util.Random;
import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) {
    int n=0;
    int k=0;
    int sum=0;

    Scanner sc = new Scanner(System.in);
    System.out.println("Введите число ячеек в массиве ");
    while (!sc.hasNextInt()){
      sc.next();
    }
    n = sc.nextInt();

    int[]mas = new int[n];
    enterArrayWithRandom(mas);

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число K");
    while (!scanner.hasNextInt()){
      scanner.next();
    }
    k=scanner.nextInt();

    for(int i=0; i<n; i++){
      if(mas[i]%k==0){
        sum=sum+mas[i];
      }
    }

    System.out.println("Сумма " + sum);
  }

  public static void enterArrayWithRandom(int[] mas) {
    Random rand = new Random();
    for (int i = 0; i < mas.length; i++) {
      mas[i] = rand.nextInt(300);
    }

  }
}