import java.util.Scanner;
/*
Name: Kaan Montplaisir
UIN: 627003014
Date: 9/7/2020
Assignment: Lab Work Week 4.2
*/

/*Instructions: Welcome to the TREN zoo. This zoo only has animals that end with the letters
                  T,R,E, and N, and are at least 4 letters long.
                Write a switch statement for our zoo animals that prints out part of the animal
                  based on what the last letter of that animal is.
                Here is the guide on what to print based on the last letter:
                    If the last letter is "T",
                        Print out the first letter of the animal.
                    If the last letter is "R",
                        Print out the first 2 letters of the animal.
                    If the last letter is "E",
                        Print out the first 3 letters of the animal.
                    If the last letter is "N",
                        Print out the first 4 letters of the animal.
                    If the last letter is neither T,R,E, or N,
                        Print out "We do not have ______ at the TREN zoo."
*/

class lab4_2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String animal;
    System.out.println("Please enter a zoo animal.");
    animal = input.nextLine();
    String last; // Set equal to last character of animal
    last = animal.substring(animal.length() - 1, animal.length());
    //finds the last letter in a animal's name
    switch(last){
      case "t":
        System.out.println(animal.substring(0,1));
        break;
      case "r":
        System.out.println(animal.substring(0,2));
        break;
        //won't be doing if else stuff for this since i don't know how many animals are only two letters long
      case "e":
      if (animal.length()>=3){
        System.out.println(animal.substring(0,3));
        }
      else if (animal.length() < 3){
        System.out.println(animal);
      } //stuff like this is in place to make sure it prints normally if the string is less then 4 units in length
        break;
      case "n":
        if (animal.length()>=4){
          System.out.println(animal.substring(0,4));
          }
        else if (animal.length() < 4){
          System.out.println(animal);
        } //stuff like this is in place to make sure it prints normally if the string is less then 4 units in length
        break;
      default:
        System.out.println("We do not have " + animal + " at the TREN zoo.");
    }

  } //end main
} //end class
