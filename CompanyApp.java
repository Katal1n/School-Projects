
public class CompanyApp {

	public static void main(String[] args) {

		Company my_company = new Company();
                my_company.setType("LLC");
                System.out.println( my_company.getType() );
                
                my_company.setType1("Kalex");
                System.out.println( my_company.getType1() );
                
                my_company.setType2(2002);
                System.out.println( my_company.getType2() );
                
                my_company.setType3(9999);
                System.out.println( my_company.getType3() );
                
                my_company.setType4(2000000.5f);
                System.out.println( my_company.getType4() );
                
                my_company.setLocation(new Adress ("Moldova", "Ialoveni", "Centru" ));
	
        Company competitor_company = new Company("SRL", "Regular Company", 2018, 1000, 10000000.9f);     
           System.out.println(competitor_company);
	}
}

class Company{
	private String type;
	private String name;
	private int    year;
	private int employees;
	private float capital;
	private Adress location;
	
	public Company(){
		
	}
	
public Company(String type, String name, int year, int employees, float capital) {

	    this.type = type;
		this.name = name;
		this.setType2(year);
		this.employees = employees;
		this.capital = capital;
	}
//getters and setters
    public void setLocation(Adress location){
    	this.location = location;
    }

    public String getType(){
    	return type;
    }
    public void setType(String value){
    	type = value;
    }
    public String getType1(){
    	return name;
    }
    public void setType1(String name){
    	this.name = name;
    }
    public int getType2(){
    	return year;
    }
    public void setType2(int year){
    	if(year>=1900 && year<= 2019){
        	this.year = year;
    	}else{
    		System.err.println("Wrong year value!");
    	}
    }
    public int getType3(){
    	return employees;
    }
    public void setType3(int value){
    	employees = value;
    }
    public float getType4(){
    	return capital;
    }
    public void setType4(float capital){
    	this.capital = capital;
    }
}
class Adress{
	String country;
	String city;
	String street;
	public Adress(String country, String city, String street) {
		this.country = country;
		this.city = city;
		this.street = street;
	}

	
}