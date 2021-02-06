/*
Name: Kaan Montplaisir
UIN: 627003014
Date: 10/27/2020
Assignment: GUi
*/

import javax.swing.JFrame;

public class HistogramViewer {
   public static void main(String[] args) {
      JFrame appFrame = new JFrame();
      HistogramComponent histogramComponent = new HistogramComponent();

      appFrame.setSize(400, 250);
      appFrame.setTitle("Histogram Viewer");
      appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Add the HistogramComponent object to the frame
      appFrame.add(histogramComponent);

      // Set the frame and its contents visible
      appFrame.setVisible(true);
   }
}
