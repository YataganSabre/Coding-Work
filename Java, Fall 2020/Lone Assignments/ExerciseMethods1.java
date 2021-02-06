// Imports are not allowed in this exercise.

//READ ALL COMMENTS BEFORE BEGINNING

/**
	This exercise involves implementing several methods. Stubs for each method
	with documentation are given here. It is your task to fill out the code in
	each method body so that it runs correctly according to the documentation.

	You can run this file by compiling TestMethods1.java
	It will call this program and run it, validating the test you choose.

	Example inputs with output are provided in the comments before each method.
	At a minimum, your solutions must pass these tests. My version of TestMethods1
	contains more than the examples given or those cases in your version of
	TestMethods1.  Therefore, hardcoding the answers will not pass.

	By Robert Lightfoot and Ariana Morris
	in the style of Bruce Gooch.

	@author Kaan Montplaisir
	627003014
	@version 9/30/2020
**/

//imports are not allowed in this exercise.

public class ExerciseMethods1{

	/**
		Boolean function returns true if the given string ends with the same letter
		it begins with, regardless of case.

		firstLastEqual("Robert") returns false
		firstLastEqual("Ariana") returns true
		firstLastEqual("Taco cat") returns true
		firstLastEqual("42") returns false
		firstLastEqual("") returns false
		firstLastEqual("Goodness, clean up that dog") returns true
  	firstLastEqual("HoHOho")) returns false
		@param original String,
		@return true if (ignoring case) the first letter is the same as the last
		letter (Not just last character). False otherwise.
	*/
	public static boolean firstLastEqual(String original)
	{
		if(original.length() < 1)
		{
			return false;
		}
		original = original.toLowerCase();//forces lowercase for checking
		var char1 = original.charAt(0); //sets up first and last characters of the string
		var char2 = original.charAt(original.length() -1);
		if(char1 == char2) //true if the first and last characters are the same
		{
			return true;
		}
    return false;
	}//end firstLastEqual

	/**
		boolean function that returns true if the string has punctuation [.!?].

		hasPunctuation("The total will be 12.50") returns true
		hasPunctuation("Today is the best ever! I wish you were here to enjoy it") returns true
		hasPunctuation("I had so much work today") returns false
		hasPunctuation("I'd love to get ice cream with you") returns false
		hasPunctuation("") returns false
		hasPunctuation("8675309") returns false
		hasPunctuation("Where are you from?")) returns true
		@param original String,
		@return true if an exclamation point, period, or question mark is contained. False otherwise.
	*/
   public static boolean hasPunctuation(String original)
   {
		 //Your answer here. Edit the return statement as necessary
		 if(original.contains("!")||original.contains(".")||original.contains("!")||original.contains("?"))
		 { //sees if the string contains a punctuation
			 return true;
		 }
		 else{
			 return false;
		 }
   }// end hasPunctuation

	/**
		isDouble function returns true if the string is a double. false otherwise

		isDouble("12564") returns false
		isDouble("-567") returns false
    isDouble("") returns false
		isDouble("23.9") returns true
		isDouble("twenty two") returns false
    isDouble("-78.13") returns true

		@param firstString String
		@return true only if the input string only contains digits 0-9 with a
		decimal and/or a leading "-".
	*/
   public static boolean isDouble(String firstString)
   {
		 if(firstString.matches(".*\\d.*"))// Regex system, checks for numbers, from -infinite to infinite if I remember it correctly
		 {
			 if(firstString.contains("."))//checks for a "decimal" aka a period
			 {
				 return true;
			 }
			 else
			 {
				 return false;
			 }
		 }
		 else
		 {
		 return false;
	 	}
   }// end isDouble

