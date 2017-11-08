package by.baronina;

import java.util.Scanner;

public class Task3 {

  public static void main(String[] args) {
    String str1 = null;
    String str2 = null;
    str1 = readStringFromConsole("Введите строку 1");
    str2 = readStringFromConsole("Введите строку 2");

    if(str1.equals(str2)){
      System.out.println("str1 = str2");
    }
    else{
      System.out.println("str1< >str2");
    }

    if(str1==str2){
      System.out.println("str1 = str2");
    }
    else {
      System.out.println("str1< >str2");
    }
  }

  public static String readStringFromConsole(String message) {
    Scanner sc = new Scanner(System.in);
    String x = null;

    System.out.println(message);
    x = sc.next();

    return x;
  }
}

