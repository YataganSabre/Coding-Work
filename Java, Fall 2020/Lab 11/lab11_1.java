import java.util.Scanner;
/*
Name: Kaan Montplaisir
UIN: 627003014
Date: 10/26/2929
Assignment: Lab Work Week 11.1
*/

/*Instructions: Refer to Canvas for instructions
*/

class lab11_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    d.Dog();

    System.out.println("What type of math would you like to do?");
    String type = sc.nextLine(); // difference, sum, product
    type = type.toLowerCase();

    System.out.println("What digits would you like to do the math on?");
    String digits = sc.nextLine();
    operation op1 = new operation();
    if(type.equals("sum"))
    {
      int output = op1.sum(digits);
      System.out.println("The sum of the 2 digits is: " + output);
    }
    else if(type.equals("product"))
    {
      int output = op1.product(digits);
      System.out.println("The product of the 2 digits is: " + output);
    }
    else if(type.equals("difference"))
    {
      int output = op1.difference(digits);
      System.out.println("The difference between the product and sum is: " + output);
    }


  } //end main
} //end class


class operation{
  public static int sum(String digits){
    int num1 = Integer.parseInt(digits.substring(0,1));
    int num2 = Integer.parseInt(digits.substring(1,2));
    int output = num1+num2;
    return output; //change the return statement
  }

  public static int product(String digits){
    int num1 = Integer.parseInt(digits.substring(0,1));
    int num2 = Integer.parseInt(digits.substring(1,2));
    int output = num1*num2;
    return output; //change the return statement
  }

  public static int difference(String digits){
    int num1 = Integer.parseInt(digits.substring(0,1));
    int num2 = Integer.parseInt(digits.substring(1,2));
    int output = (num1*num2)-(num1+num2);
    return output; //change the return statement
  }
}//end class operation
