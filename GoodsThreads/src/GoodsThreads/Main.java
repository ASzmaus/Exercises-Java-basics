/**
The code running in thread A reads information about goods from the file in the form:item id weight.
Outputs information about the number of created objects to the console. Information is to be output every 200 objects
The code running in parallel in another thread (B) reaches for these objects, adds up the weight of the goods and outputs to the console information about the sum performed every 100 objects
Finally, it gives the total weight of all items.
 */

package GoodsThreads;


public class Main {
				 
	 public static void main(String[] args) {
	  
		 CreateObject CreateObject = new CreateObject();
		 Thread threadA = new Thread(CreateObject);
	        
		 SumWeight sumWeight = new SumWeight();
		 Thread threadB = new Thread(sumWeight);
		 threadA.start();     
		 threadB.start();
	      	  
 }
}
