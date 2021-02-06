/*
Name: Kaan Montplaisir
UIN: 627003014
Date: 9/15/2020
Section: 501
Assignment: Exercise 4
OS: Windows 10
*/
import javax.swing.JOptionPane;
class KaanMontplaisirEx4 {
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "Howdy! This program will calculate the average of your grades!");
    int go = 0;
    while(go == 0){ //while true, will keep finding averages
      double totalgrade = 0; //gonna use this later to pile up the values
      double average = 0;
      //Below takes input from InputDialog, then converts to int.
      int inputQuiz = Integer.parseInt(JOptionPane.showInputDialog("To start, how many grades (Quizes or Tests) do you have?"));
      //Informs user, prompts input. Below will cancel the program if they do not enter a number greater then 0.
      if(inputQuiz <= 0){
        JOptionPane.showMessageDialog(null, "That is not a valid input! Must input a number equal to 1 or greater!");
        System.exit(0); //Program Death
      }
      for (int i = 0; i < inputQuiz; i++){
        totalgrade += Double.parseDouble(JOptionPane.showInputDialog("Input value for grade " + (i + 1) + "."));
      }
      average = totalgrade/inputQuiz; //takes the total grades, divides by the amount of grades given
      JOptionPane.showMessageDialog(null, "Your average is %" + String.format("%.2f", average) + "!");
      //formats average onto a Dialog box.
      Object[] options = { "Yes, I'd like to average again.", "No, quit program." };
      go = JOptionPane.showOptionDialog(null, "Would you like to go again?", "Program is near end!",
      JOptionPane.NO_OPTION, JOptionPane.WARNING_MESSAGE,
      null, options, options[0]); //button system, hitting "No I'm done" will end program.
    }

  } //end main
} //end class
