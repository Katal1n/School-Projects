
public class arrayapp {
// Location Array App
	public static void main(String[] args) {

		String[] locations;
		locations = new String[5];
		
		locations[0] = new String("Chisinau,Eminescu,88");
		locations[1] = new String("Chisinau,Eminescu,101");
		locations[2] = new String("Chisinau,Vieru,1");
		locations[3] = new String("Chisinau,Micle,2");
		locations[4] = new String("Chisinau,Tighina,65");
		for( int i = 0; i<5; i++ ){
			String[] parts = locations[i].split(",");
			System.out.println( "City - " + parts[0].toUpperCase() + "  str. " + parts[1] + "  nr. " + parts[2]);
		}
		
		
     }
}
