
public class patruiunie {

	
	public static void main(String[] args) {
		
		int r=1;
		while ( r <= 10 )
		{int s = 1;
			 while ( s <= 10 )
			 {if (r==1 || r==10 || s==1 || s==10)
			 {System.out.print("# ");} 
				 else {System.out.print("* ");}
			s++;}
		System.out.println();
		
		r++;}
	}
}
