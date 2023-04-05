import java.util.Scanner;
import java.util.*;
/*
Name: Kaan Montplaisir
UIN: 627003014
Date: 11/4/2020
Assignment: Lab Work Week 12.2
*/

/*Instructions: Read the provided instructions.

*/

class lab12_2 {

  public static void main(String[] args) { //imports class box into main to call for methods later
    Scanner sc = new Scanner(System.in);

    System.out.println("What is the length of the box 1?");
    double length1 = sc.nextDouble();

    System.out.println("What is the width of the box 1?");
    double width1 = sc.nextDouble();

    System.out.println("What is the height of the box 1?");
    double height1 = sc.nextDouble();
    box b = new box(length1, width1, height1);


    double surfArea1 = b.surfArea1(); // call box 1's surface area
    double volume1 = b.volume1(); // call box 1's volume

    System.out.printf("The surface area of box 1 is: %.2f\n", surfArea1);
    System.out.printf("The volume of box 1 is: %.2f\n", volume1);//printf to control the output to 2 decimal places

    System.out.println("What is the length of the box 2?");
    double length2 = sc.nextDouble();

    System.out.println("What is the width of the box 2?");
    double width2 = sc.nextDouble();

    System.out.println("What is the height of the box 2?");
    double height2 = sc.nextDouble();
    box b2 = new box(length2, width2, height2);

    double surfArea2 = b2.surfArea1();
    double volume2 = b2.volume1();

    System.out.printf("The surface area of box 2 is: %.2f\n", surfArea2);
    System.out.printf("The volume of box 2 is: %.02f\n", volume2);

  } //end main
} //end class

class box {
    private double length;
    private double width;
    private double height;
    box(double l, double w, double h)
    {
      length = l;
      width = w;
      height = h;
    }
    public double surfArea1()
    {
      double sa = (2*(length*width))+(2*(length*height))+(2*(height*width));//surface area formula
      return sa;

    }
    public double volume1()
    {
      double vol = length*width*height;//volume calculation
      return vol;
    }

    // Constructor: create box with provided length, width, and height

    // Method: calculate surface area of box object

    // Method: calculate volume of box object


} //end class
