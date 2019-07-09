
public class FindFoodArray {

	public static void main(String[] args) {

		String[] food = {
				       "Pizza, 400g, 70MDL",
			           "Lasagna, 500g, 100MDL",
			           "Mamaliga, 1000g, 20MDL",
		     	       "Tiramisu, 150g, 150MDL",
	     		       "Caesar, 300g, 50MDL",
		                };

		for( int i = 0; i<5; i++ ){
			String[] parts = food[i].split(",");
			System.out.println( "Meal - " + parts[0].toUpperCase() + "  weight: " + parts[1] + "  Price: " + parts[2]);
		}
		
		
		
	}

}
