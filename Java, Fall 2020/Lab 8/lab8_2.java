import java.util.Scanner;
/*
Name: Kaan Montplaisir
UIN: 627003014
Date: 10/5/2020
Assignment: Lab Work Week 8.2
*/

/*Instructions: Read the provided instructions.

*/

class lab8_2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("What number would you like to start your matrix with?");
    int startVal = sc.nextInt();
    int[][] myArray = new int[5][5];
    int arrinput = 0;
    int counter = 0;
    for(int r = 0; r < 5; ++r) //goes through rows
    {
      for(int c = 0; c < 5; ++c) //goes through columns
      {
        arrinput = startVal + (4*counter); //constantly assigns new values, using a linear expression
        counter += 1; //counter lets us know how many x4s we are
        if(arrinput%3==0)
        {
          myArray[r][c] = 0; //finds if something is divisble by 3, sets it to 0
        }
        else
        {
          myArray[r][c] = arrinput;
        }

      }
    }
  for(int r = 4; r > -1; --r)
  {
    for(int c = 4; c > -1; --c)
    {
      if(c == 0)
      {
        System.out.println(myArray[r][c]);
      }
      else //if else statement to get good formatting
      {
        System.out.print(myArray[r][c] + " ");
      }
    }
  }
  } //end main
} //end class
