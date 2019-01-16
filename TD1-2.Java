package inf1563;

public class NYSprint {
	public static void main (String[] args){
		
		
		int hours = 2;
		
		int minutes = 5;
		
		int seconds = 59;
		
		double distance = 42.195;
		
		double velocity;
		
		double Timimg = ( hours * 3600 ) + ( minutes * 60 ) + ( seconds );
				
		velocity = distance / (Timimg /3600);
		
		
		System.out.println(velocity);
		}
}
