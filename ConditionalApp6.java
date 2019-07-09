
public class ConditionalApp6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1;
		while ( n <= 10){
			if (n / 3 == 1 || n / 3 == 2 || n / 3 == 3){
				System.out.print("*");
			} else {System.out.print("#");
			}
			n++;
		}
	}

}
