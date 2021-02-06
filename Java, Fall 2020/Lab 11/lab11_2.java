// import java.util.Scanner;
import java.util.*;
/*
Name: Kaan Montplaisir
UIN: 6270003014
Date: 10/28/2020
Assignment: Lab Work Week 11.2
*/

/*Instructions: Read the provided instructions.

*/

class lab11_2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("What shape (rectangle or triangle) do you want to calculate the area of?");
    String shape = sc.nextLine();

    System.out.println("What is the length of the shape?");
    int length = sc.nextInt();

    System.out.println("What is the height of the shape?");
    int height = sc.nextInt();

    // create class object here:
    shapeArea sa = new shapeArea();

    if(shape.equals("rectangle"))
    {

        int area = sa.rec(length, height); // call your rectangle area method from ShapeArea here
      System.out.println("The area of the rectangle is " + area + ".");
    }
    else if(shape.equals("triangle"))
    {
        double area = sa.tri(length, height); // call your triangle area method from ShapeArea here
        System.out.println("The area of the triangle is " + area + ".");
    }
    else
    {
        System.out.println("You did not enter an allowed shape.");
    }



  } //end main
} //end class

class shapeArea {

    // make a method that takes in the length and height and returns the area (int) of the rectangle here:
    public static int rec(int l, int h)
    {
      int area = 0;
      area = l*h;
      return area;
    }
    // make a method that takes in the length and height and returns the area (double of the triangle here:
    public static double tri(double l, double h)
    {
      double area = 0;
      area = (l*h)/2;
      return area;
    }

} //end class
