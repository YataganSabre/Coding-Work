import java.util.ArrayList;
// Other imports are not allowed in this exercise.

/**
	This exercise involves implementing several methods. Stubs for each method
	with documentation are given here. It is your task to fill out the code in
	each method body so that it runs correctly according to the documentation.

	You can run this file by compiling TestMethods2.java
	It will call this program and run it, validating the test you choose.

	Example inputs with output are provided in the comments before each method.
	At a minimum, your solutions must pass these tests. My version of TestMethods2
	contains more than the examples given or those cases in your version of
	TestMethods2.  Therefore, hardcoding the answers will not pass.

	By Robert Lightfoot and Ariana Morris
	in the style of Bruce Gooch.

	@author Kaan Montplaisir
	UIN: 627003014
	@version 10/28/2020
**/

//imports are not allowed in this exercise.

public class ExerciseMethods2{

	/**
		Boolean function returns true if the given array has a number that appears
		more than once

		hasPair([1,2]) returns false
		hasPair([3,4,3,5]) returns true
		hasPair([3,4,6,5]) returns false
		hasPair([1,2,2,1,2,3,2]) returns true
		hasPair([5,4,6,9,13,24,92]) returns false
		@param nums int array
		@return true if the array has a pair of numbers
		numbers in the array. False otherwise.
	*/
	public static boolean hasPair(int[] nums)
	{
		boolean pair = false;
		for (int j = 0; j < nums.length; j++) {
     for (int k = j + 1 ; k < nums.length; k++) {
          if (k!=j && nums[k] == nums[j]) {
                   pair = true;
          }
     }
 }
    return pair;
	}//end hasPair

	/**
		Method totalChange returns a string that indicates the sum of the amount of money
		for the given amount of coins in this order: (quarters, dimes, nickels, pennies)

		totalChange([1, 2, 3, 4]) returns $0.64
		totalChange([6, 4, 5, 0]) returns $2.15
		totalChange([0, 15, 20, 42]) returns $2.92
		totalChange([28, 24, 15, 7]) returns $10.22
		@param coins an array of 4 elements (quarters, dimes, nickels, pennies)
		@return returns a String in the form of $xx.xx
	*/
   public static String totalChange(int[] coins){
		 float quart = coins[0];
		 float dime = coins[1];
		 float nickel = coins[2];
		 float penny = coins[3];
		 float total = (quart*.25f)+(dime*.1f)+(nickel*.05f)+(penny*.01f);
		 String amount = String.format("$%.2f", total);
      return amount;
   }//end totalChange

	/**
		Method sortNums numerically sorts a given array of integers,
		returns an array (a new one or the same that was sent)

		sortNums([2,1]) returns [1,2]
		sortNums([5,4,3,2,1]) returns [1,2,3,4,5]
		sortNums([67, 83, 27, 36]) returns [27, 36, 67, 83]
		sortNums([1,2,2,1,2,3,2]) returns [1,1,2,2,2,2,3]
		sortNums([-3, 6, 0, -8, 13]) returns [-8, -3, 0, 6, 13]
		@param nums integer array
		@return An integer array that has been sorted least to greatest.
	*/
   public static int[] sortNums(int[] nums)
   {
		 int i = 0;/*oh my god this took me so fucking long trying to google how to code
		 this cuz i thought this was using ArrayList for most of the time
		 Bassically, this entire thing is a "ripple sorter"
		 it compares a item at i and i+1, if i is greater then i+1
		 it swaps them, if it swapped them, it goes down one index (unless at 0)
		 and repeats until i < i+1, it then adds 1 to i and repeats.
		 Once i is equal to the length of the array - 1, it's done sorting and the
		 while loop stops.
		 */

		 while(i != nums.length-1)
		 {
			 int hold1;
			 int hold2;
			 if(nums[i] > nums[i+1])
			 {
				 hold1 = nums[i];
				 hold2 = nums[i+1];
				 nums[i] = hold2;
				 nums[i+1] = hold1;
				 if(i > 0)
				 {
						i -= 1;
				 }
			 }
			 else
			 {
				i += 1;
			 }
		 }
		 return nums;
   }// end sortNums