	 /**
		 isWords function returns true if the string is only made of letters,
		 possibly with punctuation

		 isWords("Hello World") returns true
		 isWords("what's up") returns true
		 isWords("23.9") returns false
		 isWords("Platform 9 and 3/4") returns false
		 isWords("Platform Nine and Three-Quarters") returns true
     isWords("") returns false
		 isWords("87") returns false
		 @param firstString String,
		 @return true only if the input string only contains letters of the
		 alphabet and possibly punctuation.
	 */
		 public static boolean isWords(String firstString)
		 {
			 //Your answer here. Edit the return statement as necessary
			 if(!(firstString.matches(".*\\d.*")))//checks for any number again, but with
			 // a ! to bassically find if first string has letters and not numbers.
			 {
				 if(firstString.substring(0)=="")//checks if string is blank,
				 //as while a blank string has no numbers, it also has no letters, and is not what we want
				 {
				 return false;
			 	}
				return true;
			 }
			 return false;
		 }// end isWords

		 /**
	 		If the number is contained in the text, return how many times it is there.
			Otherwise return 0.

	 		countNum(1, "I love CSCE111") returns 3
	 		countNum(12, "The bill is $12.97") returns 1
	 		countNum(33, "333 bananas for 33 monkeys.") returns 2
	 		countNum(333, "My number is (333)-333-3333") returns 3
			countNum(87, "I can't believe Aragorn is 83 years old. 83!") returns 0
	 		countNum(41, "41414141") returns 4
			countNum(0, "") returns 0
	 		@param num integer,
	 		@param text String,
	 		@return counts the number of times a number is found in a string
	 	*/
   public static int countNum(int num, String text)
   {
		 //Your answer here. Edit the assignment and return statement as necessary
     int count = 0;
		 String num2 = Integer.toString(num);
		 boolean go = true;
		 while( go == true)
		 {//i'm actually pretty proud of myself for this one
			 if(text.contains(num2))//sees if text contains the numer at all
			 {
				 count += 1; //adds to count
				 text = text.replaceFirst(num2,"");//replaces ONLY THE FIRST iteration of that number with nothing.
			 }
			 else
			 {
				 go = false; //once there is no longer num in text, sets go to false to stop the loop
			 }
		 }
     return count;
   }//end countNum

	 /**
		If the number is contained in the text  and is repeated, return the sum of
		the number for each time it is repeated.
		Otherwise return 0.

    sumRepeat(1, "I love CSCE111") returns 3
    sumRepeat(12, "The bill is $12.97") returns 0
    sumRepeat(33, "333 bananas for 33 monkeys.") returns 66
    sumRepeat(333, "My number is (333)-333-3333") returns 999
    sumRepeat(87, "I can't believe Aragorn is 83 years old. 83!") returns 0
    sumRepeat(41, "41414141") returns 164
    sumRepeat(0, "") returns 0
		@param num integer,
		@param text String,
		@return returns the sum of any repeated numbers.
		*/
		 public static int sumRepeat(int num, String text)
		 {
			 int count = 0;
  		 String num2 = Integer.toString(num);
  		 boolean go = true;
			 int sum = 0;
  		 while( go == true)
  		 {
  			 if(text.contains(num2))//sees if text contains the numer at all
  			 {
  				 count += 1; //adds to count
  				 text = text.replaceFirst(num2,"");//replaces ONLY THE FIRST iteration of that number with nothing.
  			 }
  			 else
  			 {
  				 go = false; //once there is no longer num in text, sets go to false to stop the loop
  			 }
  		 }
			 if(count == 1)
			 {
				 return 0; //if it DOES NOT REPEAT more then once, it asks that we don't sum it, so return 0
			 }
			 while(count > 0) //adds num to sum until it its "used up" the counter
			 {
				 sum += num;
				 count -= 1;
			 }
       return sum;
		 }//end sumRepeat

	/**
		Given three integers, return a string based on whichever is closer to the
		winning number. In the event of a tie, return that neither number is closer
		to the winning number.
		Note that Math.abs(n) returns the absolute value of a number.

		whoWins(8, 13, 21) returns "My number was closer to 21"
		whoWins(45, 35, 42) returns "Your number was closer to 42"
		whoWins(13, 7, 10) returns "Neither number was closer to 10"
    whoWins(100, 28, 35) returns "My number was closer to 35"
		whoWins(35, -44, 4) returns "Your number was closer to 4"
		whoWins(25, 55, 40) returns "Neither number was closer to 40"
		@param yourNumber int number,
		@param myNumber int number,
		@param winningNumber int number,
		@return a string saying "Your number" or "My number" or "Neither" was closer to the winning number
	*/
   public static String whoWins(int yourNumber, int myNumber, int winningNumber)
   {
		 //Your answer here. Edit the return statement as necessary
		 int myDiff = Math.abs(winningNumber - myNumber); //finds abs value for differences from the winning num
		 int yourDiff = Math.abs(winningNumber - yourNumber);
		 if(yourDiff < myDiff)
		 {
			 return "Your number was closer to " + winningNumber;
		 }
		 else if(myDiff < yourDiff)
		 {
			return "My number was closer to " + winningNumber;
		 }
		 else
		 {
		 return "Neither number was closer to " + winningNumber;
	 	 }
   }//end whoWins

