import java.util.*;
/*
Name: Kaan Montplaisir
UIN: 627003014
Date: 11/9/2020
Assignment: Lab Work Week 13.1
*/

/*
Instructions: Read the provided instructions and comments
*/

class lab13_1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Looks like you are adopting a new puppy today! \nHere is the information we currently have on file.\n");

    Dog d = new Dog();
    d.printDog();
    System.out.println("I am going to ask you a series of questions to get more information on your dog.");

    System.out.print("\nWhat is your dog's name? ");
    String userDogName = sc.nextLine();
    d.setName(userDogName);
    //update the dog's name with a setter
    System.out.println("Your dog's name is: " + d.getName());
    //print out the dog's name to validate it is correct (use the appropriate getter method from Dog.java to do this)

    System.out.print("\nWhat is your dog's breed? ");
    String userDogBreed = sc.nextLine();
    d.setBreed(userDogBreed);
    //update the dog's breed
    System.out.println("Your dog's breed is: " + d.getBreed());
    //print out the dog's breed to validate it is correct (use the appropriate method from Dog.java to do this)

    System.out.print("\nWhat is your dog's age? ");
    int userDogAge = sc.nextInt();
    d.setAge(userDogAge);
    //update the dog's age
    System.out.println("Your dog's age is: " + d.getAge());
    //print out the dog's age to validate it is correct (use the appropraite method from Dog.java to do this)

    System.out.println("\nLooks like we have all the information we need. Please let me know if it looks incorrect.");
    d.printDog();
    //print out the dog's updated information using the printDog method from Dog.java

  } //end main
} //end class