	 /**
		 Method arrayOfMultiples takes size and produces that many multiples of num

		 arrayOfMultiples(4, 3) returns [3, 6, 9, 12]
		 arrayOfMultiples(7, 2) returns [2, 4, 6, 8, 10, 12, 14]
		 arrayOfMultiples(3, 12) returns [12, 24, 36]
	 	 arrayOfMultiples(0, 5) returns []
		 arrayOfMultiples(-5, 25) returns []
		 @param size is the number of multiples required
		 @param num is the multiple of which the elements should be
		 @return am int array of multiples of .
	 */
		 public static int[] arrayOfMultiples(int size, int num)
		 {
			 if(size > 0){
			 	int[] multiples = new int[size];
				for(int i = 0; i < multiples.length; ++i)
				{
					multiples[i] = (i+1)*(num);
				}
				return multiples;
				}
			else
			{
				//this is just to make sure i don't make a array with a length less then 0
				int[] multiples = new int[0];
				return multiples;
			}
		 }// end arrayOfMultiples

		 /**
	 		Method changeWords executes a find and replace like you would with ctrl+f
			or command+f on here
			The first value provided is the text that you search
			Turn the text into an array of strings
			find the string that is sent in the second position (find) and
			replace it with the

	 		changeWords("never have I ever", "ever", "cheated") returns ["never", "have", "I", "cheated"]
			changeWords("Why why Why", "Why", "because") returns ["becasue", "because", "because"]
			changeWords("What is up bro", "hi", "hello") returns ["what", "is", "up", "bro"]
			changeWords("Hi nice to meet you", "hi", "hello") returns ["hello", "nice", "to", "meet", "you"]
			changeWords( "", "", "") returns []

	 		@param String text, String of multiple words
			@param String find, the string to be replaced
			@param String replace, the string to be inserted in place of find
	 		@return String array, where words is the array of words after the edit is made
	 	*/
   public static String[] changeWords(String text, String find, String replace)
   {
		 if(text.equals(""))
		 {
			 String[] empty = new String[0];
			 return empty;
		 }
		 String[] words = text.split(" ");//splits up the string by the white spaces, each word as it's own seperate bit in a array
		 for(int i = 0; i < words.length; ++i)
		 {
			if(words[i].toLowerCase().equals(find.toLowerCase()))
			{
				words[i] = replace;
			}
		 }
     return words;

   }//end changeWords

	 /**
		Method connect4 returns the winner of a 2 dimensional array of x's and o's.
		If there is no winner, a t is returned. If both have a winner, x goes first, so they win.

		connect4([['x','x','x','x'],
							['o','o','x','o'],
							['x','o','o','o'],
							['x','o','o','x']]) returns 'x'
		connect4([['o','x','x','x'],
					 		['o','o','x','o'],
					 		['x','o','o','o'],
					 		['x','x','x','o']]) returns 'o'
		connect4([['x','x','o','x'],
							['o','o','x','o'],
							['x','o','o','x'],
							['x','o','o','x']]) returns 't'
		connect4([['x','x','x','x'],
							['o','o','o','o'],
							['x','o','x','o'],
							['x','o','o','x']]) returns 'x'
		@param char[][] board,
		@return returns a charater representing the winner, 'x' , 'o',
		or, 't' if the game is a tie.
		*/
		 public static char connect4(char[][] board)
		 {
			 int xcounter = 0;
			 int ocounter = 0;
			 for(int i = 0; i < 4; ++i)
			 {
				 //ASSIGNING X AND o COUNTER VALUES FOR VERTICAL ROWS
				 if(board[i][0]=='x')
				 {
					 xcounter += 1; //testing for vertical 4s only because i don't know if your test methods have those
				 }
				 else if(board[i][0]=='o')
				 {
					 ocounter += 1;
				 }
				 //TESTING FOR HORIZONAL ROWS
				 if((board[i][0]=='x')&&(board[i][1]=='x')&&(board[i][2]=='x')&&(board[i][3]=='x'))
				 {
					 return 'x';
				 }
				 else if((board[i][0]=='o')&&(board[i][1]=='o')&&(board[i][2]=='o')&&(board[i][3]=='o'))
				 {
					 return 'o';
				 }
			 }
			 //TESTING DIAGONAL ROW (not rows, only 1 DIAGONAL is possible)
			 if((board[0][0]=='x')&&(board[1][1]=='x')&&(board[2][2]=='x')&&(board[3][3]=='x'))
			 {
				 return 'x';
			 }
			 else if((board[0][0]=='o')&&(board[1][1]=='o')&&(board[2][2]=='o')&&(board[3][3]=='o'))
 			 {
 				 return 'o';
 			 }
			 //TESTING VERTICAL ROWS
			 if(xcounter == 4)
			 {
				 return 'x';
			 }
			 else if (ocounter == 4)
			 {
				 return 'o';
			 }
				return 't';
		 }//end connect4