	/**
		Method topBottomSum returns the sum of the largest number and
		smallest number of the two numbers sent.

		topBottomSum(3, 3, 3, 3) returns 6
		topBottomSum(1, 10, 45, 2) returns 46
		topBottomSum(-6, 2, -45, -8) returns -43
		topBottomSum(3, 113, 2, 200) returns 202
		@param firstNumber int number,
		@param secondNumber int number,
		@param thirdNumber int number,
		@param fourthNumber int number,
		@return the sum of the largest two numbers sent.
	*/
   public static int topBottomSum(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber )
   {
		 int arr[] = {firstNumber, secondNumber, thirdNumber, fourthNumber};
		 int max = arr[0]; //sets the max and min to the first number
		 int min = arr[0];
    for (int i = 0; i < 4; i++)
		{
      if (arr[i] > max) //checks if the next number in the array is larger then the current
			//max, if it is, sets that to the new max and repeats
			{
          max = arr[i];
			}
		}
		for (int j = 0; j < 4; j++)//same as before but with min
		{
      if (arr[j] < min)
			{
          min = arr[j];
			}
		}
		return max+min;
		}// end topBottomSum

	/**
		Method sumOfSquares returns the sum of all numbers squared between
		the first number and the second number inclusive. Works in either direction.

		sumOfSquares(3, 3) returns 18
		sumOfSquares(1, 10) returns 385
		sumOfSquares(-6, 1) returns 92
		sumOfSquares(5, 3) returns 50
		@param firstNumber int number,
		@param secondNumber int number,
		@return the sum of the numbers from the first to the second.
	*/
	public static int sumOfSquares(int firstNumber, int secondNumber)
	{
		int sum = 0;
		if(firstNumber > secondNumber)
		{
			for(int i = firstNumber; i >= secondNumber;i--)
			{
				sum += i*i; //counts down from a number, adding the to the sum that num*num until it matches
			}
		}
		else if(secondNumber > firstNumber)
		{
			for(int i = secondNumber; i >= firstNumber;i--)
			{
				sum += i*i;
			}
		}
		else if (firstNumber == secondNumber) //if both nums are equal, then just do 2num^2 bassically
		{
			sum += (firstNumber*firstNumber)+(secondNumber*secondNumber);
		}
		return sum;
	}//end sumOfSquares

	/**
		Method changeDue returns the amount of change due to a person who paid a
		given amount. If what was paid does not cover the total, tell the user how
		much they owe. If they pay in exact change, tell them "No change due."

		changeDue(16.38, 20.38) returns "$4.00"
		changeDue(82.46, 100) returns "$17.54"
		changeDue(44.57, 35.75) returns "You owe $8.82"
		changeDue(30.55, 30.55) returns "No change due."
		@param total double number,
		@param paid double number,
		@return the amount of change owed.
	*/
	public static String changeDue(double total, double paid)
	{
		String suffer = "";//naming it suffer because i was when i looked at the outputs
		if(total < paid)
		{
			suffer = String.format("%.2f", (paid-total));//for some reason, one of the outputs
			//wanted to go to a like 11th decimal place so I had to do this. Strange.
			//this sets it to a second decimal place. gonna put it on the others just in case
			return "$" + suffer;
		}
		else if(total > paid)
		{
			suffer = String.format("%.2f", (total-paid));
			return "You owe $" + (suffer);
		}
		return "No change due.";
	}//end changeDue

}//end ExerciseMethods1
