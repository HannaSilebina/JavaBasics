package by.baronina;


import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) {
    double x = 0, y = 0;
    double sumResult=0;
    double mulResult=0;

    x=readDoubleFromConsole("Введите x ");
    y=readDoubleFromConsole("Введите y ");
    sumResult=sum(x,y);
    mulResult=mul(x,y);
    printToConsole("Сумма чисел" + sumResult);
    printToConsole("Произведение чисел"+mulResult);


  }

  public static double readDoubleFromConsole(String message) {
    Scanner sc = new Scanner(System.in);
    double x = 0;

    System.out.println(message);
    while (!sc.hasNextDouble()) {
      sc.next();
    }
    x=sc.nextDouble();

    return x;
  }

  public static void printToConsole (String message){
    System.out.println(message);
  }

  public static double sum(double x, double y){
    double sum;
    sum=x+y;
    return sum;
  }

  public static double mul(double x, double y){
    double mul;
    mul=x*y;
    return mul;
  }

}