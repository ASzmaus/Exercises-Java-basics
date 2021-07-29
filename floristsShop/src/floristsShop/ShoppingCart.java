package floristsShop;


public class ShoppingCart extends Container {
 
public ShoppingCart(Customer customer) { super(customer);}

public void addFlower( Flower Flower) {
	Flower.setPrice(this.priceList.flowersPriceList.get(Flower.getName()));
	flowersList.add( Flower);
	}

public void deleteFlowerWithoutPrice() {  
		flowersList.removeIf(s-> PriceList.getInstance().flowersPriceList.get(s.getName())==null);
}

public double valueGoodsInCart() {
	double biezaceSuma;
	double suma = 0;
	for( Flower Flower: this.flowersList) {
		biezaceSuma=this.priceList.flowersPriceList.get(Flower.getName())* Flower.getAmount(); 
		suma += biezaceSuma;
	}
		return suma;
	}

@Override
public String toString() {
	if(this.customer.getIfPacked() == false) {
		String string="Owners's cart "+ this.customer.getfirstName();
		for( Flower Flower: flowersList) {
			double price = 0;
			   if((priceList.flowersPriceList.get(Flower.getName())) != null) {
				   price = this.priceList.flowersPriceList.get(Flower.getName()); 
			   }else price = -1;
			  string= String.join(" \n", string, Flower.getName() + ", colour: " + Flower.getColour() + ", amount: " + Flower.getAmount() + ", price: " + price);
		}
			return string;
	}else if(this.customer.getIfPacked() == true) {
			return "Owner's cart " + this.customer.getfirstName() + " -- empty";
	}
	return "";
}
}