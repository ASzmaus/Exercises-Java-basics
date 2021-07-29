package floristsShop;

public class Lilac extends Flower {
	
	public Lilac(int k) { 
		this.amount=k; 
		}
	public Lilac(String name, Double price) { super(name, price); }
		
	@Override
	public String getName() {
		return "lilac";
	}
	@Override
	public String getColour() {
		return "white";
	}
}	



