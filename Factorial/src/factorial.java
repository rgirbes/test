import java.util.*;

/**
 * Classe que calcula el factorial d�un nombre.
 *
 * @author Roger Girbes
 * @version 2014
 */
public class factorial {
	/**
	 * Calcula el factorial de n. n! = n * (n-1) * (n-2) * (n-3) * ... * 1
	 * 
	 * @param n �s el n�mero al que es calcular� el factorial.
	 *           
	 * @return n! �s el resultat del factorial de n
	 */
	public static double factorial(double n) {
		if (n == 0)
			return 1;
		else {
			double resultat = n * factorial(n - 1);
			return resultat;
		}
	}
	
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		int f=0;
		System.out.println("Introdueix un n�mero del 0 al 170: ");
		f = scan.nextInt();
		System.out.println("El factorial de "+f+" �s: "+factorial(f));
	}

}
