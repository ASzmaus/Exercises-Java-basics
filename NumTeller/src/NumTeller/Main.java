package NumTeller;

import static javax.swing.JOptionPane.*;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
/* Build a NumTeller class that returns the given number with a word suffix using the following formula:
0 = 0-owy
1 = 1-szy
2 = 2-gi
3 = 3-ci
4 = 4-ty
give three integers separated by spaces and show them on the following lines on the console */
public class Main {
  
  public static void main(String[] args) {
    String input = showInputDialog("Please give 3 number");
    Scanner scan = new Scanner(input);
    try {
    String msg = "";
    msg += NumTeller.say(scan.nextInt()) + '\n'; 
    msg += NumTeller.say(scan.nextInt()) + '\n';
    msg += NumTeller.say(scan.nextInt()) + '\n';
    System.out.println(msg);
    } catch (InputMismatchException f) {
    	System.out.println("The given number should be of the type int-finish action");
    } catch (NoSuchElementException e) {
        System.out.println("No number / numbers were given - exit");
    }finally {
    	scan.close();
    }
  }

}
