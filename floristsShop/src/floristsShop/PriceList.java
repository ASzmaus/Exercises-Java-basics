package floristsShop;

import java.util.HashMap;

public class PriceList {

	public static PriceList pl;
	public HashMap<String, Double> flowersPriceList;
	
	public PriceList() {
		flowersPriceList=new HashMap<String,Double>();
	}
		
	public static  PriceList getInstance() {
		if(pl==null) {
		pl = new PriceList();
		} 
		return pl;
	}

	public void put(String name, double amount) {
		getInstance();
		flowersPriceList.put(name, amount);
	}
	
	public String toString() {
		for( String name: this.flowersPriceList.keySet()) {
		return  "price " + pl.flowersPriceList.get(name);
		}
		return "";
 }
}
