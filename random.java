import javax.swing.*;  
import java.util.*;

class OptionPaneExample
{ 
   JFrame f;
   OptionPaneExample()
   {
      f=new JFrame();  
      Random r=new Random();
      int number=1+r.nextInt(100);
      int guess;
      int k = 5;
      int i;
      System.out.println("Choose a number between 1 to 100. Guess the number within 5 trials.");
      for (i = 1; i <= k; i++)
          {
              System.out.println("Guess the number:");
              String guess1=JOptionPane.showInputDialog(f,"Choose a number between 1 to 100." + " \n " + " Guess the number within 5 trials.");
              guess = Integer.parseInt(guess1);
              if (number == guess) 
                   {
                       System.out.println("Congratulations!!! " + "\n" + "You guessed the number.");
                       JOptionPane.showMessageDialog(f,"Congratulations!!! " + "\n" + "You guessed the number.");
                       break;
                   }
              else if (number > guess) 
                   {
                       System.out.println("The number is greater than " + guess);
                       JOptionPane.showMessageDialog(f,"The number is greater than " + guess);
                   }
              else if (number < guess) 
                   {
                        System.out.println("The number is less than " + guess);
                        JOptionPane.showMessageDialog(f,"The number is less than " + guess);
                   }
          }
 
       if (i == k+1) 
          {
             System.out.println("Oh no!! You have exhausted 5 trials.");
             System.out.println("The number was " + number);
             JOptionPane.showMessageDialog(f,"Oh no!! You have exhausted 5 trials." + "\n" + "The number was " + number);
          }
    }   
}   


public class random
{
public static void main(String[] args) 
{  
    OptionPaneExample o=new OptionPaneExample();  
    
}  
}

