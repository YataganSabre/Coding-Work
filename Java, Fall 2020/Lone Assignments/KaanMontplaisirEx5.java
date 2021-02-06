/*
Name: Kaan Montplaisir
UIN: 627003014
Date: 9/23/2020
Assignment: Choose your own adventure
*/
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
class KaanMontplaisirEx5 {
  public static void main(String[] args) {
    int go = 0;
    while(go == 0){
      int set = Integer.parseInt(JOptionPane.showInputDialog("The dice of fate have been cast, chooe a number, and, your destiny!"));
      //lame way to set up a random seed
      Random r = new Random();
      r.setSeed(set);
      int r1 = r.nextInt(2) + 1; //keeping it basic, finds a random number of either 1 or 2
      int r2 = r.nextInt(2) + 1;
      JOptionPane.showMessageDialog(null, "You are a grand adventurer tasked with defeating Ainz, the Dark Wizard, hidden deep within his stone tower!");
      String wep = JOptionPane.showInputDialog("Before setting off on the long journey, you grab your trust knight's shield and your....(insert a weapon like a axe or hammer)");
      wep = wep.toLowerCase();
      String damagetype = ""; //setting it equal to nothing, or else it won't function properly
      switch(wep)
      {//sets up the type of damage later, so i don't smash with a spear, or stab with a axe.
        case "axe": case "sword":
        case "claymore":
        case "falchion":
        case "saber":
        case "blade":
          damagetype = "slash";
          break;
        case "mallet":
        case "hammer":
        case "warhammer":
        case "mace":
        case "flail":
        case "club":
          damagetype = "smash";
          break;
        case "spear":
        case "pike":
        case "dagger":
        case "knife":
        case "rapier":
        case "estoc":
          damagetype = "stab";
          break;
        default:
          damagetype = "assault";
          break;
      }
      JOptionPane.showMessageDialog(null, "After many weeks of travel, you finally gaze upon the tower, your knightly skills determine there are a couple of ways to enter...");
      String op1 = JOptionPane.showInputDialog("You can see a large, ornate door locked with a chain, you could break it...you also see a sewer section along the right. What do you do?");
      op1 = op1.toLowerCase(); //puts it in lower case to make the switch statement easier
      //I decided to use the str.contains() system in order to find phrases that would let me deduce what the user wanted to do, without reason.
      if((op1.contains("break")) || (op1.contains("smash")) || (op1.contains("lock")) || (op1.contains("chain")) || (op1.contains("door")) || (op1.contains("slash")) || (op1.contains("bludgeon")))
      {
        op1 = "door";
      }
      else if((op1.contains("crawl")) || (op1.contains("sewer")) || (op1.contains("go down")) || (op1.contains("sewage")) || (op1.contains("grate")) || (op1.contains("climb")) || (op1.contains("shimmy")))
      {
        op1 = "sewer";
      }
      else
      {
        op1 = "door"; //if it doesn't contain any of these, it will default to a brave knight just busting down the door
      }
      switch(op1)
      {
        case "door":
          JOptionPane.showMessageDialog(null, "Raising your mighty " + wep + " above your head, you slam it back down with gusto a top of the chained lock, freeing it from its cast iron grasp, and opening the door.");
          JOptionPane.showMessageDialog(null, "As you keep moving further, you hear the sound of chanting from above you. You must move quickly. You begin a steady jog to the stair case.");
          break;
        case "sewer":
          JOptionPane.showMessageDialog(null, "Begrudingly, you holster your " + wep + " to your body, and move to the grate of the sewer.");
          JOptionPane.showMessageDialog(null, "You know that a head on assault is foolish, but that doens't mean you will enjoy this");
          JOptionPane.showMessageDialog(null, "Further along, you find a ladder leading to a upper grate, as you exit, you find yourself at the base of the stairs.");
          break;
      }
      String op2 = "";
      switch (r1)
      {
        case 1:
        op2 = JOptionPane.showInputDialog("Oh no! Before you can climb the stairs proper, grand beast appears! A minotaur! It brandishes it's great warhammer, and begins to charge! What will you do!?");
        if((op2.contains("run")) || (op2.contains("flee")) || (op2.contains("escape")) || (op2.contains("avoid")) || (op2.contains("juke")) || (op2.contains("trick")))
        {
          JOptionPane.showMessageDialog(null, "Deciding that you've wasted enough time, you decide to rush past the beast. You throw a feint to the right, tricking it, you narrowly avoid a swing meant for your head.");
          JOptionPane.showMessageDialog(null, "Taking advantage of the beasts large size, you rush up the stairs, through the gate at the top and lock it from your side.");
        }
        else if ((op2.contains("attack")) || (op2.contains(damagetype)) || (op2.contains("assault")) || (op2.contains("fight")) || (op2.contains("battle")) || (op2.contains("kill")) || (op2.contains("slay")))
        {
          JOptionPane.showMessageDialog(null, "Gritting your teeth, you draw up your " + wep + " and prepare to fight the beast!");
          JOptionPane.showMessageDialog(null, "The beast may be grand, but it's attacks are slow. Though, even one hit may kill you. You bide your time, doing small strike until...");
          JOptionPane.showMessageDialog(null, "There! A opening! The beast swung wide, slamming its great hammer into the wall, getting it stuck!");
          JOptionPane.showMessageDialog(null, "Taking advantage of the moment, you dash forward and attack at its neck, " + damagetype + "ing it open, the beast's frame shudders, before it falls to the floor.");
          JOptionPane.showMessageDialog(null, "With a sense of satiscation, you rub the blood off your weapon into the creatures fur coat, and climb to the upper levels of the tower.");
        }
        break;
        case 2:
        op2 = JOptionPane.showInputDialog("As being to walk up the stairs, you suddenly hear sounds behind you...it's a horde of zombies! While slow, they're are dozens of them! What will you do!?");
        if((op2.contains("attack")) || (op2.contains("kill")) || (op2.contains("slay")) || (op2.contains("fight")) || (op2.contains("battle")) || (op2.contains("head")))
        {
          JOptionPane.showMessageDialog(null, "A scowl covers your face, you would NOT let such unholy creatures exist, even if it impedes your time!");
          JOptionPane.showMessageDialog(null, "As you brandish your weapon, you charge forth! Wildly " + damagetype + "ing at the monstrosities, knowing even a little bit of damage will rend flesh from bone.");
          JOptionPane.showMessageDialog(null, "After what feels like dozens of minutes and dozens of bodies, not a one of them stirs. Content, you wipe off some of the grim, and countine your ascent.");
          JOptionPane.showMessageDialog(null, "You wearily climb to the top of the staircase, and through a open door. You feel no need to close it behind you for...obvious reasons, but the smell is bothering you.");
        }
        else if((op2.contains("run")) || (op2.contains("flee")) || (op2.contains("escape")) || (op2.contains("avoid")) || (op2.contains("juke")) || (op2.contains("trick")))
        {
          JOptionPane.showMessageDialog(null, "You know better then to sit here fighting all these near undying monsters, thankfully they are slow.");
          JOptionPane.showMessageDialog(null, "You take a leuislery jog to the upper floors, lightly barricading the door as you know the monstors aren't nearly smart enough to know how to open it.");
        }
        break;
      }
      String op3 = "";
      int extra = 0;
      switch (r2)
      {
      case 1:
      op3 = JOptionPane.showInputDialog("As you turn your back to door to take in the room around you, you notice...a large set dinner? The food is extravagant, and fresh, despite the lack of guests. What will you do?");
      if((op3.contains("take")) || (op3.contains("eat")) || (op3.contains("bite")) || (op3.contains("rest")) || (op3.contains("sit")) || (op3.contains("taste")) || (op3.contains("drink")))
      {
        JOptionPane.showMessageDialog(null, "...you figure you could use a small rest, the wizard doesn't seem to CARE you're here if he just has stuff like this laying around.");
        JOptionPane.showMessageDialog(null, "You eye a supremely delicious prize: A roasted duck and a glass of red wine!");
        JOptionPane.showMessageDialog(null, "As  you reach for the glass of wine first, you hear a slight chittering sound of a insect, before the glass shakes");
        JOptionPane.showMessageDialog(null, "Horrified, you watch your delicious glass of wine shoots out it's own body, the glass flying toward your eye. You narrowly manage to stop it by having it pierce your hand instead.");
        JOptionPane.showMessageDialog(null, "Cursing under your breath, you realize that there could never be food and drink here, these are mimics! Beasts that trick their prey with false goods! You make a run to the door while more of the food starts to chitter.");
        extra = 1; //gonna use this later, to give player text that they have been wounded
      }
      else if((op3.contains("ignore")) || (op3.contains("leave")) || (op3.contains("move on")) || (op3.contains("run")) || (op3.contains("next")));
      {
        JOptionPane.showMessageDialog(null, "Food? Here? Doubtful. The wizard takes me for a fool. You keep going to the next door. As you close it and hear the chittering from where you were, you know you made the right move.");
      }
      break;
      case 2:
      op3 = JOptionPane.showInputDialog("As you turn away from the door, you hear a soft, feminine voice call out a name. Your name. Looking up, you know that voice. As you gaze onto a view of your own mother, who you saw slain by this very in the tower wizard, what will you do?");
      op3 = op3.toLowerCase();
      if((op3.contains("approach")) || (op3.contains("greet")) || (op3.contains("hug")) || (op3.contains("plead")) || (op3.contains("rush to")))
      {
        JOptionPane.showMessageDialog(null, "Tearfully, you move toward your beloved mother. As you approach her, you see your kind smile shift into a sinister grin and her eyes shift, becoming solid black.");
        JOptionPane.showMessageDialog(null, "You realize that this is merely a fake, a doppleganger not a moment too soon, as your 'mother' swings at you with her arm, a black blade sickly growing out of the skin, it only manages to cut a gash across your palm.");
        JOptionPane.showMessageDialog(null, "The creatures moment of surprise gone, it's grin turns to a scowl, it's scowl to a pained expresion as you " + damagetype + " their chest, with tears in your eyes. You know it's not her, but you still whisper 'Goodbye', for you never got the chance to before.");
        JOptionPane.showMessageDialog(null, "You know better, this is enough. No more distractions."); //i hope this felt genuinelly emotional, was reading a lot of fantasty stuff recently
        extra = 1;
      }
      else if((op3.contains("question")) || (op3.contains("attack")) || (op3.contains(wep)) || (op3.contains("interrogate")) || (op3.contains("back away")) || (op3.contains("who")) || (op3.contains(damagetype)))
      {
        JOptionPane.showMessageDialog(null, "Backing away, you draw your weapon. You know better, you saw your mother's body bleeding out on the floor of your families estate.");
        JOptionPane.showMessageDialog(null, "Whoever this is, they are not your mother. The fact that they would even attempt to imitate her makes your heart twist in pain and anger.");
        JOptionPane.showMessageDialog(null, "Your 'mother' looks shocked for a moment, before her expression turns into one of boredom, and she says to herself 'Tsk, thought I had that one.' With a snap of her fingers, she's gone in a black flash.");
        JOptionPane.showMessageDialog(null, "You chide yourself for even hesitating, no more distractions, you have a job to finish.");
      }
      break;
      }
      JOptionPane.showMessageDialog(null, "You push open a large, black door at the very top of the tower. A hunched, robed figure has his back toward you. It's him, Ainz, that menace.");
      JOptionPane.showMessageDialog(null, "Calling out to him in anger, his face turns to you, a deeply annoyed expression during to that of fear.");
      JOptionPane.showMessageDialog(null, "Dashing toward him, Ainz raises his wrought and dark magic enhanced staff. You guess he only has the chance to fire off one attack.");
      if(extra == 1)
      {
        JOptionPane.showMessageDialog(null, "Your recent wound throbs as you think about ending him.");
      }
      String op4 = JOptionPane.showInputDialog("He chants to his staff in a angered whisper, flames whirl at the tip, as a flaming ball hurs towards you with a heavy *thoom*, what do you do?");
      if((op4.contains("block")) || (op4.contains("parry")) || (op4.contains("absorb")))
      {
      JOptionPane.showMessageDialog(null, "You steady yourself and slide a few more meters, as the spell buffs up agaisnt your shield, the heat singing hairs off your head.");
      }
      else if ((op4.contains("dodge")) || (op4.contains("roll")) || (op4.contains("avoid")) || (op4.contains("dive")) || (op4.contains("down")) || (op4.contains("jump")) || (op4.contains("attack")));
      {
      JOptionPane.showMessageDialog(null, "You jump, and dive off to the side, dodging the fireball perfectly and catch yourself in a perfect role.");
      }
      JOptionPane.showMessageDialog(null, "You finish the run to the last meter, the wizard does not have enough time has you bring your " + wep + " to bear, " + damagetype + "ing them in the face, killing them.");
      JOptionPane.showMessageDialog(null, "It is over. You have fun.");
      Object[] options = { "I will go again! For Glory!", "No! My duty is done!" };
      go = JOptionPane.showOptionDialog(null, "Would you like to fight again?", "The adventure draws to a close!",
      JOptionPane.NO_OPTION, JOptionPane.WARNING_MESSAGE,
      null, options, options[0]);
    }
  } //end main
} //end class
