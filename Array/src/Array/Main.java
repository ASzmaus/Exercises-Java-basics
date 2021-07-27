package Array;
/* Write a program that reads integers from a file (saved in your home directory) (numbers in the file are separated by any whitespace) and creates an array containing these numbers.
In the array initialized in this way, the program finds the maximum value and all indices in the array where such value is found.
The program prints to the console:
in the first line - all elements of the array, separated by spaces
in the second line - the maximum value,
in the third line - indexes of the array where this value is located.*/
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    String fname = System.getProperty("user.home") + "/tab.txt";            
    File name =new File(fname);
    Scanner sc= null;
    try {
		sc = new Scanner(name);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (sc.hasNext()) {
			list.add(sc.nextInt());
		}
		
		int[] tab = new int[list.size()];
		for (int k = 0; k < list.size(); k++) {
			tab[k] = list.get(k);
			System.out.print(tab[k] + " ");
		}
		Collections.sort(list);
		int MAX=list.get(list.size()-1);
		System.out.println("\n"+ MAX);
		    
		for (int k = 0; k < list.size(); k++) {
			if( tab[k]== MAX ) {
				System.out.print(k + " ");
			 }
		}
	} catch (Exception e) {
		System.out.println("***");
	}finally {
		sc.close();
	}
  }
}
