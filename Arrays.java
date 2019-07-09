import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

		String[] products_name  = {"pepeni", "carnat", "paine", "pilimeni", "ceai"};
         float[] products_price = { 10.00f, 150.00f, 0.50f, 40.00f, 50.00f};
         
       Scanner in = new Scanner(System.in);
       System.out.println("Enter minimal price: ");
       float min_price = in.nextFloat();
       System.out.println("Enter maximal price: ");
       float max_price = in.nextFloat();        
         
         ///////////////////////////////////////////////////////////////////
         for(int index = 0; index < products_name; index++){
        	 System.out.println(products_name[index] + " " + products_price[index] + "USD");}
         }
}
