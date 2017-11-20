package by.epam.baronina;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {

  public static void main(String[] args) {
    int n = readNFromConsole();
    int[] mas = createAndEnterArrayWithRandom(n);
    int numberOfZeros = calculateZeros(mas);
    int[] masZeroIndexes = createAndFillArray(numberOfZeros, mas);
    System.out.println(Arrays.toString(masZeroIndexes));
  }

  private static int readNFromConsole() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите число ячеек в массиве ");
    while (!sc.hasNextInt()){
      sc.next();
    }

    return sc.nextInt();
  }

  private static int[] createAndFillArray(int numberOfZeros, int[] mas) {
    int[] masZeroIndexes = new int[numberOfZeros];

    int j = 0;
    for(int i=0; i<mas.length; i++){
      if(mas[i]==0){
        masZeroIndexes[j]=i;
        j++;
      }
    }

    return masZeroIndexes;
  }

  private static int calculateZeros(int[] mas) {
    int numberOfZeros=0;
    for(int i=0; i<mas.length; i++){
      if(mas[i]==0){
        numberOfZeros++;
      }
    }
    return numberOfZeros;
  }

  public static int[] createAndEnterArrayWithRandom(int n) {
    int[] mas = new int[n];
    Random rand = new Random();
    for (int i = 0; i < mas.length; i++) {
      mas[i] = rand.nextInt(10);
    }

    return mas;
  }

}
