package by.epam.baronina;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {

  public static void main(String[] args) {
    int n = readNFromConsole();
    double[] mas = createAndEnterArrayWithRandom(n);
    System.out.println(Arrays.toString(mas));
    boolean isIncreasing = checkArray(mas);
    System.out.println(isIncreasing);
  }

  private static boolean checkArray(double[] mas) {
    if (mas.length > 1) {
      for (int i = 0; i < mas.length - 1; i++) {
        if (mas[i] > mas[i + 1]) {
          return false;
        }
      }
    }
    return true;
  }

  private static int readNFromConsole() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите число ячеек в массиве ");
    while (!sc.hasNextInt()){
      sc.next();
    }

    return sc.nextInt();
  }

  public static double[] createAndEnterArrayWithRandom(int n) {
    double[] mas = new double[n];
    Random rand = new Random();
    for (int i = 0; i < mas.length; i++) {
      mas[i] = rand.nextDouble();
    }
    return mas;
  }

}
