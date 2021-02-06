import java.util.Scanner;
/*
Name: Kaan Montplaisir
UIN: 627003014
Date: 9/7/2020
Assignment: Lab Work Week 3.2
*/

/*Instructions: Given the cylinderRadius, piValue, and cylinderHeight, compute
                the volume of a cylinder and assign cylinderRadius and cylinderHeight
                with the result. Use Scanner to obtain the radius and height values.
            **Volume of a cylinder = π*(r^2)*h
Print out the cylinder's volume using cylinderVolume in the following format:
"The volume of a cylinder with a radius of ______ and a height of _______ is ___________."
*/

class lab3_2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double piValue = 3.14159;
    double cylinderRadius;
    double cylinderHeight;
    double cylinderVolume;

    System.out.println("What is the cylinder's radius?");
    cylinderRadius = input.nextDouble();

    System.out.println("What is the cylinder's height?");
    cylinderHeight = input.nextDouble();

    cylinderVolume = piValue*((cylinderRadius*cylinderRadius)*cylinderHeight);
    System.out.println("The volume of a cylinder with a radius of " + cylinderRadius + " and a height of " + cylinderHeight + " is around " + cylinderVolume + ".");

  } //end main
} //end class
