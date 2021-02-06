/*
Name: Kaan Montplaisir
UIN: 627003014
Date: 11/9/2020

class Dog creates an object called Dog
each Dog has an attribute of name, breed, and age
*/
class Dog{
	//private variables that exist within the class
	private String name;
	private String breed;
	private int age;

	/**
	Dog is the constructor that has defoult values
	*/
	public Dog(){
		name = "NO NAME";
		breed = "UNKNOWN";
		age = -1;
	}//end Dog constructor

	/**
	getName is a getter that returns the name
	@return name
	*/
	public String getName(){ //complete this method
		return name;
	}//end getName

	/**
	setName is a setter that changes the name
	@param sentName the new name
	void method
	*/
	public void setName(String sentName){ //complete this method
		name = sentName;
	}//end setName

	/**
	getBreed is a getter that returns the name
	@return breed
	*/
	public String getBreed(){ //complete this method
		return breed;
	}//end getBreed

	/**
	setBreed is a setter that changes the breed
	@param sentBreed the new name
	void method
	*/
	public void setBreed(String sentBreed){ //complete this method
		breed = sentBreed;
	}//end setBreed

	/**
	getAge is a getter that returns the name
	@return age
	*/
	public int getAge(){ //complete this method
		return age;
	}//end getAge

	/**
	setAge is a setter that changes the age
	@param sentAge the new name
	void method
	*/
	public void setAge(int sentAge){ //complete this method
		age = sentAge;
	}//end setAge

	/**
	printDog prints the currently stored values of name, breed, and age
	void method
	*/
	public void printDog(){
		System.out.println("Dog Name: " + name);
		System.out.println("Dog Breed: " + breed);
		System.out.println("Dog Age: " + age);
	}//end printDog
}//end class Dog
