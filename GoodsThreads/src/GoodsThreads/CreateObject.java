package GoodsThreads;
 
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateObject implements Runnable {
	 public GoodsList goodsList=GoodsList.getInstance();
	 static boolean ready =false;

	  @Override
	  public void run() {
		  
	  Scanner in =null;
	  try {
		  synchronized(goodsList) {
			  
		  File file = new File("../goods.txt");
	      in = new Scanner(file);
		  while(in.hasNext()) {
			  try {
			      while(CreateObject.ready==true)
			    	  goodsList.wait();		      
			  } catch (InterruptedException e) { 
					e.printStackTrace();
			  }
			  int amountCreatedObjects = 0;
			  Towar towar = new Towar(in.nextInt(), in.nextInt());	
			  goodsList.add(towar);
			  amountCreatedObjects=goodsList.size();
			  if(amountCreatedObjects%200==0 ) {
						  System.out.println("created "+amountCreatedObjects + " objects");
						  CreateObject.ready = true;
						  goodsList.notifyAll();
			   }
		  }
		  try {
		      while(CreateObject.ready==true)
		    	  goodsList.wait();		      
		  } catch (InterruptedException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
		  CreateObject.ready = true;
		  goodsList.notifyAll();
	  }
	  } catch (Exception e) {
		  e.printStackTrace();
	  }finally {
		  in.close();
	  }
   }
}