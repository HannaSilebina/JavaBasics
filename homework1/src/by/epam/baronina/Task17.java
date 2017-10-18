package by.epam.baronina;

import java.util.Scanner;

public class Task17 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите x");
    while (!sc.hasNextDouble()) {
      sc.next();
    }
    double x = sc.nextDouble();
    if(x<=-3){
      System.out.println(9);
    }
    if(x>3){
      double value=1/(Math.pow(x,2)+1);

      System.out.println(value);
    }
  }

}