		 /**
	 		Method sandwiched returns true if num is in the element before and after
			an element that is not equal to num

	 		sandwiched([4,5,4,6,7,3], 4) returns true
	 		sandwiched([2,1,2], 2) returns true
	 		sandwiched([3,3,3], 3) returns false
	 		sandwiched([4,5,6,4], 4) returns false
			sandwiched([1,1,2,3,1,4,1], 1) returns true
	 		@param nums Integer ArrayList
			@param num integer
	 		@return true if a single number is between elements equal to num
	 	*/
	 	public static boolean sandwiched(ArrayList<Integer> nums, int num)
	 	{
			for(int i = 0; i < nums.size(); ++i)
			{
			if(nums.get(i)==num)
				{
				if(i == 0)
				{
					if((nums.get(i) != nums.get(i+1))&&nums.get(i+2) == num)
					{
					return true;
				  }
				}
				else if( i == (nums.size()-1))
				{
					if((nums.get(i) != nums.get(i-1))&&nums.get(i-2) == num)
					{
					return true;
					}
				}
				else if((nums.get(i) != nums.get(i-1)) && (nums.get(i) != nums.get(i+1)))
				{
					return true;
				}
			}
		}
			return false;
	 	}//end sandwiched


	/**
		Given a list of integers, round each number to the nearest multiple of 5.
		2.5-7.49 round to 5. 7.5-12.49 round to 10. 12.5-17.49 round to 15. etc.
		return the sum of all the rounded elements.
		Implement this way for credit:
		Fill in the method directly below this one called helperRound() to round
		each number. Call that method and use the sum of the returned values.

		helperSum({4.3, 16.7}) returns 20
		helperSum({25.7, 21.2, 27.5}) returns 75
		helperSum({2.5}) returns 5
		helperSum({2.49, 12.49, 40.2, 42.5}) returns 95
		@param nums is an arrayList of doubles
		@return the sum of the all elements after rounding
	*/
   public static int helperSum(ArrayList<Double> nums)
   {
		 int sum = 0;
		 for(int i = 0; i < nums.size(); ++i)
		 {
			 sum += helperRound(nums.get(i));
		 }
		 return sum;
   }//end helperSum

	 /**
 		Method HelperRound will round a number up or down to the nearrest 5.

 		@param num double number,
 		@return the rounded up or down number to the nearest multiple of 5.
 	*/
    public static int helperRound(double n){
			int rounded = 0;
			double rem = n%5f;
			if(rem < 2.5)
			{
				rounded += (n-rem);
			}
			else if( rem >= 2.5)
			{
				rounded += (n-rem)+5;
			}
			return rounded;
    }//end HelperRound


	/**
		Method arrayOfSums returns an ArrayList of the same size as the largest ArrayList
		This method needs to be overloaded so that it works for 2 to 4 sent Arraylists.

		arrayOfSums([2,4,7], [3,7,14]) returns [5,11,21]
		arrayOfSums([6,13,4,8], [7,5,9], [2,5,8,3]) returns [15, 23, 21, 11]
		arrayOfSums([6,13,4,8], [7,5,9], [2,5,8,3], [3,5,4,1,2]) returns [18, 28, 25, 12, 2]
		arrayOfSums([8,6], [2,4,10]) returns [10,10,10]
		arrayOfSums([2,2,2,2,2], [3,2,5,2,3], [1,3,1,3,1]) returns [6, 7, 8, 7, 6]
		arrayOfSums([11,12,13,14], [14,13,12,11], [10,10,10,10], [5,6,7,6,5]) returns [40, 41, 42, 41, 5]
		@param nums1 ArrayList of integers of varying sizes
		@param nums2 ArrayList of integers of varying sizes
		@param nums3 ArrayList of integers of varying sizes
		@param nums4 ArrayList of integers of varying sizes
		@return an array of the sums of the corresponding elements from each array
	*/
   public static ArrayList<Integer> arrayOfSums(ArrayList<Integer> nums1, ArrayList<Integer> nums2, ArrayList<Integer> nums3, ArrayList<Integer> nums4 )
   {
		 int length = 0;
		 ArrayList<Integer> numsSums = new ArrayList<Integer>();
		 if(nums1.size()>nums2.size() && nums1.size()>nums3.size() && nums1.size()>nums4.size())
		 {
			 length = nums1.size();
		 }
		 else if(nums2.size()>nums1.size() && nums2.size()>nums3.size() && nums2.size()>nums4.size())
		 {
			 length = nums2.size();
		 }
		 else if(nums3.size()>nums2.size() && nums3.size()>nums1.size() && nums3.size()>nums4.size())
		 {
			 length = nums3.size();
		 }
		 else{
			 length = nums4.size();
		 }
		 for (int i = 0; i < length; i++) {
				numsSums.add(0);
		 }
		 for(int i = 0; i < length; ++i)
		 {
			 int add = 0;
			 if(i < nums1.size())
			 {
				 add += nums1.get(i);
			 }
			 if(i < nums2.size())
			 {
				 add += nums2.get(i);
			 }
			 if(i < nums3.size())
			 {
				 add += nums3.get(i);
			 }
			 if(i < nums4.size())
			 {
				 add += nums4.get(i);
			 }
			 numsSums.set(i, add);
		 }
		 return numsSums;


   }// end arrayOfSums

