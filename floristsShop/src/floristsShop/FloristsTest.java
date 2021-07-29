/**
This program simulates shopping at a "self-service" florist.
There are flowers in the florist's shop, flowers have their names and colors. Flower prices are included in the price list.
Customers come to florist shop. Clients have names and they have some kind of money. They pick flowers and put them on a shopping cart. They then pay for the contents of the cart and repack it into a flower box
**/
package floristsShop;

public class FloristsTest {
// definition of the method for summing the value of flowers with the given color
 static int valueOf(Box box, String color) {
	 double flowerValue=0;
	 for( Flower Flower: box.getFlowerList())
		if(Flower.getColour().equals(color)) {
			flowerValue+=Flower.getAmount() * PriceList.getInstance().flowersPriceList.get(Flower.getName());
		}
		 return (int) flowerValue; 
		
 }

 public static void main(String[] args) {
   // Self-service florist shop
   // set the price list
   PriceList pl = PriceList.getInstance();
   pl.put("rose", 10.0);
   pl.put("lilac", 12.0);
   pl.put("peony", 8.0);

   // The client Janek comes in. He has 200 PLN
   Customer janek = new Customer("Janek", 200);

   // Takes a different Flower: 5 Roses, 5 Peonies, 3 Freesia, 3 Lilacs
   janek.get(new Rose(5));
   janek.get(new Peony(5));
   janek.get(new Freesia(3));
   janek.get(new Lilac(3));


   // He probably put them on a shopping cart
   // Let's see what's in there
   ShoppingCart janekCart= janek.getShoppingCart();
   System.out.println("Before payment " + janekCart);

   // Now he will pay for it
   janek.pay();

   // Didn't it turn out to be
   // that there are flowers in the basket for which the price has not been agreed yet?
   // In such a place they would be removed from the wheelchair and Janek would not pay for them
   // He may run out of money as well, then the money is put aside.

   System.out.println("After payment " + janek.getShoppingCart());

   // How much money has Janek's money left?
   System.out.println("Jank's money left : " + janek.getCash() + " PLN");

   //Now somehow I will pack the Flower (maybe in a box)
   Box janeksBox = new Box(janek);
   janek.pack(janeksBox);

   // What's in Janek's cart now ...
   // (there should be nothing left)
   System.out.println("After packing into box " + janek.getShoppingCart());

   //what's in the box
   System.out.println(janeksBox);

   // Let's see the value of the red flowers in Janek's box
   System.out.println("Red flowers in Janke's box cost: "
       + valueOf(janeksBox, "red"));

   //Now comes Stefan
   // only 60 PLN
   Customer stefan = new Customer("Stefan", 60);

   //But he had picked up a bit too many flowers for the sum
   stefan.get(new Lilac(3));
   stefan.get(new Rose(5));

   //what's in the cart
   System.out.println(stefan.getShoppingCart());

   //pays and packs in a box
   stefan.pay();
   Box stefansBox = new Box(stefan);
   stefan.pack(stefansBox);

   //what he finally managed to buy
   System.out.println(stefansBox);
   //... and how much money he has left
   System.out.println("Stefan lefts: " + stefan.getCash() + " PLN");
 }
}