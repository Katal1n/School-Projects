import java.util.Scanner;

public class saseiunieproblem {

	public static void main(String[] args) {

		
		final float PRICE_ONE_PIZZA   = 75.50f;
		final float PRICE_ONE_SPRITE  = 25.00f;
		final float PRICE_PER_10km    = 15.00f;
               byte quantity_of_pizza;
               byte quantity_of_sprite; 
               float distance;
		
           Scanner in = new Scanner (System.in);
           
         System.out.print("Ordered pizza: ");
         quantity_of_pizza = in.nextByte();
         
         System.out.print("Ordered Sprites: ");
         quantity_of_sprite = in.nextByte();
         
         System.out.print("How far to deliver (km): " );
         distance = in.nextByte();
         float DeliveryCost = distance * PRICE_PER_10km;
              
         System.out.print("You have to pay: " + (((PRICE_ONE_PIZZA * quantity_of_pizza) + (PRICE_ONE_SPRITE * quantity_of_sprite)) + DeliveryCost ) + " mdl" );                  
	}

}