	 /**
	  * Do overloaded methods here.
	  * to compile, I am adding the method line.
	  */

		public static ArrayList<Integer> arrayOfSums(ArrayList<Integer> nums1, ArrayList<Integer> nums2, ArrayList<Integer> nums3)
    {
			int length = 0;
			ArrayList<Integer> numsSums = new ArrayList<Integer>();
			if(nums1.size()>nums2.size() && nums1.size()>nums3.size())
			{
				length = nums1.size();
			}
			else if(nums2.size()>nums3.size() && nums2.size()>nums1.size())
			{
				length = nums2.size();
			}
			else
			{
				length = nums3.size();
			}
			for (int i = 0; i < length; i++) {
  			 numsSums.add(0);
			}
			for(int i = 0; i < length; ++i)
			{
				int add = 0;
				if(i < nums1.size())
				{
					add += nums1.get(i);
				}
				if(i < nums2.size())
				{
					add += nums2.get(i);
				}
				if(i < nums3.size())
				{
					add += nums3.get(i);
				}
				numsSums.set(i, add);
			}
		  return numsSums;

    }// end arrayOfSums
		public static ArrayList<Integer> arrayOfSums(ArrayList<Integer> nums1, ArrayList<Integer> nums2)
		{
			int length = 0;
			ArrayList<Integer> numsSums = new ArrayList<Integer>();
			if(nums1.size()>nums2.size())
			{
				length = nums1.size();
			}
			else
			{
				length = nums2.size();
			}
			for (int i = 0; i < length; i++) {
  			 numsSums.add(0);
			}
			for(int i = 0; i < length; ++i)
			{
				int add = 0;
				if(i < nums1.size())
				{
					add += nums1.get(i);
				}
				if(i < nums2.size())
				{
					add += nums2.get(i);
				}
				numsSums.set(i, add);
			}
		  return numsSums;
		}// end arrayOfSums

	/**
		Method editString takes a string and breaks it into an array of single
		words which are then are edited based on the command
		Possible Commands:
		remove: for the sent words, remove those from the text
		replace: replace the word in an even element of words with a word in an odd element of words
		add: add the word given word in the index indicated after the word

		editString("What is up bro", "remove", ["bro"]) returns ["What", "is", "up"]
		editString("What is up bro", "replace", ["bro", "brother"]) returns ["What", "is", "up", "brother"]
		editString("What is up", "add", ["my", "3", "friend", "4"]) returns ["What", "is", "up", "my", "friend"]
		editString("I can only do so much", "remove", ["only", "so"]) returns ["I", "can", "do", "much"]
		editString("Tis but a flesh wound", "replace", ["flesh", "scratch", "wound", "mark"]) returns ["Tis", "but", "a", "scratch", "mark"]
		editString("I can code in java", "add", ["html", "4", "and", 5]) returns ["I", "can", "code", "in", "html", "and", "java"]
		@param text String of words
		@return an array of lowercased words in alphabetical order
	*/
	public static ArrayList<String> editString(String text, String command, ArrayList<String> words)
	{
		ArrayList<String> edited = new ArrayList<String>();
		/* I gave up on this one cuz i've been coding for 5 and a half hours and I cannot for the life of me figure out how to make this string into a array
		 without importing java.util.List and java.util.Arrays */
		if(command.equals("remove"))
		{
		//	for(int i = 0; i <; ++i)
			//{

			//}
		}
		else if(command.equals("remove"))
		{

		}
		else if(command.equals("add"))
		{

		}
	  return edited;
	}//end editString

}//end ExerciseMethods2
