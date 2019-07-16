
public class ObjectRelationshipApp {

	public static void main(String[] args) {

		Woman w = new Woman ( "Anastasia Moroz");
		Man   m = new Man ( "Ivan Ivanov");
		House h = new House ( "ALexandru cel Bun 9 ", 228.50f);
		
		//relationships - marriage
		w.husband = m;
		m.wife    = w;
		
		//relationships - properties
		m.property = h;
		h.owners[0] = m;
		h.owners[1] = m.wife;
		
		System.out.println(w.husband.property.address);
	
		for( Person p: h.owners ){
			System.out.println( p.fullname );
		}
			
		}
	
	
	}
	


class Person{
	public String fullname;
}
class Woman extends Person{

    public Man husband;
    public House property;
	public Woman(String fullname) {
		this.fullname = fullname;
	}
	
}

class Man extends Person{

    public Woman wife;
    public House property;
	public Man(String fullname) {
		this.fullname = fullname;
	}
}

class House{
	public String address;
	float area_m;
	Person[] owners;
	public House(String address, float area_m) {
		owners = new Person[2];
		this.address = address;
		this.area_m = area_m;
	}
	
}
