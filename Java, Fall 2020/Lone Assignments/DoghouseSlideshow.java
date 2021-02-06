import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
John Blanton
627000953
11/10/2020
DoghouseSlideshow.java
*/

//Inspiration code for my work was found on Stackoverflow.com

class DoghouseSlideshow extends JFrame  implements ActionListener{

ImageIcon picture[];
JLabel box;
JButton firstbutton,lastbutton;
int i;
JPanel panel;

public DoghouseSlideshow(){
    setLayout(new BorderLayout( ));
    setSize(900, 800);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    JPanel panel = new JPanel(new FlowLayout());
    firstbutton = new JButton("<<");
    lastbutton = new JButton(">>");
    panel.add(firstbutton);
    panel.add(lastbutton);
    add(panel,BorderLayout.SOUTH);
    firstbutton.addActionListener(this);
    lastbutton.addActionListener(this);
    picture = new ImageIcon[7];
    picture[0] = new ImageIcon("C:/Users/Blanton/Desktop/Java labs/IMG-5907.PNG");
    picture[1] = new ImageIcon("C:/Users/Blanton/Desktop/Java labs/IMG-5908.PNG");
		picture[2] = new ImageIcon("C:/Users/Blanton/Desktop/Java labs/IMG-5909.PNG");
		picture[3] = new ImageIcon("C:/Users/Blanton/Desktop/Java labs/IMG-5911.PNG");
		picture[4] = new ImageIcon("C:/Users/Blanton/Desktop/Java labs/IMG-5912.PNG");
		picture[5] = new ImageIcon("C:/Users/Blanton/Desktop/Java labs/IMG-5913.PNG");
		picture[6] = new ImageIcon("C:/Users/Blanton/Desktop/Java labs/IMG-5914.PNG");
    box = new JLabel("",JLabel.CENTER);
    add(box,BorderLayout.CENTER);
    box.setIcon(picture[0]);
	}
public  void actionPerformed(ActionEvent set){
  if(set.getSource() == firstbutton){
    if(i == 0){
      JOptionPane.showMessageDialog(null,"This is a dog house that I built for my dogs last christmas break. My" + '\n' + " border collie (Scout) and blue heeler (Pepper) are very territorial dogs" + '\n' + " and needed a larger doghouse where they each had their own space." + '\n' + " So I went to Home Depot and built them a duplex with a partision wall.");
    }
    else{
      i = i - 1;
      box.setIcon(picture[i]);
    }
  }
    if(set.getSource() == lastbutton){
      if(i == picture.length - 1){
        JOptionPane.showMessageDialog(null,"Ultimately Scout and Peper were really happy with their new home" + '\n' + " and started to get along with each over much better. They slept better at" + '\n' + " night and appreciated how their new house was insulated with better" + '\n' + " wood than their previous store bought house was. Thanks for watching!");
        }
        else{
          i = i + 1;
          box.setIcon(picture[i]);
          }
        }
     }
public static void main(String args[]){
    DoghouseSlideshow show = new DoghouseSlideshow();
	}
}
