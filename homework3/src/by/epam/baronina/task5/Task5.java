package by.epam.baronina.task5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {

  public static void main(String[] args) {
    int k = readKFromConsole();
    Fraction[] masFraction = new Fraction[k];
    fillArray(masFraction);

    System.out.println(Arrays.asList(masFraction));
  }

  private static void fillArray(Fraction[] masFraction) {
    Random random = new Random();
    for (int i = 0; i < masFraction.length; i++) {
      Fraction fraction = new Fraction();
      fraction.setM(1 + random.nextInt(10));
      fraction.setN(1 + random.nextInt(10));

      masFraction[i]=fraction;
    }
  }

  private static int readKFromConsole() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите число ячеек в массиве ");
    while (!sc.hasNextInt()){
      sc.next();
    }
    return sc.nextInt();
  }

}
