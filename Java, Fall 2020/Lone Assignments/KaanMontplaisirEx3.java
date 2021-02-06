import java.util.Scanner;
/*
Name: Kaan Montplaisir
UIN: 627003014
Date: 9/7/2020
Section: CSCE 111, 501
*/
class KaanMontplaisirEx3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String name;
    System.out.println("Lets play the Name Game!");
    System.out.println("What is your name? Enter here with the start capitilized: ");
    //specifies that I"d like a capital at the start just so I don't have do to other stuff.
    name = input.next();
    String name2 = name.toLowerCase(); //so I don't have to bother with capitals.
    char c1 = name2.charAt(0);
    char c2 = name2.charAt(1);
    //I'll use these later so I can test if there is a vowel at the 1st or 2nd spot.
    if (name2.contains("itch")|| (name2.contains("uck")) || (name2.contains("ucker"))){
      System.out.println('\u0007');
      System.out.println("Nuh-Uh! That's a Swear!");
      System.exit(0); //stops the program, since I can't use 'break'
      //figured out that i could just do this to find out if a word could form a swear
    }

    if ((c1 == 'a') || (c1 == 'e') || (c1 == 'i') || (c1 == 'o') || (c1 == 'u')){

      if ((c2 == 'a') || (c2 == 'e') || (c2 == 'i') || (c2 == 'o') || (c2 == 'u')){
        name2 = name2.substring(1); //cuts off first vowel
          }
      else{
        //no change
          } //checks to see if a name starts with 1 or two vowels.

      }
    else { //assumes the name starts with a non vowel

      if ((c2 == 'a') || (c2 == 'e') || (c2 == 'i') || (c2 == 'o') || (c2 == 'u')){
        name2 = name2.substring(1); //removes first letter
          }
      else{
        name2 = name2.substring(2); //removes first 2 letters
          }
        }
      //okay we're out of if else hell, onto the song.
      //put in some mild formatting
      System.out.println("  "+ name + ", " + name + " bo B" + name2 );
      System.out.println("  Banana fana fo F" + name2);
      System.out.println("    Fe Fi mo M" + name2);
      System.out.println("\t" +name + "!\n\n   Thank you for playing!");
    }
  } //end main //end class
