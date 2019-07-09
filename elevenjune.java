import java.util.Scanner;
public class elevenjune {

	public static void main(String[] args) {

		Scanner in = new Scanner( System.in );
		int n;
		float m = 0.00f;
		float sum = 0.00f;
		
        do
        {m++;
        System.out.println("Enter an integer for n: ");
        n = in.nextInt();
        sum = sum + n;
        }
        while ( n !=0 );
        
        float a = sum / m;
        
        System.out.println("the sum of integers: " + sum);
        System.out.println("media aritmetica: "+ a);
        	

	}

}
