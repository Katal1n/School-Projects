//class of the aplication
public class REstaurantApp {

	public static void main(String[] args) {
		
		Restaurant.menu();
		Client.myName();
		
	}

}

//class of restaurant
class Restaurant{
	public static void menu(){
		System.out.println(
				 "  MENU\n"
				 + "1. Food\n"
				 + "2. Drinks\n"
			);	 
	}
	
	
}
class Client{
	public static void myName(){
		System.out.println("Client: David Jhones");
	}
}