package inf1563;

public class Cercle {
	public static void main (String[] args){
		
		
		int hours = 2;
		
		int minutes = 5;
		
		int seconds = 59;
		
		double distance = 42.195;
		
		double velocity;
		
		double Timing = ( hours * 3600 ) + ( minutes * 60 ) + ( seconds );
		
		Timing = Timing /3600;
				
		velocity = distance / Timing;
		
		
		System.out.println(velocity);
		}
}
