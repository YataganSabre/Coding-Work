/*
  TestMethods1 will test the homework ExerciseMethods1.java
  Adopted by Robert Lightfoot from Bruce Gooch's original exercise.

  9/22/2020
*/

public class TestMethods1
{


    //  setting colors based on computer type

        public static final String ANSI_RESET = colorSet("\u001B[0m");
        public static final String ANSI_RED = colorSet("\u001B[31m");
        public static final String ANSI_GREEN = colorSet("\u001B[32m");



	public static void main(String[] args)
	{

		ExerciseMethods1 myFunctions = new ExerciseMethods1();

    //Put individual test cases up here.

    //put true in the condition to test everything
    //put false in the condition to only test the code above.
    if(true){
      TESTfirstLastEqual(myFunctions);
      TESThasPunctuation(myFunctions);
      TESTisDouble(myFunctions);
      TESTisWords(myFunctions);
		  TESTcountNum(myFunctions);
		  TESTsumRepeat(myFunctions);
	    TESTwhoWins(myFunctions);
		  TESTtopBottomSum(myFunctions);//WORK
		  TESTsumOfSquares(myFunctions);
		  TESTchangeDue(myFunctions);
    }
	}//end main

  // DO NOT EDIT BELOW HERE.

  public static String colorSet(String color){
    if (System.getProperty("os.name").contains("Mac")) {
      return color;
    }else{
      try {
        return "";
      } catch(Exception e) {
        System.out.println("Error?");
      }//end try
    }//end if
    return "";
  }//end colorSet

	public static void TESTfirstLastEqual(ExerciseMethods1 myFunctions)
    {
	   if(!myFunctions.firstLastEqual("Robert")  &&
		   myFunctions.firstLastEqual("Ariana") &&
  		 myFunctions.firstLastEqual("Taco cat") &&
  		 !myFunctions.firstLastEqual("42") &&
       !myFunctions.firstLastEqual("") &&
		   myFunctions.firstLastEqual("Goodness, clean up that dog") &&
       !myFunctions.firstLastEqual("HoHOho"))//
	    {
		   System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "firstLastEqual");
	    }
	    else
	    {
	     System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "firstLastEqual");
		   System.out.println();

		   System.out.println(myFunctions.firstLastEqual("Robert"));
       System.out.println(myFunctions.firstLastEqual("Ariana"));
		   System.out.println(myFunctions.firstLastEqual("Taco cat"));
		   System.out.println(myFunctions.firstLastEqual("42"));
       System.out.println(myFunctions.firstLastEqual(""));
       System.out.println(myFunctions.firstLastEqual("Goodness, clean up that dog"));
       System.out.println(myFunctions.firstLastEqual("HoHOho"));

