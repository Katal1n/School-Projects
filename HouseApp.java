
public class HouseApp {

	public static void main(String[] args) {

		
		
	}

}

class House{
	static class Safe{
		static int money    = 10000;
  final static int PIN      = 123456; 
	    static boolean open = false;
	    public static void openDoor(){
	    	open = true;
	    }
	   public static void closeDoor(){
		   open = false;
	   }
	   public static boolean isOpenDoor(){
           return open;
	}
}
}
class Family{
	static class Father{
      static String name = "John Travolta";
      static short year  = 1957;
	}
}
