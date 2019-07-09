
public class GarageApp {

	public static void main(String[] args) {		
		CabCompany.info();
	}
}

class CabCompany{
	static String name = "Elite Cab International";
	static short employees = 1000;
	static short year = 2000;
	static float capital = 1000000.5f;
	static class Location {
		static String city   = "NY";
		static String street = "Fifth Avenue";
		static byte number   = 88; 
	}
	
	
	public static void info(){
		System.out.println(
		 	   "\"" + name + "\"" +"(" + Location.city + ")" + "\n"
			  + "         " + year + "\n"
			  +"Administrators  -  " + (employees - CabGarage.employees_drivers) + "\n"
			  +"Drivers  -   " +  CabGarage.employees_drivers + "\n"
			  +"Garages are here: " + CabGarage.Location.city + CabGarage.Location.street + CabGarage.Location.number
				);
	}
	
	}
class CabGarage{
	static short cabs_total   = 2000;
	static short cabs_damaged = 300;
	static short employees_drivers = 800;
	static class Location {
		static String city   = "Washington  ";
		static String street = "White House ";
		static int number   =  228; 	
		  
	}
}