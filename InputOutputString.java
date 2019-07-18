import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;
public class InputOutputString {

	public static void main(String[] args){
		
	    //saveToFile();
		loadFromFile();
	}

	public static void saveToFile(){
		String firstname;
		String lastname;
		Integer age;
		
		Scanner in = new Scanner( System.in );
        System.out.println("Your firstname: ");
        firstname = in.next();
        System.out.println("Your lastname: ");
        lastname = in.next();
        System.out.println("Your age: ");
        age = in.nextInt();
//////////////OUTPUT TO FILE//////////////////
     try {
           FileWriter fr = new FileWriter( "person.txt", true );
           fr.write( firstname + " " + lastname + " " + age + "\n");
           fr.close();
     } catch(Exception e){
    	 System.out.println( "Error while saving file!" );
     }
	
	
	}
	
	public static void loadFromFile(){
		String firstname;
		String lastname;
		Integer age;
		
//////////////Input from File///////////////////
		try{
		Scanner in = new Scanner( new File( "person.txt") );
		firstname = in.next();
		lastname = in.next();
		age = in.nextInt();
		System.out.println( firstname + " " + lastname + " " + age + "\n");
		}catch(Exception e){
			System.out.println("Error while reading file!");
		}
	}
	
}
