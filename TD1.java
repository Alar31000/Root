package inf1563;

public class Cercle {
	public static void main (String[] args){
		
		//Calcul du pÃ©rimÃ¨tre d'un cercle
		
		//donnÃ©e d'entrÃ©e: le rayon
		double rayon = 7;
		
		//donnÃ©e de sortie: le pÃ©rimÃ¨tre
		double perimetre;
		
		//donnÃ©e de sortie: l'aire
		double Aire;
		
		//donnÃ©e de sortie: Le Volume
		double Volume;
		
		//Calcul avec la constante PI de la bibliothÃ¨que Math
		perimetre = 2 * Math.PI * rayon;
		
		//Calcul de l'aire du cercle
		Aire = Math.PI * rayon * rayon;
		
		//Calcul du volume de la sphere
		Volume = (4/3) * Math.PI * rayon * rayon * rayon;
		
		//Affichage du rÃ©sultat
		System.out.println("Le périmetre du cercle de rayon "+rayon+" est: "+perimetre);
		System.out.println("L'aire du cercle de rayon "+rayon+" est: "+Aire);
		System.out.println("Le volume de la sphere de rayon "+rayon+" est: "+Volume);
		}
}
