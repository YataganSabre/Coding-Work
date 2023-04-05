import java.util.Scanner;
/*
Name:Kaan Montplaisir
UIN: 627003014
Date: 9/21/2020
Assignment: Lab Work Week 6.2
*/

/*Instructions: Write a for loop that prints out every odd number between 1-100 in a new line,
                but it cannot print out multiples of 7.
*/

class lab6_2 {
  public static void main(String[] args) {
    for(int i = 1; i <= 100; i+=2){
        if(!(i%7 == 0))
        {
          System.out.println(i);
        }
    }




  } //end main
} //end class
