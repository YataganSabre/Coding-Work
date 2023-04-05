// import java.util.Scanner;
import java.util.*;
/*
Name:
UIN:
Date:
Assignment: Lab Work Week 10.2
*/

/*Instructions: Read the provided instructions.

*/

class lab10_2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("How big would you like your arraylist?");
    int initialSize = sc.nextInt();
    ArrayList<Integer> arrlist = new ArrayList<Integer>();
    for(int i = 1; i <= initialSize; ++i)
    {
      arrlist.add(i);
    }
      System.out.println(arrlist);
    for(int i = 0; i < arrlist.size(); ++i)
    {
      if(arrlist.get(i)%2==0)
      {
        arrlist.remove(i);
      }
    }
    System.out.println(arrlist);
    for(int i = 0; i < arrlist.size(); ++i)
    {
      if(arrlist.get(i)%5==0)
      {
        arrlist.remove(i);
      }
    }
    System.out.println(arrlist);



  } //end main
} //end class
