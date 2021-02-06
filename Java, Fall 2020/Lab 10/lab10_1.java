/*
Name: Kaan Montplaisir
UIN: 627003014
Date: 10/19/2020
Assignment: Lab Work Week 10.1
*/

/*Instructions: Refer to the instructions on Canvas and/or Mimir.
*/

class lab10_1 {
  public static void main(String[] args) {
    int[] arrInt1 = {38, 18, 93, 20, 94};
    int[] arrInt2 = new int[5]; //you will use this array as the shifted array
    for(int i = 0; i < arrInt1.length; ++i)
    {
    if(i == 0)
      {
        arrInt2[i] = arrInt1[arrInt1.length-1];
      }
    else
      {
        arrInt2[i] = arrInt1[i-1];
      }
    }
    printArray(arrInt2);
  }//end main

  public static void printArray(int[] arrInt2)
  { //pass in any necessary arguments
  for (int i = 0; i < arrInt2.length; ++i )
  {
    System.out.print(arrInt2[i] + " ");
  }
  }//end print array

} //end class
