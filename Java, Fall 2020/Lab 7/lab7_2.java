import java.util.Scanner;
/*
Name:
UIN:
Date:
Assignment: Lab Work Week 7.2
*/

/*Instructions: Take in two lines of input. The first line can take in "difference", "sum", or "product"
                and save it into type. The second line of input can take in any two digit string ("12","47", etc.),
                and save it into digits.
                Assume, that the user will always put in "difference", "sum", or "product" in the first line of
                input, and that the user will always put in a two digit value in the second input.

                Use methods to do the math of the requested type.
                - "sum" should take the sum of the two digits in the string
                - "product" should take the product of the two digits in the string
                - "difference" should take the difference between the product and sum
                  of the digits (product - sum)
*/

class lab7_2 {

  public static void sum(int num1, int num2)
  {
    System.out.println("The sum of the 2 digits is: " + (num1+num2));
  }

  public static void product(int num1, int num2)
  {
    System.out.println("The product of the 2 digits is: " + (num1*num2));
  }

  public static void difference(int num1, int num2)
  {
    System.out.println("The difference between the product and sum is: " + ((num1*num2)-(num1+num2)));
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("What type of math would you like to do?");
    String type; // difference, sum, product
    type = sc.nextLine();
    type = type.toLowerCase(); //just in case they add a caps somewhere

    System.out.println("What digits would you like to do the math on?");
    String digits;
    digits = sc.nextLine();
    int num1 = Integer.parseInt(digits.substring(0,1));
    int num2 = Integer.parseInt(digits.substring(1,2));
    if(type.equals("sum"))
    {
      sum(num1, num2);
    }
    else if(type.equals("product"))
    {
      product(num1, num2);
    }
    else if(type.equals("difference"))
    {
      difference(num1, num2);
    }


  } //end main
} //end class
