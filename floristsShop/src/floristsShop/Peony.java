package floristsShop;

public class Peony extends Flower {
	
	public Peony(int k) { 
		this.amount=k; 
		}
	public Peony(String name, Double price) { super(name,price); }
	
	
	@Override
	public String getName() {
		return "peony";
	}
	@Override
	public String getColour() {
		return "red";
	}
}	



