import java.util.Arrays;
import java.util.ArrayList;
/*
  TestMethods2 will test the homework ExerciseMethods2.java
  Adopted by Robert Lightfoot from Bruce Gooch's original exercise.

  2/62020
*/

public class TestMethods2
{
  //  setting colors based on computer type

      public static final String ANSI_RESET = colorSet("\u001B[0m");
      public static final String ANSI_RED = colorSet("\u001B[31m");
      public static final String ANSI_GREEN = colorSet("\u001B[32m");

	public static void main(String[] args)
	{

		ExerciseMethods2 myFunctions = new ExerciseMethods2();

    //Put individual test cases up here.

    //put true in the condition to test everything
    //put false in the condition to only test the code above.
    if(true){
      TESThasPair(myFunctions); //done
      TESTtotalChange(myFunctions); //done
      TESTsortNums(myFunctions); //done
      TESTarrayOfMultiples(myFunctions); //done
		  TESTchangeWords(myFunctions); //done
		  TESTconnect4(myFunctions); // done
      TESTsandwiched(myFunctions); //done
	    TESThelperSum(myFunctions); //done
		  TESTarrayOfSums(myFunctions); //done
		  TESTeditString(myFunctions);
    }//end if
	}//end main

  // DO NOT EDIT BELOW HERE.



	public static void TESThasPair(ExerciseMethods2 myFunctions)
    {
	   if(!myFunctions.hasPair(new int[] {1,2})  &&
		   myFunctions.hasPair(new int[] {3,4,3,5}) &&
  		 !myFunctions.hasPair(new int[] {3,4,6,5}) &&
  		 myFunctions.hasPair(new int[] {1,2,2,1,2,3,2}) &&
       !myFunctions.hasPair(new int[] {5,4,6,9,13,24,92})
       )//
	    {
		   System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "hasPair");

	    }
	    else
	    {
	     System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "hasPair");

