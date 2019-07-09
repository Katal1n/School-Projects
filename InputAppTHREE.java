import java.util.Scanner;

public class InputAppTHREE {

	public static void main(String[] args) {
		
	     Scanner in = new Scanner(System.in);
	     System.out.print("Enter a number from 0 to 1000 (Start): ");
	     int start = in.nextInt();
	     System.out.print("Enter a number from 0 to 1000 (Finish): ");
	     int finish = in.nextInt();

	     if( start < 0 || finish > 1000 || start > 1000 || finish < 0 ){System.out.println("Invalid Values");}  
	     else{
	     
	        while ( start <= finish ){System.out.println( start );
	         start++;}
	        }
	}

}