		   System.out.println(); System.out.println();
	    }
	}//end TESTfirstLastEqual

	public static void TESThasPunctuation(ExerciseMethods1 myFunctions)
    {
      if(myFunctions.hasPunctuation("The total will be 12.50")  &&
        myFunctions.hasPunctuation("Today is the best ever! I wish you were here to enjoy it") &&
        !myFunctions.hasPunctuation("I had so much work today") &&
        !myFunctions.hasPunctuation("I'd love to get ice cream with you") &&
        !myFunctions.hasPunctuation("") &&
        !myFunctions.hasPunctuation("8675309") &&
        myFunctions.hasPunctuation("Where are you from?"))//
       {
        System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "hasPunctuation");
       }
       else
       {
          System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "hasPunctuation");
          System.out.println();

          System.out.println(myFunctions.hasPunctuation("The total will be 12.50"));
          System.out.println(myFunctions.hasPunctuation("Today is the best ever! I wish you were here to enjoy it"));
          System.out.println(myFunctions.hasPunctuation("I had so much work today"));
          System.out.println(myFunctions.hasPunctuation("I'd love to get ice cream with you"));
          System.out.println(myFunctions.hasPunctuation(""));
          System.out.println(myFunctions.hasPunctuation("8675309"));
          System.out.println(myFunctions.hasPunctuation("Where are you from?"));
          System.out.println(); System.out.println();
      }

	}//end TESThasPunctuation

  public static void TESTisDouble(ExerciseMethods1 myFunctions)
    {
      if(!myFunctions.isDouble("12564")  &&
        !myFunctions.isDouble("-567") &&
        !myFunctions.isDouble("") &&
        myFunctions.isDouble("23.9") &&
        !myFunctions.isDouble("Twenty. Two")&&
        myFunctions.isDouble("-78.13"))
       {
        System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "isDouble");
       }
       else
       {
          System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "isDouble");
          System.out.println();

          System.out.println(myFunctions.isDouble("12564"));
          System.out.println(myFunctions.isDouble("-567"));
          System.out.println(myFunctions.isDouble(""));
          System.out.println(myFunctions.isDouble("23.9"));
          System.out.println(myFunctions.isDouble("Twenty. Two"));
          System.out.println(myFunctions.isDouble("-78.13"));
          System.out.println(); System.out.println();
      }

	}//end TESTisDouble

  public static void TESTisWords(ExerciseMethods1 myFunctions)
    {
      if(myFunctions.isWords("Hello World")  &&
        myFunctions.isWords("what's up") &&
        !myFunctions.isWords("23.9") &&
        !myFunctions.isWords("Platform 9 and 3/4") &&
        myFunctions.isWords("Platform Nine and Three-Quarters") &&
        !myFunctions.isWords("") &&
        !myFunctions.isWords("87"))//
       {
        System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "isWords");
       }
       else
       {
          System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "isWords");
          System.out.println();

          System.out.println(myFunctions.isWords("Hello World"));
          System.out.println(myFunctions.isWords("what's up"));
          System.out.println(myFunctions.isWords("23.9"));
          System.out.println(myFunctions.isWords("Platform 9 and 3/4"));
          System.out.println(myFunctions.isWords("Platform Nine and Three-Quarters"));
          System.out.println(myFunctions.isWords(""));
          System.out.println(myFunctions.isWords("87"));
          System.out.println(); System.out.println();
      }

  }//end TESTisWords

  public static void TESTcountNum(ExerciseMethods1 myFunctions)
    {
      if(myFunctions.countNum(1, "I love CSCE111")==3  &&
        myFunctions.countNum(12, "The bill is $12.97")==1 &&
        myFunctions.countNum(33, "333 bananas for 33 monkeys.")==2 &&
        myFunctions.countNum(333, "My number is (333)-333-3333")==3 &&
        myFunctions.countNum(87, "I can't believe Aragorn is 83 years old. 83!")==0 &&
        myFunctions.countNum(41, "41414141")==4 &&
        myFunctions.countNum(0, "")==0)//
       {
        System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "countNum");
       }
       else
       {
          System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "countNum");
          System.out.println();

          System.out.println(myFunctions.countNum(1, "I love CSCE111"));
          System.out.println(myFunctions.countNum(12, "The bill is $12.97"));
          System.out.println(myFunctions.countNum(33, "333 bananas for 33 monkeys."));
          System.out.println(myFunctions.countNum(333, "My number is (333)-333-3333"));
          System.out.println(myFunctions.countNum(87, "I can't believe Aragorn is 83 years old. 83!"));
          System.out.println(myFunctions.countNum(41, "41414141"));
          System.out.println(myFunctions.countNum(0, ""));
          System.out.println(); System.out.println();
      }

  }//end TESTcountNum

  public static void TESTsumRepeat(ExerciseMethods1 myFunctions)
    {
	   if(myFunctions.sumRepeat(1, "I love CSCE111")==3  &&
       myFunctions.sumRepeat(12, "The bill is $12.97")==0 &&
       myFunctions.sumRepeat(33, "333 bananas for 33 monkeys.")==66 &&
       myFunctions.sumRepeat(333, "My number is (333)-333-3333")==999 &&
       myFunctions.sumRepeat(87, "I can't believe Aragorn is 83 years old. 83!")==0 &&
       myFunctions.sumRepeat(41, "41414141")==164 &&
       myFunctions.sumRepeat(0, "")==0)//
	    {
		   System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "sumRepeat");
	    }
	    else
	    {
	     System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "sumRepeat");
		   System.out.println();

       System.out.println(myFunctions.sumRepeat(1, "I love CSCE111"));
       System.out.println(myFunctions.sumRepeat(12, "The bill is $12.97"));
       System.out.println(myFunctions.sumRepeat(33, "333 bananas for 33 monkeys."));
       System.out.println(myFunctions.sumRepeat(333, "My number is (333)-333-3333"));
       System.out.println(myFunctions.sumRepeat(87, "I can't believe Aragorn is 83 years old. 83!"));
       System.out.println(myFunctions.sumRepeat(41, "41414141"));
       System.out.println(myFunctions.sumRepeat(0, ""));
		   System.out.println(); System.out.println();
	    }
	}//end TESTsumRepeat


	public static void TESTwhoWins(ExerciseMethods1 myFunctions)
    {
	   if(myFunctions.whoWins(8, 13, 21).equals("My number was closer to 21") &&
      myFunctions.whoWins(45, 35, 42).equals("Your number was closer to 42")&&
      myFunctions.whoWins(13, 7, 10).equals("Neither number was closer to 10")&&
      myFunctions.whoWins(100, 28, 35).equals("My number was closer to 35") &&
       myFunctions.whoWins(35, -44, 4).equals("Your number was closer to 4")&&
       myFunctions.whoWins(25, 55, 40).equals("Neither number was closer to 40"))
	    {
		   System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "whoWins");
	    }
	    else
	    {
	     System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "whoWins");
		   System.out.println();

		   System.out.println(myFunctions.whoWins(8, 13, 21));
       System.out.println(myFunctions.whoWins(45, 35, 42));
		   System.out.println(myFunctions.whoWins(13, 7, 10));
       System.out.println(myFunctions.whoWins(100, 28, 35));
       System.out.println(myFunctions.whoWins(35, -44, 4));
		   System.out.println(myFunctions.whoWins(25, 55, 40));
		   System.out.println(); System.out.println();
	    }
	}//end TESTwhoWins

  public static void TESTtopBottomSum(ExerciseMethods1 myFunctions)
    {
	   if(myFunctions.topBottomSum(3, 3, 3, 3) == 6 &&
      myFunctions.topBottomSum(1, 10, 45, 2) == 46 &&
      myFunctions.topBottomSum(-6, 2, -45, -8) == -43 &&
      myFunctions.topBottomSum(3, 113, 2, 200) == 202)
	    {
		   System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "topBottomSum");
	    }
	    else
	    {
	     System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "topBottomSum");
		   System.out.println();

		   System.out.println(myFunctions.topBottomSum(3, 3, 3, 3));
       System.out.println(myFunctions.topBottomSum(1, 10, 45, 2));
		   System.out.println(myFunctions.topBottomSum(-6, 2, -45, -8));
       System.out.println(myFunctions.topBottomSum(3, 113, 2, 200));
		   System.out.println(); System.out.println();
	    }
	}//end TESTtopBottomSum

  public static void TESTsumOfSquares(ExerciseMethods1 myFunctions)
    {
     if(myFunctions.sumOfSquares(3, 3) == 18 &&
      myFunctions.sumOfSquares(1, 10) == 385 &&
      myFunctions.sumOfSquares(-6, 1) == 92 &&
      myFunctions.sumOfSquares(5, 3) == 50)
      {
       System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "sumOfSquares");
      }
      else
      {
       System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "sumOfSquares");
       System.out.println();

       System.out.println(myFunctions.sumOfSquares(3, 3));
       System.out.println(myFunctions.sumOfSquares(1, 10));
       System.out.println(myFunctions.sumOfSquares(-6, 1));
       System.out.println(myFunctions.sumOfSquares(5, 3));
       System.out.println(); System.out.println();
      }
  }//end TESTsumOfSquares

  public static void TESTchangeDue(ExerciseMethods1 myFunctions)
    {
     if(myFunctions.changeDue(16.38, 20.38).equals("$4.00") &&
      myFunctions.changeDue(82.46, 100).equals("$17.54") &&
      myFunctions.changeDue(44.57, 35.75).equals("You owe $8.82") &&
      myFunctions.changeDue(30.55, 30.55).equals("No change due."))
      {
       System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "changeDue");
      }
      else
      {
       System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "changeDue");
       System.out.println();

       System.out.println(myFunctions.changeDue(16.38, 20.38));
       System.out.println(myFunctions.changeDue(82.46, 100));
       System.out.println(myFunctions.changeDue(44.57, 35.75));
       System.out.println(myFunctions.changeDue(30.55, 30.55));
       System.out.println(); System.out.println();
      }
  }//end TESTchangeDue

}	// End TestMethods1
