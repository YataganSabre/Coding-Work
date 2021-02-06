import java.util.Scanner;
/*
Name: Kaan Montplaisir
UIN: 627003014
Date: 9/7/2020
Assignment: Lab Work Week 4.1
*/

/*Instructions: Write multiple if statements:
                If carYear is before 1967, print "Probably has few safety features." (without quotes).
                If after 1971, print "Probably has head rests.".
                If made in or after 1991, print "Probably has electronic stability control.".
                If after 2001, print "Probably has airbags.".
            End each phrase with a period and newline.
            Example: carYear = 1995 prints:
            Probably has head rests.
            Probably has electronic stability control.
*/

class lab4_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int carYear;

    System.out.print("Please enter your car's year: ");
    carYear = input.nextInt();
    if (carYear < 1967 ){
      System.out.println("Probably has few safety features.");
    }
    if (carYear > 1971 ){
      System.out.println("Probably has head rests.");
    }
    if (carYear >= 1991 ){
      System.out.println("Probably has electronic stability control.");
    }
    if (carYear > 2001 ){
      System.out.println("Probably has airbags.");
    }
  } //end main
} //end class
