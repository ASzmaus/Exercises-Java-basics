package floristsShop;

import java.util.Comparator;

abstract class Flower {
	
	protected Double price;
	protected int amount;
	protected boolean toDelete=false;

	
	Flower() { }
	Flower(String s, Double p) {  }
	Flower(int amount){ this.amount=amount;}

	public abstract String getName();
	public abstract String getColour();
		
	public int getAmount() {
		return this.amount;
	}
	
	public Double getPrice() {
		return this.price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public boolean isToDelete() {
		return toDelete;
	}
	public void setToDelete(boolean toDelete) {
		this.toDelete = toDelete;
	}
	
	 public static class CompId implements Comparator<Flower> {
	        @Override
	        public int compare(Flower arg0, Flower arg1) {
	        	double comp0 = arg0.price*arg0.amount;
	        	double comp1 = arg1.price*arg1.amount;
	            return (int) (comp0 - comp1);
	        }
	    }
}





