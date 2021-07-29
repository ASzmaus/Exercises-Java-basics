package GoodsThreads;

public class SumWeight implements Runnable {
	 public GoodsList goodsList=GoodsList.getInstance();
	 
	@Override
	 public void run() {
  		
	   int sumaWag = 0;
	   int count=1;
	   synchronized(goodsList) {
			try {
				while(goodsList.isEmpty())
					goodsList.wait();
			} catch (InterruptedException e1) {
					e1.printStackTrace();
			}
		
	   for(int k=0; k<goodsList.size(); k++) {
		    
		    try {
			      while(CreateObject.ready==false)
			    	  goodsList.wait();		      
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
		   count++;
	       sumaWag += goodsList.get(k).getWaga();
	       if((count)%100==0 && k<goodsList.size()-1) {
	    	   System.out.println("count weight " + count + " goods"); 
	    	   if((count)%200==0) {
	    		   CreateObject.ready = false;
	    		   goodsList.notifyAll();
	    	   }
	       }
	   }
	   System.out.println(sumaWag);
	  }
	}
}