         System.out.println(myFunctions.hasPair(new int[] {1,2})  );
  		   System.out.println(myFunctions.hasPair(new int[] {3,4,3,5}));
    		 System.out.println(myFunctions.hasPair(new int[] {3,4,6,5}) );
    		 System.out.println(myFunctions.hasPair(new int[] {1,2,2,1,2,3,2}));
         System.out.println(myFunctions.hasPair(new int[] {5,4,6,9,13,24,92}) );
	    }
	}//end TESThasPair

	public static void TESTtotalChange(ExerciseMethods2 myFunctions)
    {
      if(myFunctions.totalChange(new int[]{1, 2, 3, 4}).equals("$0.64")  &&
         myFunctions.totalChange(new int[]{6, 4, 5, 0}).equals("$2.15")  &&
         myFunctions.totalChange(new int[]{0, 15, 20, 42}).equals("$2.92")  &&
         myFunctions.totalChange(new int[]{28, 24, 15, 7}).equals("$10.22")
        )//
       {
        System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "totalChange");

       }
       else
       {
          System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "totalChange");

            System.out.println(myFunctions.totalChange(new int[]{1, 2, 3, 4}));
            System.out.println(myFunctions.totalChange(new int[]{6, 4, 5, 0}));
            System.out.println(myFunctions.totalChange(new int[]{0, 15, 20, 42}));
            System.out.println(myFunctions.totalChange(new int[]{28, 24, 15, 7}));
      }
	}//end TESTtotalChange

  public static void TESTsortNums(ExerciseMethods2 myFunctions)
    {
      if(Arrays.equals(myFunctions.sortNums(new int[]{2,1}), new int[]{1,2})   &&
         Arrays.equals(myFunctions.sortNums(new int[]{5,4,3,2,1}), new int[]{1,2,3,4,5})  &&
         Arrays.equals(myFunctions.sortNums(new int[]{67, 83, 27, 36}), new int[]{27, 36, 67, 83})  &&
         Arrays.equals(myFunctions.sortNums(new int[]{1,2,2,1,2,3,2}), new int[]{1,1,2,2,2,2,3})  &&
         Arrays.equals(myFunctions.sortNums(new int[]{-3, 6, 0, -8, 13}), new int[]{-8, -3, 0, 6, 13})
         )//
       {
        System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "sortNums");

       }
       else
       {
          System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "sortNums");

            printInts(myFunctions.sortNums(new int[]{2,1})   );
            printInts(myFunctions.sortNums(new int[]{5,4,3,2,1})  );
            printInts(myFunctions.sortNums(new int[]{67, 83, 27, 36}) );
            printInts(myFunctions.sortNums(new int[]{1,2,2,1,2,3,2}));
            printInts(myFunctions.sortNums(new int[]{-3, 6, 0, -8, 13}));
        }

	}//end TESTsortNums

  public static void TESTarrayOfMultiples(ExerciseMethods2 myFunctions)
    {
      if(Arrays.equals(myFunctions.arrayOfMultiples(4, 3), new int[] {3, 6, 9, 12})  &&
        Arrays.equals(myFunctions.arrayOfMultiples(7, 2), new int[] {2, 4, 6, 8, 10, 12, 14}) &&
        Arrays.equals(myFunctions.arrayOfMultiples(3, 12), new int[] {12, 24, 36}) &&
        Arrays.equals(myFunctions.arrayOfMultiples(0, 5), new int[] {}) &&
        Arrays.equals(myFunctions.arrayOfMultiples(-5, 25), new int[] {})
        )//
       {
        System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "arrayOfMultiples");

       }
       else
       {
          System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "arrayOfMultiples");

              printInts(myFunctions.arrayOfMultiples(4, 3));
              printInts(myFunctions.arrayOfMultiples(7, 2));
              printInts(myFunctions.arrayOfMultiples(3, 12));
              printInts(myFunctions.arrayOfMultiples(0, 5));
              printInts(myFunctions.arrayOfMultiples(-5, 25));
      }

  }//end TESTarrayOfMultiples

  public static void TESTchangeWords(ExerciseMethods2 myFunctions)
    {
      if(Arrays.equals(myFunctions.changeWords("never have I ever", "ever", "cheated"), new String[]{"never", "have", "I", "cheated"})  &&
        Arrays.equals(myFunctions.changeWords("Why why Why", "Why", "because"), new String[]{"because", "because", "because"}) &&
        Arrays.equals(myFunctions.changeWords("What is up bro", "hi", "hello"), new String[]{"What", "is", "up", "bro"}) &&
        Arrays.equals(myFunctions.changeWords("Hi nice to meet you", "hi", "hello"), new String[]{"hello", "nice", "to", "meet", "you"}) &&
        Arrays.equals(myFunctions.changeWords("", "", ""), new String[]{} )
        )//
       {
        System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "changeWords");

       }
       else
       {
          System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "changeWords");

          printS(myFunctions.changeWords("never have I ever", "ever", "cheated"));
          printS(myFunctions.changeWords("Why why Why", "Why", "because"));
          printS(myFunctions.changeWords("What is up bro", "hi", "hello"));
          printS(myFunctions.changeWords("Hi nice to meet you", "hi", "hello"));
          printS(myFunctions.changeWords("", "", ""));
      }
  }//end TESTchangeWords

  public static void TESTconnect4(ExerciseMethods2 myFunctions)
    {
	   if(myFunctions.connect4 (new char[][] {{'x','x','x','x'},
							                               {'o','o','x','o'},
                                             {'x','o','o','o'},
							                               {'x','o','o','x'}}) == 'x' &&
        myFunctions.connect4 (new char[][] {{'o','x','x','x'},
  							                             {'o','o','x','o'},
                                             {'x','o','o','o'},
  							                             {'x','x','x','o'}}) == 'o' &&
        myFunctions.connect4 (new char[][] {{'x','x','o','x'},
								                             {'o','o','x','o'},
                                             {'x','o','o','x'},
								                             {'x','o','o','x'}}) == 't' &&
        myFunctions.connect4 (new char[][] {{'x','x','x','x'},
								                             {'o','o','o','o'},
                                             {'x','o','x','o'},
								                             {'x','o','o','x'}}) == 'x')
	    {
		   System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "connect4");

     }//emd if passed
	    else
	    {
	     System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "connect4");

       System.out.println(myFunctions.connect4(new char[][] {{'x','x','x','x'},
  							                                             {'o','o','x','o'},
                                                             {'x','o','o','o'},
  							                                             {'x','o','o','x'}}));
       System.out.println(myFunctions.connect4(new char[][] {{'o','x','x','x'},
                                                             {'o','o','x','o'},
                                                             {'x','o','o','o'},
                                                             {'x','x','x','o'}}) );
       System.out.println(myFunctions.connect4(new char[][] {{'x','x','o','x'},
                                                             {'o','o','x','o'},
                                                             {'x','o','o','x'},
                                                             {'x','o','o','x'}}));
       System.out.println(myFunctions.connect4(new char[][] {{'x','x','x','x'},
                                                             {'o','o','o','o'},
                                                             {'x','o','x','o'},
                                                             {'x','o','o','x'}})) ;

	    }//end else
	}//end TESTconnect4


	public static void TESThelperSum(ExerciseMethods2 myFunctions)
    {
      ArrayList<Double> dubs1 = buildDarray(new Double[]{4.3, 16.7});
      ArrayList<Double> dubs2 = buildDarray(new Double[]{25.7, 21.2, 27.5});
      ArrayList<Double> dubs3 = buildDarray(new Double[]{2.5});
      ArrayList<Double> dubs4 = buildDarray(new Double[]{2.49, 12.49, 40.2, 42.5});
	   if(myFunctions.helperSum(dubs1) == 20 &&
      myFunctions.helperSum(dubs2) == 75 &&
      myFunctions.helperSum(dubs3) == 5 &&
      myFunctions.helperSum(dubs4) == 95  )
	    {
		   System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "helperSum");

	    }
	    else
	    {
	     System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "helperSum");

     System.out.println(myFunctions.helperSum(dubs1));
     System.out.println(myFunctions.helperSum(dubs2));
     System.out.println(myFunctions.helperSum(dubs3));
     System.out.println(myFunctions.helperSum(dubs4));
	    }
	}//end TESThelperSum

  public static void TESTsandwiched(ExerciseMethods2 myFunctions)
    {
      ArrayList<Integer> ints1 = buildIarray(new Integer[]{4,5,4,6,7,3});
      ArrayList<Integer> ints2 = buildIarray(new Integer[]{2,1,2});
      ArrayList<Integer> ints3 = buildIarray(new Integer[]{3,3,3});
      ArrayList<Integer> ints4 = buildIarray(new Integer[]{4,5,6,4});
      ArrayList<Integer> ints5 = buildIarray(new Integer[]{1,1,2,3,1,4,1});
      if(myFunctions.sandwiched(ints1, 4) &&
         myFunctions.sandwiched(ints2, 2) &&
         !myFunctions.sandwiched(ints3, 3) &&
         !myFunctions.sandwiched(ints4, 4) &&
         myFunctions.sandwiched(ints5, 1)  )
  	    {
  		   System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "sandwiched");

	    }
	    else
	    {
	     System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "sandwiched");

       System.out.println(myFunctions.sandwiched(ints1, 4) );
       System.out.println(myFunctions.sandwiched(ints2, 2) );
       System.out.println(myFunctions.sandwiched(ints3, 3) );
       System.out.println(myFunctions.sandwiched(ints4, 4) );
       System.out.println(myFunctions.sandwiched(ints5, 1));
	    }
	}//end TESTsandwiched

  public static void TESTarrayOfSums(ExerciseMethods2 myFunctions)
    {
      ArrayList<Integer> ints1 = buildIarray(new Integer[]{5,11,21});
      ArrayList<Integer> ints2 = buildIarray(new Integer[]{15, 23, 21, 11});
      ArrayList<Integer> ints3 = buildIarray(new Integer[]{18, 28, 25, 12, 2});
      ArrayList<Integer> ints4 = buildIarray(new Integer[]{10,10,10});
      ArrayList<Integer> ints5 = buildIarray(new Integer[]{6, 7, 8, 7, 6});
      ArrayList<Integer> ints6 = buildIarray(new Integer[]{40, 41, 42, 41, 5});
      ArrayList<Integer> ints11 = buildIarray(new Integer[]{2,4,7});
      ArrayList<Integer> ints12 = buildIarray(new Integer[]{3,7,14});
      ArrayList<Integer> ints21 = buildIarray(new Integer[]{6,13,4,8});
      ArrayList<Integer> ints22 = buildIarray(new Integer[]{7,5,9});
      ArrayList<Integer> ints23 = buildIarray(new Integer[]{2,5,8,3});
      ArrayList<Integer> ints31 = buildIarray(new Integer[]{6,13,4,8});
      ArrayList<Integer> ints32 = buildIarray(new Integer[]{7,5,9});
      ArrayList<Integer> ints33 = buildIarray(new Integer[]{2,5,8,3});
      ArrayList<Integer> ints34 = buildIarray(new Integer[]{3,5,4,1,2});
      ArrayList<Integer> ints41 = buildIarray(new Integer[]{8,6});
      ArrayList<Integer> ints42 = buildIarray(new Integer[]{2,4,10});
      ArrayList<Integer> ints51 = buildIarray(new Integer[]{2,2,2,2,2});
      ArrayList<Integer> ints52 = buildIarray(new Integer[]{3,2,5,2,3});
      ArrayList<Integer> ints53 = buildIarray(new Integer[]{1,3,1,3,1});
      ArrayList<Integer> ints61 = buildIarray(new Integer[]{11,12,13,14});
      ArrayList<Integer> ints62 = buildIarray(new Integer[]{14,13,12,11});
      ArrayList<Integer> ints63 = buildIarray(new Integer[]{10,10,10,10});
      ArrayList<Integer> ints64 = buildIarray(new Integer[]{5,6,7,6,5});

     if(compare(myFunctions.arrayOfSums(ints11, ints12), ints1)  &&
        compare(myFunctions.arrayOfSums(ints21, ints22, ints23), ints2) &&
        compare(myFunctions.arrayOfSums(ints31, ints32, ints33, ints34), ints3) &&
        compare(myFunctions.arrayOfSums(ints41, ints42), ints4) &&
        compare(myFunctions.arrayOfSums(ints51, ints52, ints53), ints5) &&
        compare(myFunctions.arrayOfSums(ints61, ints62, ints63, ints64), ints6) )
      {
       System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "arrayOfSums");

      }
      else
      {
       System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "arrayOfSums");

       System.out.println(myFunctions.arrayOfSums(ints11, ints12));
       System.out.println(myFunctions.arrayOfSums(ints21, ints22, ints23));
       System.out.println(myFunctions.arrayOfSums(ints31, ints32, ints33, ints34));
       System.out.println(myFunctions.arrayOfSums(ints41, ints42));
       System.out.println(myFunctions.arrayOfSums(ints51, ints52, ints53));
       System.out.println(myFunctions.arrayOfSums(ints61, ints62, ints63, ints64));
      }
  }//end TESTarrayOfSums

  public static void TESTeditString(ExerciseMethods2 myFunctions)
    {
      ArrayList<String> words1 = buildSarray(new String[]{"What", "is", "up"});
      ArrayList<String> words2 = buildSarray(new String[]{"What", "is", "up", "brother"});
      ArrayList<String> words3 = buildSarray(new String[]{"What", "is", "up", "my", "friend"});
      ArrayList<String> words4 = buildSarray(new String[]{"I", "can", "do", "much"});
      ArrayList<String> words5 = buildSarray(new String[]{"Tis", "but", "a", "scratch", "mark"});
      ArrayList<String> words6 = buildSarray(new String[]{"I", "can", "code", "in", "html", "and", "java"});
      ArrayList<String> words11 = buildSarray(new String[]{"bro"});
      ArrayList<String> words21 = buildSarray(new String[]{"bro", "brother"});
      ArrayList<String> words31 = buildSarray(new String[]{"my", "3", "friend", "4"});
      ArrayList<String> words41 = buildSarray(new String[]{"only", "so"});
      ArrayList<String> words51 = buildSarray(new String[]{"flesh", "scratch", "wound", "mark"});
      ArrayList<String> words61 = buildSarray(new String[]{"html", "4", "and", "5"});

      if(compareS(myFunctions.editString("What is up bro", "remove", words11), words1) &&
        compareS(myFunctions.editString("What is up bro", "replace", words21), words2)  &&
        compareS(myFunctions.editString("What is up", "add", words31), words3)  &&
        compareS(myFunctions.editString("I can only do so much", "remove", words41), words4) &&
        compareS(myFunctions.editString("Tis but a flesh wound", "replace", words51), words5)  &&
        compareS(myFunctions.editString("I can code in java", "add", words61), words6))
      {
       System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "editString");

      }
      else
      {
       System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "editString");
       System.out.println(myFunctions.editString("What is up bro", "remove", words11));
       System.out.println(myFunctions.editString("What is up bro", "replace", words21));
       System.out.println(myFunctions.editString("What is up", "add", words31));
       System.out.println(myFunctions.editString("I can only do so much", "remove", words41));
       System.out.println(myFunctions.editString("Tis but a flesh wound", "replace", words51));
       System.out.println(myFunctions.editString("I can code in java", "add", words61));
      }
  }//end TESTeditString

  //for functionality
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

  public static void printInts(int[] nums) {
    for(int i = 0; i<nums.length; i++){
      System.out.print(nums[i]+" ");
    }
    System.out.println();
  }//end printInts

  public static void printS(String[] words) {
    for(int i = 0; i<words.length; i++){
      System.out.print(words[i]+" ");
    }
    System.out.println();
  }//end printInts
  public static ArrayList<Double> buildDarray(Double[] nums) {
    ArrayList<Double> newNums = new ArrayList<Double>();
    for (int i = 0; i<nums.length; i++ ) {
      newNums.add(nums[i]);
    }
    return newNums;
  }
  public static ArrayList<Integer> buildIarray(Integer[] nums) {
    ArrayList<Integer> newNums = new ArrayList<Integer>();
    for (int i = 0; i<nums.length; i++ ) {
      newNums.add(nums[i]);
    }
    return newNums;
  }//end buildIarray
  public static ArrayList<String> buildSarray(String[] words) {
    ArrayList<String> newWords = new ArrayList<String>();
    for (int i = 0; i<words.length; i++ ) {
      newWords.add(words[i]);
    }
    return newWords;
  }//end buildIarray
  public static boolean compare(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
    if(nums1.size()!=nums2.size()) return false;
    for (int i = 0; i<nums1.size(); i++ ) {
      if(nums1.get(i)!=nums2.get(i)) return false;
    }
    return true;
  }//end compare
  public static boolean compareS(ArrayList<String> nums1, ArrayList<String> nums2) {
    if(nums1.size()!=nums2.size()) return false;
    for (int i = 0; i<nums1.size(); i++ ) {
      if(!nums1.get(i).equals(nums2.get(i))) return false;
    }
    return true;
  }
}	// End TestMethods2
