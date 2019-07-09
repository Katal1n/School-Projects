
public class KithchenApp {

	public static void main(String[] args) {

		Human.putWaterIntoKettle(0.9);
		System.out.println("Water remaining " + Water.volume_l);
		System.out.println("Water in the kettle " + Kettle.volume_l);
		Kettle.startHeating();
		
		
	}

}
class CacaoRecipe{
	final static double water_l = 23;
	final static double sugar_kg = 0.01;
	final static double cacao_kg = 0.02;
}

class Sugar{
	static double weight_kg = 1.567;
}
class Water{
	static double volume_l = 6.0;
}
class Cacao{
	static double weight_kg = 5.0;
}

class Kettle{
	final static double MAX_VOLUME_L = 2.0;
	      static double volume_l = 0.0;
	      static int    temperature_c  = 20;
	      public static void startHeating(){
	    	  if (volume_l <= 0.1){System.err.println("Not enought water");}
	    	  else{System.out.println("Started Heating...");	    		  
	    	  }
	    	  System.out.println("HEATING...");
	    	  temperature_c = 100;
	    	  while (temperature_c <= 100 ){	    
	    		    System.out.println(temperature_c); temperature_c++;
	    }
	    }
}
class Human {
	static String full_name = "Travolta Junior";
	public static void putWaterIntoKettle(double volume){
		Water.volume_l -= volume;
		Kettle.volume_l += volume;
	}
	public static void putWaterIntoCup(double volume){
		Kettle.volume_l -= volume;
		CacaoCup.volume_l += volume;
	}
}
	class CacaoCup{
		static double MAxVolume_l = 0.25;
		static double volume_l = 0.0;


}