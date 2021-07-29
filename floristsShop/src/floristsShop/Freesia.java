package floristsShop;

public class Freesia extends Flower {

	public Freesia(int k) { 
		this.amount=k; 
		}
	public Freesia(String name, Double price) { super(name,price); }
	
	@Override
	public String getName() {
		return "freesia";
	}
	@Override
	public String getColour() {
		return "yellow";
	}
}	



