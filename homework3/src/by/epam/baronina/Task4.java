package by.epam.baronina;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {

  public static void main(String[] args) {
    int n = readNFromConsole();
    int[] mas = createAndEnterArrayWithRandom(n);
    int numberOfEvens = calculateEvenNumbers(mas);
    if (numberOfEvens == 0) {
      System.out.println("Нет четных чисел");
    } else {
      int[] masEvens = createAndFillArray(numberOfEvens, mas);
      System.out.println(Arrays.toString(masEvens));
    }
  }

  private static int readNFromConsole() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите число ячеек в массиве ");
    while (!sc.hasNextInt()){
      sc.next();
    }

    return sc.nextInt();
  }

  private static int[] createAndFillArray(int numberOfEvens, int[] mas) {
    int[] masEvens = new int[numberOfEvens];

    int j = 0;
    for(int i=0; i<mas.length; i++){
      if(mas[i]%2==0){
        masEvens[j]=mas[i];
        j++;
      }
    }

    return masEvens;
  }

  private static int calculateEvenNumbers(int[] mas) {
    int numberOfEvens=0;
    for(int i=0; i<mas.length; i++){
      if(mas[i]%2==0){
        numberOfEvens++;
      }
    }
    return numberOfEvens;
  }

  public static int[] createAndEnterArrayWithRandom(int n) {
    int[] mas = new int[n];
    Random rand = new Random();
    for (int i = 0; i < mas.length; i++) {
      mas[i] = 1 + rand.nextInt(9);
    }

    return mas;
  }

}
