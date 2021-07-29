package floristsShop;

public class Rose extends Flower {
	   
	public Rose(int k) { 
		this.amount=k; 
		}
	
	public Rose(String name, Double price) { super(name, price); }
	
	@Override
	public String getName() {
		return "rose";
	}
	@Override
	public String getColour() {
		return "red";
	}
}	

