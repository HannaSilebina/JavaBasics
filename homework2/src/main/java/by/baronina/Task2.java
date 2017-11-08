package by.baronina;


import java.util.Scanner;

public class Task2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Введите номер месяца");

    String month=sc.next();
    String season=null;

    int monthInt =Integer.valueOf(month);
    switch (monthInt){
      case 1:
      case 2:
       season = "Winter";
      break;
      case 3:
      case 4:
      case 5:
        season = "Spring";
        break;
      case 6:
      case 7:
      case 8:
        season = "Summer";
        break;
      case 9:
      case 10:
      case 11:
        season = "Autumn";
        break;
      default:
        System.out.println("There is no such season");
        break;
    }

    System.out.println("Season: " + season);
  }

}