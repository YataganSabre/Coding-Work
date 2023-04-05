import java.util.Scanner;
/*
Name: Kaan Montplaisir
UIN: 627003014
Date: 11/02/2020
Assignment: Lab Work Week 12.1
*/

/*Instructions: Refer to Canvas for instructions
*/

class lab12_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("How many test grades do you you want to enter? (Enter numbers 2-4) ");
    int numTests = sc.nextInt();
    AverageGrade ag = new AverageGrade();

    if(numTests == 2){
      System.out.print("Please enter your first test grade: ");
      double e1 = sc.nextDouble();
      System.out.print("Please enter your second test grade: ");
      double e2 = sc.nextDouble();
      double av = ag.average(e1,e2);
      System.out.printf("Your test average is: %.2f", av);
    }

    else if(numTests == 3){
      System.out.print("Please enter your first test grade: ");
      double e1 = sc.nextDouble();
      System.out.print("Please enter your second test grade: ");
      double e2 = sc.nextDouble();
      System.out.print("Please enter your third test grade: ");
      double e3 = sc.nextDouble();
      double av = ag.average(e1,e2,e3);
      System.out.printf("Your test average is: %.2f", av);
    }

    else{
      System.out.print("Please enter your first test grade: ");
      double e1 = sc.nextDouble();
      System.out.print("Please enter your second test grade: ");
      double e2 = sc.nextDouble();
      System.out.print("Please enter your third test grade: ");
      double e3 = sc.nextDouble();
      System.out.print("Please enter your fourth test grade: ");
      double e4 = sc.nextDouble();
      double av = ag.average(e1,e2,e3,e4);
      System.out.printf("Your test average is: %.2f", av);

    }
  } //end main
} //end class


class AverageGrade{
  public static double average(double exam1, double exam2){
    double av = 0;
    av = (exam1+exam2)/2;
    return av;

  }//end average method

  public static double average(double exam1, double exam2, double exam3){
    double av = 0;
    av = (exam1+exam2+exam3)/3;
    return av;
  }//end average method

  public static double average(double exam1, double exam2, double exam3, double exam4){
    double av = 0;
    av = (exam1+exam2+exam3+exam4)/4;
    return av;
  } //end average method
}//end class AverageGrade
