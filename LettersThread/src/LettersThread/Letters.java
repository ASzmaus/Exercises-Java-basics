/**
 The program allows for the parallel running of codes, which print every second the letters given in the string passed to the class constructor. 
 **/
package LettersThread;

import java.util.ArrayList;

public class Letters extends Thread {
	
	public ArrayList<Thread> listThread = new ArrayList<Thread>();
	
	public Letters(String s) {
		for( int k=0; k< s.length(); k++) {
			String actualValue = s.substring(k, k+1);
			Runnable runnable= () -> {
                while(true) {
                    try{
                        System.out.print(actualValue);
                        Thread.sleep(1250);
                    } catch (InterruptedException e){
                       break;
                    }
                }
            };
			listThread.add(new Thread(runnable, "Thread " + actualValue));
		}
	}
	
	public ArrayList<Thread> getThreads() {
		return listThread ;
	}
}
