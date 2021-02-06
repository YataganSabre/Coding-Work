import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/*
Name: Kaan Montplaisir
UIN: 627003014
Date: 11/3/2020
Assignment: RunningDistance Calculator

OKay, for reference, I play a video game called World of Warcraft.
In that game, running takes up a lot of time, so I figured I'd try my hand at making a simple program that finds
out how much time In seconds it would take to run X distance in meters.
The math of which will be in the Formula.java
*/
public class RunningDistance extends JFrame implements ActionListener {
   private JLabel distanceLabel;
   private JLabel timeLabel;
   private JTextField time;
   private JTextField distance;
   private JButton calcButton;
   RunningDistance() {
      GridBagConstraints positionConst = null;
      setTitle("Running Time in WoW!:");
      // Set up labels for Distance and Time.
      distanceLabel = new JLabel("Distance in Meters:");
      timeLabel = new JLabel("Time in Seconds:");
      distance = new JTextField(15);
      distance.setEditable(true);
      distance.setText("0");
      time = new JTextField(15);
      time.setEditable(false);
      // Create a "Calculate" button
      calcButton = new JButton("Calculate");
      calcButton.addActionListener(this);
      // Use a GridBagLayout
      setLayout(new GridBagLayout());
      positionConst = new GridBagConstraints();
      // Grid location
      positionConst.gridx = 0;
      positionConst.gridy = 0;
      // Pixel Padding
      positionConst.insets = new Insets(10, 10, 10, 10);
      //Bunch of BS to set up where everything is.
      add(distanceLabel, positionConst);
      positionConst.gridx = 1;
      positionConst.gridy = 0;
      positionConst.insets = new Insets(10, 10, 10, 10);
      add(distance, positionConst);

      positionConst.gridx = 0;
      positionConst.gridy = 1;
      positionConst.insets = new Insets(10, 10, 10, 10);
      add(timeLabel, positionConst);

      positionConst.gridx = 1;
      positionConst.gridy = 1;
      positionConst.insets = new Insets(10, 10, 10, 10);
      add(time, positionConst);

      positionConst.gridx = 0;
      positionConst.gridy = 2;
      positionConst.insets = new Insets(10, 10, 10, 10);
      add(calcButton, positionConst);
   }
   @Override
   public void actionPerformed(ActionEvent event) {
      Formula form = new Formula();
      String userInput;
      double timetaken;
      userInput = distance.getText();
      double distanceinm = Double.parseDouble(userInput);
      timetaken = form.Formula(distanceinm);
      time.setText(Double.toString(timetaken));
   }
   public static void main(String[] args) {
      RunningDistance myFrame = new RunningDistance();
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.pack();
      myFrame.setVisible(true);
   }
}
