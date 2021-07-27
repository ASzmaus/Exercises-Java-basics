package Iteration;

import java.io.File;
import java.util.Scanner;
/*Write a program that reads three numbers from a file stored in your home directory and adds integers from start to end, 
 * but stops summing when the value of the sum reaches or exceeds the given limit. */
public class Main {

  public static void main(String[] args) throws Exception{
    
    int sum = 0;
    int start=0;
    int end =0;
    int limit=0;
    Scanner sc=null;
	try {
		String fname = System.getProperty("user.home") + "/iter.txt"; 
		File name =  new File(fname);
		sc = new Scanner(name);
		start = sc.nextInt(); 
	    end = sc.nextInt(); 
	    limit = sc.nextInt(); 
	    if (!sc.hasNextInt()) {
	    for ( int i=start; i<= end; i++) {
	    	if ( sum < limit) {
	    		sum += i;
	    	 }
	    	else {
	    		break;
	    	}
	     }
	    System.out.println(sum);
	    } 
	    else {
	    	throw new Exception();
	    }
	} catch (Exception exc) {
    	System.out.println("***");
    }finally {
		sc.close();
    }
  }
}

