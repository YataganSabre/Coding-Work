import java.util.Scanner;
/*
Name: Kaan Montplaisir
UIN: 627003014
Date: 10/5/2020
Assignment: Lab Work Week 8.1
*/

/*Instructions: Refer to the instructions on Canvas.
*/

class lab8_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Hello! Welcome to the grocery store list generator!\n");
    System.out.print("How many items would you like to put in your grocery list?");
    int arrset = input.nextInt(); //takes value that will assign the array
    String[] grocerylist = new String[arrset];
    for(int i = 1; i <= arrset; ++i)//doing i = 1 to make system print simple
    {
      if(i == 1)
      {
        System.out.println(" Please enter item " + i + " on the grocery list: ");
        String absorb = input.nextLine();//if i don't do this, hitting enter when asking for how many
        //items in the list takes the new line a the input for "String Item". I don't get it.
        String item = input.nextLine();
        grocerylist[i-1] = item;
      }
      else
      {
      System.out.println("Please enter item " + i + " on the grocery list: ");
      String item = input.nextLine();
      grocerylist[i-1] = item;//-1 because the 1 from before is mostly just there to inform the user better
      }
    }
    System.out.println("Here are the items in your grocery list:");
    for(int i = 0; i < arrset; ++i)
    {
      System.out.println(grocerylist[i]);
    }


  } //end main
} //end class
