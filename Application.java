import com.github.javafaker.Faker;
import java.util.Locale;

public class Application {

	public static void main(String[] args) {
		
		
		Student s1 = new Student("Ion Embrion", 19, "Chisinau, Stefan cel Mare 1" );
		System.out.println(s1);
		Student s2 = new Student();
		System.out.println(s2);

	}

}

class Student {
	public String fullname;
	public int age;
	public String adress;
	public Student(String fullname, int age, String adress) {
		super();
		this.fullname = fullname;
		this.age = age;
		this.adress = adress;
	}
	public Student (){
		Faker f = new Faker(new Locale("ru"));
		
		this.fullname = f.name().fullName();
		this.age = f.random().nextInt(18, 25);
		this.adress = f.address().fullAddress();

	}
	
	public String toString() {
		 return "Student\n[fullname=" + fullname + ", \nage=" + age + ", \nadress=" + adress + "]";
	}
	
}