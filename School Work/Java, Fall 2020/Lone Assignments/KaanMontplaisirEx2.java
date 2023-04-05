/*
Name: Kaan Montplaisir
UIN: 627003014
Date: 9/1/2020
CSCE 111-501
Assignment: Ex2
*/

class lab2_1 {
  public static void main(String[] args) {
    System.out.println("\t  ___                             _        _____  _____  _____  _____ ");
    System.out.println("\t / _ \\                           | |      / __  \\|  _  |/ __  \\|  _  |");
    System.out.println("\t/ /_\\ \\ _   _   __ _  _   _  ___ | |_     `' / /'| |/' |`' / /'| |/' |");
    System.out.println("\t|  _  || | | | / _` || | | |/ __|| __|      / /  |  /| |  / /  |  /| |");
    System.out.println("\t| | | || |_| || (_| || |_| |\\__ \\| |_  _  ./ /___\\ |_/ /./ /___\\ |_/ /");
    System.out.println("\t\\_| |_/ \\__,_| \\__, | \\__,_||___/ \\__|( ) \\_____/ \\___/ \\_____/ \\___/ ");
    System.out.println("\t                __/ |                 |/                              ");
    System.out.println("\t              |___/                                                  \n\n");
    //I chose the Doom font for the text, and tabbed it all forward so it would be more center of the calender
    var daysofweek = "      Su           Mo          Tu            We           Thu         Fri          Sa";
    var blankline = "|            |            |            |             |            |           |           |";
    System.out.println(daysofweek); //I had to declare and assign some string variables so here you go.
    System.out.println(" ________________________________________________________________________________________"); //This begins the formatting of the calender.
    System.out.println("/            |            |            |             |            |           | 1st       \\"); //decided to give the corners of the calender bends to show that I can use \\ properly
    System.out.println(blankline); //I had it formatted with the lines already but I figured I'd just asssign it a value for the credit.
    System.out.println("|____________|____________|____________|_____________|____________|___________|___________|");
    System.out.println("| 2nd Kaan's | 3rd        | 4th        | 5th         |  6th       |7th        | 8th       |"); //Figured I'd add my B-day.
    System.out.println("|  B-day     |            |            |             |            |           |           |");
    System.out.println("|____________|____________|____________|_____________|____________|___________|___________|");
    System.out.println("| 9th        | 10th       | 11th       | 12th        | 13th       | 14th      | 15th      |");
    System.out.println(blankline);
    System.out.println("|____________|____________|____________|_____________|____________|___________|___________|");
    System.out.println("| 16th       | 17th       | 18th       | 19th        | 20th       | 21st      | 22nd      |");
    System.out.println(blankline);
    System.out.println("|____________|____________|____________|_____________|____________|___________|___________|");
    System.out.println("| 23rd       | 24th       | 25th       | 26th        | 27th       | 28th      | 29th      |");
    System.out.println(blankline);
    System.out.println("|____________|____________|____________|_____________|____________|___________|___________|");
    System.out.println("| 30th       | 31st       |            |             |            |           |           |");
    System.out.println(blankline);
    System.out.println("\\____________|____________|____________|_____________|____________|___________|___________/");
  //The calender itself was pretty simple to make, and once I had the formatting done for a single line, I just made a 6x7
  //Grid and added and moved spaces in order for the text to not gank around the walls of its box.







  } //end main
} //end class
