package floristsShop;

import java.util.ArrayList;

public abstract class Container{
	 protected ArrayList<Flower> flowersList;
	 protected PriceList priceList=PriceList.getInstance();
	 protected Customer customer;
	 
	 public Container() {
	 }
	 
	 public Container(Customer customer){
		this.customer=customer;
		flowersList =  new ArrayList<>();
	 }
	 
	 public ArrayList<Flower> getFlowerList() {
			return flowersList;
		}
		  
	public void setFlowerList(ArrayList<Flower> flowersList) {
			this.flowersList = flowersList;
		}

}
