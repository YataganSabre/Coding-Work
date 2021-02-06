import java.util.Scanner;
/*
Name: Kaan Montplaisir
UIN: 627003014
Date: 9/29/2020
Assignment: Lab Work Week 7.1
*/

/*Instructions: Refer to the instructions on Canvas.
*/

class lab7_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    welcome();
    String dog_name = dogName(input);
    System.out.println("Your dog's name is " + dog_name + ". That is so cute!\n");
    System.out.print("Let's convert " + dog_name + "'s age into dog years! How old is " + dog_name + "? ");
    int dog_age = input.nextInt();
    dogYears(dog_age);
    exit();


  } //end main

  public static void welcome(){
    System.out.println("Hello! Welcome to the program.\n");
  }//end welcome

  public static String dogName(Scanner input){
    System.out.print("What is your dog's name? ");
    String dog_name = input.nextLine();
    return dog_name;
  }//end dogName

  public static void dogYears(int dog_age){
    dog_age *= 7;
    System.out.println("Your dog is " + dog_age + " years old in human years!\n");
  }//end dogYears

  public static void exit(){
    System.out.println("Thanks for stopping by!");
  }//end exit
} //end class
