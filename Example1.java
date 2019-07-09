
public class Example1 {

	public static void main(String[] args) {

		Animal a = new Animal(2010, true);
        a.Eat();
        a.Breath();
        Chicken c = new Chicken(2018, true);
        c.Eat();
        c.Breath();	
        c.about();
	    Fox f = new Fox (2008, true);
	    f.Eat();
        f.Breath();	
        f.about();
        f.about2();
	}
}

//Basic Class
class Animal{
	static int current_year = 2019;
	int year;
	boolean alive;
	static int birth = 2017; 

	public Animal() {
	}
	
	public Animal(int year, boolean alive) {
		this.year = year;
		this.alive = alive;
	}
	public void Eat(){
		System.out.println("Eating");
	}
	public void Breath(){
		System.out.println("Breathing");
	}
   public void about(){
	   System.out.println("Animal's age = " + (current_year - birth) );
   }
}

//Derivated Class
class Chicken extends Animal{
    
	int eggs;
	public Chicken(int year, boolean alive) {
		this.year = year;
		this.alive = alive;
	}
	public void Eat(){
		System.out.println("Eating");
	}
	public void Breath(){
		System.out.println("Breathing");
	}
	public void about(){
		   System.out.println("Animal's age = " + (current_year - birth) );
	   }
	public void Speak(){
		System.out.println("Cod-co-dac");
	}
	public void makeEgg(){
			System.out.println("+1 egg");
			eggs ++;
	}	
}

class Fox extends Animal{
    int kills;
    int fox_birth = 2008;
    public Fox(int year, boolean alive) {
		this.year = year;
		this.alive = alive;
	}
	public void Speak(){
		System.out.println("sssssss");
    }
	public void Hunt(){
		System.out.println("+1 kill");
		kills ++;
    }
	public void Eat(){
		System.out.println("Eating");
	}
	public void Breath(){
		System.out.println("Breathing");
	}
	public void about(){
		   System.out.println("Animal's age = " + (current_year - fox_birth) );
	   }
	public void about2(){
		System.out.println("I am a Fox");
	}
}

