package floristsShop;

public class Box extends Container {

	public Box(Customer customer) {
		super(customer);
	}

	@Override
	public String toString() {
		String string="Owner box " +  customer.getfirstName();
		for(Flower flower: flowersList) {
			string= String.join(" \n", string, flower.getName() + ", colour: " + flower.getColour() + ", amount: " + flower.getAmount() + ", price: " + this.priceList.flowersPriceList.get(flower.getName()));
		}
		return string;
	}
}

