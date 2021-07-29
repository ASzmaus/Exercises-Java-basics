package floristsShop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;


public class Customer   {
	private String firstName;
	private double money;
	private ShoppingCart cart=null;
	private boolean ifPacked = false;
		
	public Customer(String firstName, double money) {
		this.firstName= firstName;
		this.money= money;
		cart = new ShoppingCart(this);
	}
	
	public String getfirstName() {
		return firstName;
	}

	public ShoppingCart getShoppingCart() { 
		return this.cart;
	}

	public Double getCash() { 
		return this.money;
	}

	public void pack(Box newPudelko) { 
	
		ArrayList<Flower> listCopy = new ArrayList<Flower>(this.cart.getFlowerList());
		newPudelko.setFlowerList(listCopy);
		this.getShoppingCart().getFlowerList().clear();
		this.ifPacked = true;
	}


	public void checkedIfClientCanHaveGoods(double money){
		double currentSum=0;
		double tempSum=0;
		Collections.sort(cart.getFlowerList(), new Flower.CompId());
		for( Flower Flower: cart.getFlowerList()){
			currentSum=PriceList.getInstance().flowersPriceList.get(Flower.getName())* Flower.getAmount(); 
			tempSum += currentSum;
			if(money< tempSum) {
				Flower.setToDelete(true);
			}
		}
		 cart.getFlowerList().removeIf(s -> s.isToDelete()== true);
}
	
	public double pay() { 
		this.cart.deleteFlowerWithoutPrice();
		checkedIfClientCanHaveGoods(money);
		money-= cart.valueGoodsInCart();
		return money;
	}
	
	public boolean  getIfPacked() {
		return ifPacked;
	}
	
	public Customer getCustomer() {
		return this;
	}

	public ShoppingCart get(Flower nFlower){ 
		cart.addFlower(nFlower);
		return cart;
	}
}