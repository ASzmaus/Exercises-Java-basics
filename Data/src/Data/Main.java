/**
 * The program is to specify how much of the incoming data will fit on the disk, for each portion of incoming data, it is to print out information about its number and size, and to provide the disk space occupied by the packages.
Each subsequent incoming packet (from the second to the fifth inclusive) is twice the size of the previous one, and from the sixth onwards, it is 3 times the size of the previous one.
Data (retrieved from a file saved in the home directory:
• size of the first packet in bytes,
• the size of the available disk space in megabytes.
Data is written as integers separated by whitespace.
Results (written to the console in the following lines):
• number of packages in the available disk space,
• for each accepted packet (still on the disk) its number and size in bytes.
• the size of the disk space occupied by the packages
 **/

package Data;

import java.io.File;
import java.util.Scanner;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception{
    String fname = System.getProperty("user.home") + "/pack.txt";      
    File name = new File(fname);
    int sizeOfPackage=1;
    int sizeOfDrive=1;
    int numberOfPackage=1;
    int sizeOfOccupiedSpace=0;
    int temp=0;
    Scanner sc =null;
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    try {
		sc = new Scanner(name);
		sizeOfPackage = sc.nextInt(); 
		sizeOfDrive = 1048576*sc.nextInt();
		
		if (!sc.hasNextInt()) {
 			    	while(sizeOfOccupiedSpace<=sizeOfDrive) {
 			    		
			    		if (numberOfPackage>=2 && numberOfPackage<=5) {
			    			sizeOfPackage=2*sizeOfPackage;
 			    	    }
			    		else if (numberOfPackage>=6){
			    			sizeOfPackage=3*sizeOfPackage;
			    		} 
			    		
			    		if(sizeOfOccupiedSpace + sizeOfPackage<=sizeOfDrive) {
			    			sizeOfOccupiedSpace+=sizeOfPackage;
			    		map.put(numberOfPackage, sizeOfPackage );
			    		temp=numberOfPackage;
			    		++numberOfPackage;
			    		}
			    		else {
			    			break;
			    		}
			    	}
 			    	System.out.println(temp);
 			    	for (int i=1; i<=map.size(); i++) {
 			    		System.out.println(i +" "+ map.get(i));
 			    	}
			    	System.out.println(sizeOfOccupiedSpace);
		 } 
		else {
			throw new Exception();
		}
	} catch (Exception e) {
		System.out.println("***");
	} finally {
		sc.close();
	}
  }
}
